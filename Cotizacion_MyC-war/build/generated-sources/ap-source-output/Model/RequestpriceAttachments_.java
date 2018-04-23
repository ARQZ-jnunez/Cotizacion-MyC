package Model;

import Model.Requestprice;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(RequestpriceAttachments.class)
public class RequestpriceAttachments_ { 

    public static volatile SingularAttribute<RequestpriceAttachments, String> path;
    public static volatile SingularAttribute<RequestpriceAttachments, Date> createdAt;
    public static volatile SingularAttribute<RequestpriceAttachments, String> fileName;
    public static volatile SingularAttribute<RequestpriceAttachments, BigInteger> size;
    public static volatile SingularAttribute<RequestpriceAttachments, String> formatFile;
    public static volatile SingularAttribute<RequestpriceAttachments, BigInteger> downloads;
    public static volatile SingularAttribute<RequestpriceAttachments, Requestprice> requestpriceId;
    public static volatile SingularAttribute<RequestpriceAttachments, BigDecimal> id;
    public static volatile SingularAttribute<RequestpriceAttachments, Date> updatedAt;

}