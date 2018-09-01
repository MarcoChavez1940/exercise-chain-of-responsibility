/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 *
 * @author marco
 */
public class Chain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Chain chain = new Chain();
        chain.testChain();
    }
    
    public void testChain() throws Exception{
        Context context = new fruitContext();
        context.put("fruitRequest", "banana");
        
        Catalog catalog = new fruitCatalog();
        
        Command fruitChain = catalog.getCommand("fruitChain");
        
        fruitChain.execute(context);
    }
}
