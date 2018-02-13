/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.aui.sse.csc3327.dictionary.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Othmane
 */
@Entity
@Table(name = "Definition")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Definition.findAll", query = "SELECT d FROM Definition d")
    , @NamedQuery(name = "Definition.findById", query = "SELECT d FROM Definition d WHERE d.id = :id")
    , @NamedQuery(name = "Definition.findByWord", query = "SELECT d FROM Definition d WHERE d.word = :word")
    , @NamedQuery(name = "Definition.findByDefinition", query = "SELECT d FROM Definition d WHERE d.definition = :definition")})
public class Definition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "word")
    private String word;
    @Size(max = 10000)
    @Column(name = "definition")
    private String definition;
    @JoinColumn(name = "history_id", referencedColumnName = "history_id")
    @ManyToOne
    private History historyId;

    public Definition() {
    }

    public Definition(Integer id) {
        this.id = id;
    }

    public Definition(Integer id, String word) {
        this.id = id;
        this.word = word;
    }

    public Definition(String word) {
        this.word = word;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public History getHistoryId() {
        return historyId;
    }

    public void setHistoryId(History historyId) {
        this.historyId = historyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Definition)) {
            return false;
        }
        Definition other = (Definition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return word + " : " + definition;
    }

}
