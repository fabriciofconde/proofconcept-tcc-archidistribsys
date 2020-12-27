package br.com.ffc.puc.tcc.devapi.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="id")
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "repositories")
public class Repository implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "keyRepository", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "keyRepository", sequenceName = "sq_repositories", allocationSize = 1)
    @Getter private Integer id;

    @Column(name="developer_id", nullable=false, updatable=false, insertable=false)
    @Getter private Integer developerId;

    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    @JoinColumn(name="developer_id", referencedColumnName="id", nullable=false)
    @Setter private Developer developer;

    @Getter @Setter private String name;

    @Getter @Setter private String description;

    @NotNull
    @Getter @Setter private LocalDateTime updatedAt;

    @NotNull
    @Column(nullable = false)
    @Getter @Setter private Boolean fork;

    @Getter @Setter private Integer size;

    @NotNull
    @Column(nullable = false)
    @Getter @Setter private Integer forks;

    @NotNull
    @Column(nullable = false)
    @Getter @Setter private Integer watchers;

}
