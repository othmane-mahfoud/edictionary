/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.csc3327.dictionary.model.services.pojos;

import ma.aui.sse.csc3327.dictionary.model.entities.History;

/**
 *
 * @author apple
 */

public interface DictionaryService {
    public String define(String word);
    public String match(String word, String strategy);
    public History getHistory();
}
