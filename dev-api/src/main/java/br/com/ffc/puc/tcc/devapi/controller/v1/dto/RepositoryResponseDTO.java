package br.com.ffc.puc.tcc.devapi.controller.v1.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @author fabricio
 *
 */
@Data
public class RepositoryResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer developerId;

    private String name;

    private String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime updatedAt;

    private Boolean fork;

    private Integer size;

    private Integer forks;

    private Integer watchers;

}
