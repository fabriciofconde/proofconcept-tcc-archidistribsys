package br.com.ffc.puc.tcc.devapi.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author fabricio
 *
 */
@NoArgsConstructor @AllArgsConstructor
@ToString(exclude="id")
@EqualsAndHashCode(of = {"username"})
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "developers")
public class Developer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "keyDeveloper", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "keyDeveloper", sequenceName = "sq_developers", allocationSize = 1)
	@Getter private Integer id;

	@OneToMany(mappedBy = "developer", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private Set<Repository> repositories = new HashSet<>();
	
	@NotNull
	@Column(nullable = false, length = 100, unique = true, updatable = false)
	@Getter @Setter private String username;
	
	@Getter @Setter private String avatarUrl;
	
	@NotNull
	@Column(nullable = false)
	@Getter @Setter private String name;
	
	@Getter @Setter private String company;
	
	@Getter @Setter private String location;
	
	@Getter @Setter private String email;
	
	@Column(length = 4000)
	@Getter @Setter private String bio;
	
	@Getter @Setter private String twitterUsername;
	
	@Getter @Setter private Integer publicRepository;
	
	@Getter @Setter private Integer followers;
	
	@Getter @Setter private Integer following;

	@Getter @Setter private LocalDateTime githubMemberSince;
	
	@NotNull
	@Column(nullable = false, updatable = false)
	@CreatedDate
	@Getter private LocalDateTime createdAt;

    @NotNull
    @Column(nullable = false)
    @LastModifiedDate
    @Getter private LocalDateTime editedAt;
	
}
