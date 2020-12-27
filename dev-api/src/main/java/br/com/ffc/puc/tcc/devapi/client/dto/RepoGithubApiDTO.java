package br.com.ffc.puc.tcc.devapi.client.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 
 * @author fabricio
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RepoGithubApiDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	@JsonProperty("updated_at")
	private LocalDateTime updatedAt;

	private Boolean fork;

	private Integer size;

	private Integer forks;

	private Integer watchers;

}
