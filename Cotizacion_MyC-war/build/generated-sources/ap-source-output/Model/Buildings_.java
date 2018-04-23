package Model;

import Model.BuildingsPK;
import Model.Client;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T13:36:47")
@StaticMetamodel(Buildings.class)
public class Buildings_ { 

    public static volatile SingularAttribute<Buildings, BuildingsPK> buildingsPK;
    public static volatile SingularAttribute<Buildings, Client> client;
    public static volatile SingularAttribute<Buildings, String> location;

}