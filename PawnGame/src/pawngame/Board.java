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
public class Board {
    int width,height;
    Pawn[][] board;
    public Board(int width, int height){
        board = new Pawn[width][height];
        this.width = width;
        this.height = height;
    }
    
    public void Initialize(int bRow,int wRow){
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                if(j==bRow){
                    board[i][j] = new Pawn(false);
                }else if(j==wRow){
                    board[i][j] = new Pawn(true);
                }else{
                    board[i][j] = null;
                }
            }
        }
    }
    
    
    
    public boolean hasPawn(int x,int y){
        if(board[x][y]==null)
            return false;
        else 
            return true;
    }
    
    public int getSpace(int x,int y){
        if(board[x][y]==null)
            return 0;
        if(board[x][y].isWhite)
            return 1;
        if(!board[x][y].isWhite)
            return 2;
        return -1;
    }
    
    
    
    
    @Override
    public String toString(){
        String str = "";
        for(int i=0;i<height;i++){
            str+="|";
            for(int j=0;j<width;j++){
                if(board[j][i]!=null)
                    str+=board[j][i];
                else
                    str+="_";
                str+="|";
            }
            str+="\n";
        }
        return str;
    }
}
