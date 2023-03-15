public interface PieceInterface {
    boolean isWhitePiece();

    int getRow();

    int getColumn();

    /**
     * true of the piece is able to move to the position (r, c)
     * otherwise false.  
     * 
     * This methods assumes the board is empty
     * 
     * @return
     */
    boolean canMove(int r, int c);
}