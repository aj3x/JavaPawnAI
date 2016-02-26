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
public class PawnGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        
        int bStartRow = 2;
        int wStartRow = 4;
        
        Board b = new Board(x,y);
        b.Initialize(bStartRow, wStartRow);
        System.out.println(b.toString());
        
        
    }
    
}
