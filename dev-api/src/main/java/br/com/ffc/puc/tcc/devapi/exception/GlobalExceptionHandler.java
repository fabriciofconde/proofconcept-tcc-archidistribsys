package br.com.ffc.puc.tcc.devapi.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import feign.FeignException;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author fabricio
 *
 */
@Slf4j
@RestControllerAdvice
public final class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Provides handling for standard Spring Rest exceptions.
     * @param ex the target exception
     * @param request the current request
     */
    @ExceptionHandler({
            FeignException.NotFound.class,
            ResourceNotFoundException.class
    })
    public ResponseEntity<ApiErrorDTO> handleNotFound(Exception ex, WebRequest request) {
        return new ResponseEntity<>(new ApiErrorDTO(HttpStatus.NOT_FOUND, request, ex), HttpStatus.NOT_FOUND);
    }

    /**
     * Provides handling for standard Spring Rest exceptions.
     * @param ex the target exception
     * @param request the current request
     */
    @ExceptionHandler(ResourceAlreadyExistsException.class)
    public ResponseEntity<ApiErrorDTO> handleAlreadyExistsE(Exception ex, WebRequest request) {
        return new ResponseEntity<>(new ApiErrorDTO(HttpStatus.CONFLICT, request, ex), HttpStatus.CONFLICT);
    }

    /**
     * Provides handling for standard Spring Rest exceptions e print log error.
     * @param ex the target exception
     * @param request the current request
     */
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<ApiErrorDTO> handleError(Throwable ex, WebRequest request) {
        log.error(ex.getMessage(), ex);
        return new ResponseEntity<>(new ApiErrorDTO(HttpStatus.INTERNAL_SERVER_ERROR, request, ex), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     *
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private class ApiErrorDTO implements Serializable {

		private static final long serialVersionUID = 1L;

		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        @Getter
        private LocalDateTime timestamp;

        @Getter private int status;

        @Getter private String error;

        @Getter private String message;

        @Getter private String trace;

        @Getter private String path;


        /**
         *
         * @param status
         * @param request
         */
        public ApiErrorDTO(HttpStatus status, WebRequest request) {
            this.timestamp = LocalDateTime.now();
            this.status = status.value();
            this.error = status.getReasonPhrase();
            this.path = ((ServletWebRequest) request).getRequest().getRequestURI();
        }

        /**
         *
         * @param status
         * @param request
         * @param ex
         */
        public ApiErrorDTO(HttpStatus status, WebRequest request, Throwable ex) {
            this(status, request);
            this.message = ex.getMessage();
            this.trace = ExceptionUtils.getStackTrace(ex);
        }

    }

}
