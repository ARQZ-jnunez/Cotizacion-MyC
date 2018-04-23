package Model;

import Model.Users;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(RolesUsers.class)
public class RolesUsers_ { 

    public static volatile SingularAttribute<RolesUsers, String> name;
    public static volatile SingularAttribute<RolesUsers, BigDecimal> id;
    public static volatile CollectionAttribute<RolesUsers, Users> usersCollection;

}