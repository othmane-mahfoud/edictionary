package ma.aui.sse.csc3327.dictionary.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ma.aui.sse.csc3327.dictionary.model.entities.Definition;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T18:08:43")
@StaticMetamodel(History.class)
public class History_ { 

    public static volatile SingularAttribute<History, Integer> historyId;
    public static volatile CollectionAttribute<History, Definition> definitionCollection;
    public static volatile SingularAttribute<History, Date> startTime;

}