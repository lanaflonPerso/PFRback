package co.simplon.pfr.FredDemoPrf.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FredUser.class)
public abstract class FredUser_ {

	public static volatile SingularAttribute<FredUser, String> password;
	public static volatile SetAttribute<FredUser, FredCase> fredCase;
	public static volatile SingularAttribute<FredUser, Long> id;
	public static volatile SingularAttribute<FredUser, String> email;
	public static volatile SingularAttribute<FredUser, String> username;

}

