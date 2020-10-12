/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;

/**
 *
 * @author Issei
 */
public class Calculadora {
    
    public static void main(String[] args){
        
        
        try{
            ShuntingYard sy = new ShuntingYard("(3+4)*2-4");
            
            ArrayList<String> prefija = sy.getPrefija();
            
            for(String string : prefija){
                System.out.print(string+" ");
            }
        }catch(ParentesisAperturaException | ParentesisCierreException e){
            e.printStackTrace();
        
    }
    
    }
    
}
