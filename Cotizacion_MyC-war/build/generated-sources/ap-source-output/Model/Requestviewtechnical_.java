package Model;

import Model.Requestprice;
import Model.Users;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(Requestviewtechnical.class)
public class Requestviewtechnical_ { 

    public static volatile SingularAttribute<Requestviewtechnical, Users> usersId2;
    public static volatile CollectionAttribute<Requestviewtechnical, Requestprice> requestpriceCollection;
    public static volatile SingularAttribute<Requestviewtechnical, Users> usersId;
    public static volatile SingularAttribute<Requestviewtechnical, BigDecimal> id;
    public static volatile SingularAttribute<Requestviewtechnical, Date> viewAt;
    public static volatile SingularAttribute<Requestviewtechnical, String> descriptionProblem;
    public static volatile SingularAttribute<Requestviewtechnical, String> status;

}