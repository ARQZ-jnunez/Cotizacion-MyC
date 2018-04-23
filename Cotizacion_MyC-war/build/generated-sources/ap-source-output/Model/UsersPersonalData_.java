package Model;

import Model.Users;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(UsersPersonalData.class)
public class UsersPersonalData_ { 

    public static volatile SingularAttribute<UsersPersonalData, String> phone;
    public static volatile SingularAttribute<UsersPersonalData, String> location;
    public static volatile SingularAttribute<UsersPersonalData, Date> bornDate;
    public static volatile SingularAttribute<UsersPersonalData, BigDecimal> id;
    public static volatile CollectionAttribute<UsersPersonalData, Users> usersCollection;
    public static volatile SingularAttribute<UsersPersonalData, String> email;

}