/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

import chain.commands.pearSellerCommand;
import chain.commands.appleSellerCommand;
import chain.commands.bananaSellerFilter;
import chain.commands.noOneSellerCommand;
import chain.commands.orangeSellerCommand;
import org.apache.commons.chain.impl.ChainBase;

/**
 *
 * @author marco
 */
public class fruitChain extends ChainBase{
    
    public fruitChain(){
        super();
        addCommand(new appleSellerCommand());
        addCommand(new pearSellerCommand());
        addCommand(new orangeSellerCommand());
        addCommand(new bananaSellerFilter());
        addCommand(new noOneSellerCommand());
    }
    
}
