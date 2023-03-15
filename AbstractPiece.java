public abstract class AbstractPiece implements PieceInterface{
    private boolean isWhite;
    private int row;
    private int column;

    public AbstractPiece(int r, int c, boolean isWhite) {
        // complete this constructor
    }

    public boolean isWhitePiece() {
        return false;
    }

    public int getRow() {
        return 0;
    }

    public int getColumn() {
        return 0;
    }
}
