package br.com.ffc.puc.tcc.devapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @author fabricio
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class UserGithubApiDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@JsonProperty("login")
	private String username;
	
	@JsonProperty("avatar_url")
	private String avatarUrl;
	
	private String name;
	
	private String company;
	
	private String location;
	
	private String email;
	
	private String bio;
	
	@JsonProperty("twitter_username")
	private String twitterUsername;
	
	@JsonProperty("public_repos")
	private Integer publicRepository;
	
	private Integer followers;
	
	private Integer following;

	@JsonProperty("created_at")
	private LocalDateTime githubMemberSince;

}
