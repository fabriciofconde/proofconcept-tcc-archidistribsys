package br.com.ffc.puc.tcc.devapi.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 *
 */
@SuppressWarnings("rawtypes")
public final class ObjectMapperUtil {

    private static final ModelMapper modelMapper;

    /**
     * Model mapper property setting are specified in the following block.
     * Default property matching strategy is set to Strict see {@link MatchingStrategies}
     * Custom mappings are added using {@link ModelMapper#addMappings(PropertyMap)}
     */
    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.createTypeMap(Optional.class, Optional.class).setConverter(
            new ConditionalConverter<Optional, Optional>() {
                @Override
                public MatchResult match(Class<?> sourceType, Class<?> destinationType) {
                    if (Optional.class.isAssignableFrom(destinationType)) {
                        return MatchResult.FULL;
                    } else {
                        return MatchResult.NONE;
                    }
                }

                private Class<?> getElementType(MappingContext<Optional, Optional> context) {
                    Mapping mapping = context.getMapping();
                    if (mapping instanceof PropertyMapping) {
                        PropertyInfo destInfo = ((PropertyMapping) mapping).getLastDestinationProperty();
                        Class<?> elementType = TypeResolver.resolveRawArgument(destInfo.getGenericType(),
                                destInfo.getInitialType());
                        return elementType == TypeResolver.Unknown.class ? Object.class : elementType;
                    } else if (context.getGenericDestinationType() instanceof ParameterizedType) {
                        return Types.rawTypeFor(((ParameterizedType) context.getGenericDestinationType()).getActualTypeArguments()[0]);
                    }

                    return Object.class;
                }

                @Override
                public Optional convert(MappingContext<Optional, Optional> context) {
                    Class<?> optionalType = getElementType(context);
                    Optional source = context.getSource();
                    Object dest = null;
                    if (source != null && source.isPresent()) {
                        MappingContext<?, ?> optionalContext = context.create(source.get(), optionalType);
                        dest = context.getMappingEngine().map(optionalContext);
                    }

                    return Optional.ofNullable(dest);
                }
            }
        );
    }

    /**
     * Hide from public usage.
     */
    private ObjectMapperUtil() {
    }

    /**
     *
     * @param entity
     * @param outClass
     * @param <D>
     * @param <T>
     * @return
     */
    public static <D, T> D map(final T entity, Class<D> outClass) {
    	if (entity == null) {
    		return null;
    	}
        return modelMapper.map(entity, outClass);
    }

    /**
     *
     * @param entity
     * @param outClass
     * @param <D>
     * @param <T>
     * @return
     */
    public static <D, T> Optional<D> mapOptional(final T entity, Type destinationType) {
    	if (entity == null) {
    		return Optional.empty();
    	}
        return modelMapper.map(entity, destinationType);
    }

    /**
     *
     * @param entityList
     * @param outCLass
     * @param <D>
     * @param <T>
     * @return
     */
    public static <D, T> List<D> mapAll(final Collection<T> entityList, Class<D> outCLass) {
    	if (entityList == null) {
    		return null;
    	}
    	
        return entityList.stream()
                .map(entity -> map(entity, outCLass))
                .collect(Collectors.toList());
    }

    /**
     *
     * @param entityIterable
     * @param outCLass
     * @param <D>
     * @param <T>
     * @return
     */
    public static <D, T> Iterable<D> mapAll(final Iterable<T> entityIterable, Class<D> outCLass) {
    	if (entityIterable == null) {
    		return null;
    	}
    	
    	return StreamSupport.stream(entityIterable.spliterator(), false)
                .map(entity -> map(entity, outCLass))
                .collect(Collectors.toList());
    }

}
