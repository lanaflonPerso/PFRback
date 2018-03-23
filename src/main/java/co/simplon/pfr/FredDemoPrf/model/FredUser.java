package co.simplon.pfr.FredDemoPrf.model;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "fred_user")
@EntityListeners(AuditingEntityListener.class)
public class FredUser implements Serializable {

	private static final long serialVersionUID = -839902690880275078L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^\\w+$")
	private String username;

	@JsonIgnore
	@NotBlank
	private String password;

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^(\\w||\\.)+@\\w+\\.\\w+$")
	private String email;

    @OneToMany(mappedBy= "")
    private Set<FredCase> fredCase;
}
