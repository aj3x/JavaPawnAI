/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pawngame;

/**
 *
 * @author AJ3X
 */
public class Pawn {
    boolean isWhite;
    
    public Pawn(boolean white){
        isWhite = white;
    }
    
    @Override
    public String toString(){
        if(isWhite)
            return "w";
        else
            return "b";
    }
}
