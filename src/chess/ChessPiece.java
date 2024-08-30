/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import boardgame.Board;
import boardgame.Piece;

/**
 *
 * @author JonOliver
 */
public abstract class ChessPiece extends Piece {
    
    private Color color;
    
    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
}
