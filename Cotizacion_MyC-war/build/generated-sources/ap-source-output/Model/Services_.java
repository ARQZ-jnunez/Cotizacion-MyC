package Model;

import Model.PackservicesServices;
import Model.RequestpriceServices;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(Services.class)
public class Services_ { 

    public static volatile SingularAttribute<Services, BigInteger> price;
    public static volatile CollectionAttribute<Services, RequestpriceServices> requestpriceServicesCollection;
    public static volatile SingularAttribute<Services, String> name;
    public static volatile SingularAttribute<Services, String> description;
    public static volatile SingularAttribute<Services, BigDecimal> id;
    public static volatile CollectionAttribute<Services, PackservicesServices> packservicesServicesCollection;

}