/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

import org.apache.commons.chain.impl.ContextBase;

/**
 *
 * @author marco
 */
public class fruitContext extends ContextBase{
    
    String fruitRequest;

    public String getFruitRequest() {
        return fruitRequest;
    }

    public void setFruitRequest(String fruitRequest) {
        this.fruitRequest = fruitRequest;
    }
    
    
    
}
