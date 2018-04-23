package Model;

import Model.PackservicesServices;
import Model.PacksservicesRequestprice;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(Packservices.class)
public class Packservices_ { 

    public static volatile SingularAttribute<Packservices, BigInteger> price;
    public static volatile SingularAttribute<Packservices, String> name;
    public static volatile SingularAttribute<Packservices, BigDecimal> id;
    public static volatile CollectionAttribute<Packservices, PackservicesServices> packservicesServicesCollection;
    public static volatile CollectionAttribute<Packservices, PacksservicesRequestprice> packsservicesRequestpriceCollection;

}