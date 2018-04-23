package Model;

import Model.Client;
import Model.Requestprice;
import Model.Requestviewtechnical;
import Model.RolesUsers;
import Model.UsersPersonalData;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> rut;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Client> clientId;
    public static volatile SingularAttribute<Users, String> names;
    public static volatile CollectionAttribute<Users, Requestprice> requestpriceCollection;
    public static volatile CollectionAttribute<Users, Requestviewtechnical> requestviewtechnicalCollection1;
    public static volatile SingularAttribute<Users, String> lastNames;
    public static volatile SingularAttribute<Users, BigDecimal> id;
    public static volatile CollectionAttribute<Users, Requestviewtechnical> requestviewtechnicalCollection;
    public static volatile SingularAttribute<Users, RolesUsers> rolesUsersId;
    public static volatile CollectionAttribute<Users, Requestprice> requestpriceCollection1;
    public static volatile SingularAttribute<Users, UsersPersonalData> usersPersonalDataId;

}