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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
public class FredCase {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column
	@NotBlank
    private String name;

    @Column
    private String description;
    
//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            })
//    @JoinTable(name = "fred_case_user",
//            joinColumns = { @JoinColumn(name = "fred_case_id") },
//            inverseJoinColumns = { @JoinColumn(name = "fred_user_id") })
//    private Set<FredUser> fredUser = new HashSet<> ();

}
