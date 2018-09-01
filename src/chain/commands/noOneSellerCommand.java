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
public class noOneSellerCommand implements Command{

    @Override
    public boolean execute(Context cntxt) throws Exception {
        System.out.println("Nadie vende lo que solicita");
        return true;
    }
    
}
