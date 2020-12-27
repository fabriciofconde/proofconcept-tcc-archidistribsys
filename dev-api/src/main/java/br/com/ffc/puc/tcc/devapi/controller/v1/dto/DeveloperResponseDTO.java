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
public class DeveloperResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String username;
	
	private String avatarUrl;
	
	private String name;
	
	private String company;
	
	private String location;
	
	private String email;
	
	private String bio;
	
	private String twitterUsername;
	
	private Integer publicRepository;
	
	private Integer followers;
	
	private Integer following;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	private LocalDateTime githubMemberSince;

}
