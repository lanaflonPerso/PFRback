package co.simplon.pfr.FredDemoPrf.model;

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
import javax.persistence.ManyToMany;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class FredUser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@NotBlank
	@Column(unique=true)
	@Pattern(regexp="^\\w+$")
	private String username;
	
	@JsonIgnore
	@NotBlank
	private String password;
	
	@NotBlank
	@Column(unique=true)
	@Pattern(regexp="^(\\w||\\.)+@\\w+\\.\\w+$")
	private String email;
	
//	@ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            },
//            mappedBy = "freduser")
//    @JsonBackReference // evite la récurcivite dans le JSON
//    private Set<FredCase> fredCase = new HashSet<> ();

}
