/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain.commands;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.Filter;

/**
 *
 * @author marco
 */
public class bananaSellerFilter implements Filter{

    @Override
    public boolean postprocess(Context context, Exception exception) {
        System.out.println("A la vuelta puede conseguir buenos platanos");
        return false;
    }

    @Override
    public boolean execute(Context context) throws Exception {
        String fruit = (String) context.get("fruitRequest");
        if(fruit == "banana"){
            System.out.println("Aqui tiene un platano");
            return true;
        }
        return false;
    }
    
}
