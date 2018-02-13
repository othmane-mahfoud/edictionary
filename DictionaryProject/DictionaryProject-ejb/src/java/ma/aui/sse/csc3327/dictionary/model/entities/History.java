/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.aui.sse.csc3327.dictionary.model.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Othmane
 */
@Entity
@Table(name = "History")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "History.findAll", query = "SELECT h FROM History h")
    , @NamedQuery(name = "History.findByHistoryId", query = "SELECT h FROM History h WHERE h.historyId = :historyId")
    , @NamedQuery(name = "History.findByStartTime", query = "SELECT h FROM History h WHERE h.startTime = :startTime")})
public class History implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "history_id")
    private Integer historyId;
    @Column(name = "start_time")
    @Temporal(TemporalType.DATE)
    private Date startTime;
    @OneToMany(mappedBy = "historyId")
    private Collection<Definition> definitionCollection;

    public History() {
    }

    public History(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @XmlTransient
    public Collection<Definition> getDefinitionCollection() {
        return definitionCollection;
    }

    public void setDefinitionCollection(Collection<Definition> definitionCollection) {
        this.definitionCollection = definitionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historyId != null ? historyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof History)) {
            return false;
        }
        History other = (History) object;
        if ((this.historyId == null && other.historyId != null) || (this.historyId != null && !this.historyId.equals(other.historyId))) {
            return false;
        }
        return true;
    }
    
    public void addDefinition(String word, String definition){
        Definition newDefinition = new Definition();
        newDefinition.setWord(word);
        newDefinition.setDefinition(definition);
        definitionCollection.add(newDefinition);
        newDefinition.setHistoryId(this);
    }

    @Override
    public String toString() {
        if(definitionCollection == null || definitionCollection.isEmpty())
            return "";
        StringBuffer sb = new StringBuffer();
        Object[] records = definitionCollection.toArray();
        sb.append(records[records.length - 1].toString());
        
        for(int i = records.length - 2; i >= 0; i--)
            sb.append(" | " + records[i].toString());
        return sb.toString();
    }

}
