/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.aui.sse.csc3327.dictionary.model.services.pojos;

import com.aonaware.services.webservices.Definition;
import com.aonaware.services.webservices.DictService;
import com.aonaware.services.webservices.DictServiceSoap;
import com.aonaware.services.webservices.DictionaryWord;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebService;
import ma.aui.sse.csc3327.dictionary.model.entities.History;

/**
 *
 * @author Othmane
 */
@WebService(serviceName = "DictService", portName = "DictServiceSoap", endpointInterface = "com.aonaware.services.webservices.DictServiceSoap", targetNamespace = "http://services.aonaware.com/webservices/", wsdlLocation = "META-INF/wsdl/NewWebServiceFromWSDL/services.aonaware.com/DictService/DictService.asmx.wsdl")
@Stateless
public class DictionaryServiceImpl implements DictionaryService{

    private DictServiceSoap DictionaryService = (new DictService()).getDictServiceSoap();  
    private List<Definition> definitionList;
    private List<DictionaryWord> matchList;
    private Iterator iterator;
    private History history;
    
    
    @Override
    public String define(String word){        
        definitionList = ((DictionaryService.define(word)).getDefinitions()).getDefinition();
        if (definitionList.isEmpty()){
            return "Sorry, we could not find a definition for: " + word;  
        }
        else{
            iterator = definitionList.listIterator();
            String definitions = "";
            while (iterator.hasNext()) 
                definitions += ((Definition) iterator.next()).getWordDefinition() + " - ";
            return definitions;
        }     

    }
    
    @Override
    public String match(String word, String strategy){
       
        matchList = (DictionaryService.match(word, strategy)).getDictionaryWord(); 
        if(matchList.isEmpty()){
            return "Sorry, we could not find a definition for " + word + " with the strategy " + strategy;
        }
        else{
            iterator = matchList.listIterator();
            String matches = "";
            while (iterator.hasNext())
                 matches += ((DictionaryWord) iterator.next()).getWord() + " - ";
            return matches;
        }
        
    }
    
    @Override
    public History getHistory(){
        return history;
    }
    
    
    
    public java.lang.String serverInfo() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.aonaware.services.webservices.ArrayOfDictionary dictionaryList() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.aonaware.services.webservices.ArrayOfDictionary dictionaryListExtended() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String dictionaryInfo(java.lang.String dictId) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.aonaware.services.webservices.WordDefinition defineInDict(java.lang.String dictId, java.lang.String word) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.aonaware.services.webservices.ArrayOfStrategy strategyList() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.aonaware.services.webservices.ArrayOfDictionaryWord matchInDict(java.lang.String dictId, java.lang.String word, java.lang.String strategy) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
