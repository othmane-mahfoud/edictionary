/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.aui.sse.csc3327.dictionary.controller.web;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.EJBAccessException;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ma.aui.sse.csc3327.dictionary.model.services.pojos.DictionaryService;

/**
 *
 * @author Othmane
 */

@Named(value = "dictionaryBean")
@ManagedBean
@SessionScoped
@DeclareRoles(value = {"Internal", "PoweredInternal"})
public class DictionaryBean implements Serializable{
    private String word;
    private String strategy;
    private String definitions;
    private String matches;
    
    @EJB
    private DictionaryService dictionaryServiceProxy;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getDefinitions() {
        return definitions;
    }

    public void setDefinitions(String definitions) {
        this.definitions = definitions;
    }

    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
        this.matches = matches;
    }

    public DictionaryService getDictionaryServiceProxy() {
        return dictionaryServiceProxy;
    }

    public void setDictionaryServiceProxy(DictionaryService dictionaryServiceProxy) {
        this.dictionaryServiceProxy = dictionaryServiceProxy;
    }
    
    public String define(){
        definitions = dictionaryServiceProxy.define(word);
        return "definition";
    }
    
    public String getHistory() {
        return dictionaryServiceProxy.getHistory().toString();
    }
    
    @RolesAllowed({"PoweredInternal"})
    public String match(){
        try{
            matches = dictionaryServiceProxy.match(word, strategy);
        }catch(EJBAccessException e){
            matches = "Sorry you need to be a Powered Internal to use this functionality";
        }
        return "match";
    }
      
}
