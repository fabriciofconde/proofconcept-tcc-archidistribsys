package br.com.ffc.puc.tcc.devapi.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.modelmapper.TypeToken;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.ffc.puc.tcc.devapi.controller.v1.dto.DeveloperResponseDTO;
import br.com.ffc.puc.tcc.devapi.model.Developer;
import br.com.ffc.puc.tcc.devapi.util.ObjectMapperUtil;

@SpringBootTest
public class ObjectMapperUtilTest extends BaseUtilTest {

    @Test
    public void testShouldConvertObject() {
        Developer developer = new Developer();
        developer.setUsername("fabriciofconde");
        developer.setGithubMemberSince(LocalDateTime.now());

        DeveloperResponseDTO dto = ObjectMapperUtil.map(developer, DeveloperResponseDTO.class);

        assertThat(dto).isNotNull();
        assertThat(developer.getUsername()).isEqualTo(dto.getUsername());
        assertThat(developer.getGithubMemberSince()).isEqualTo(dto.getGithubMemberSince());
    }

    @Test
    public void testShouldConvertOptionalObject() {
        Developer developer = new Developer();
        developer.setUsername("fabriciofconde");
        developer.setGithubMemberSince(LocalDateTime.now());
        Optional<Developer> optionalDeveloper = Optional.of(developer);

        Optional<DeveloperResponseDTO> optionalDTO = ObjectMapperUtil.mapOptional(optionalDeveloper, new TypeToken<Optional<DeveloperResponseDTO>>() {}.getType());

        assertThat(optionalDTO.isPresent()).isTrue();
        assertThat(developer.getUsername()).isEqualTo(optionalDTO.get().getUsername());
        assertThat(developer.getGithubMemberSince()).isEqualTo(optionalDTO.get().getGithubMemberSince());
    }

    @Test
    public void testShouldConvertListOfObject() {
        Developer developer = new Developer();
        developer.setUsername("fabriciofconde");
        developer.setGithubMemberSince(LocalDateTime.now());

        List<DeveloperResponseDTO> dtos = ObjectMapperUtil.mapAll(Collections.singletonList(developer), DeveloperResponseDTO.class);

        assertThat(dtos).isNotNull();
        assertThat(dtos.isEmpty()).isFalse();
        assertThat(developer.getUsername()).isEqualTo(dtos.get(0).getUsername());
        assertThat(developer.getGithubMemberSince()).isEqualTo(dtos.get(0).getGithubMemberSince());
    }
    
    @Test
    public void testShouldConvertObjectNull() {
        assertThat(ObjectMapperUtil.map(null, String.class)).isNull();
        
        Optional<String> test = ObjectMapperUtil.mapOptional(null, new TypeToken<Optional<String>>() {}.getType());
        assertThat(test.isEmpty()).isTrue();
        
        assertThat(ObjectMapperUtil.mapAll(null, String.class)).isNull();
    }

}
