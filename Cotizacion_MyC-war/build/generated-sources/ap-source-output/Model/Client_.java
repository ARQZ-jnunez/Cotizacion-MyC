package Model;

import Model.Buildings;
import Model.Users;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> name;
    public static volatile SingularAttribute<Client, BigDecimal> id;
    public static volatile CollectionAttribute<Client, Users> usersCollection;
    public static volatile CollectionAttribute<Client, Buildings> buildingsCollection;

}