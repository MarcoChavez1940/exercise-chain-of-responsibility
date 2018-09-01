/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

import org.apache.commons.chain.impl.CatalogBase;

/**
 *
 * @author marco
 */
public class fruitCatalog extends CatalogBase{
    
    public fruitCatalog(){
        super();
        addCommand("fruitChain", new fruitChain());
    }
    
}
