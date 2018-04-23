package Model;

import Model.PacksservicesRequestprice;
import Model.RequestpriceAttachments;
import Model.RequestpriceServices;
import Model.Requestviewtechnical;
import Model.Users;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(Requestprice.class)
public class Requestprice_ { 

    public static volatile SingularAttribute<Requestprice, Date> createdAt;
    public static volatile SingularAttribute<Requestprice, String> recordProblem;
    public static volatile SingularAttribute<Requestprice, Users> usersId2;
    public static volatile SingularAttribute<Requestprice, Requestviewtechnical> requestviewtechnicalId;
    public static volatile CollectionAttribute<Requestprice, RequestpriceServices> requestpriceServicesCollection;
    public static volatile SingularAttribute<Requestprice, Users> usersId;
    public static volatile CollectionAttribute<Requestprice, RequestpriceAttachments> requestpriceAttachmentsCollection;
    public static volatile SingularAttribute<Requestprice, String> details;
    public static volatile SingularAttribute<Requestprice, BigDecimal> id;
    public static volatile CollectionAttribute<Requestprice, PacksservicesRequestprice> packsservicesRequestpriceCollection;
    public static volatile SingularAttribute<Requestprice, String> status;
    public static volatile SingularAttribute<Requestprice, Date> updatedAt;

}