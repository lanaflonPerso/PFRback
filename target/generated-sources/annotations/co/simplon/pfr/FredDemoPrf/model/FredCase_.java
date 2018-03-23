package co.simplon.pfr.FredDemoPrf.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FredCase.class)
public abstract class FredCase_ {

	public static volatile SetAttribute<FredCase, FredUser> fredUser;
	public static volatile SingularAttribute<FredCase, String> name;
	public static volatile SingularAttribute<FredCase, String> description;
	public static volatile SingularAttribute<FredCase, Long> id;

}

