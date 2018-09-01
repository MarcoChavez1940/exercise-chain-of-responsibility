/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 *
 * @author marco
 */
public class orangeSellerCommand implements Command{

    @Override
    public boolean execute(Context context) throws Exception {
        String fruit = (String) context.get("fruitRequest");
        if(fruit == "orange"){
            System.out.println("Aqui tiene una naranja");
            return true;
        }
        return false;
    }
    
}
