package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }
    public boolean checkRow(Character ch){
        Boolean result = false;
        for (int i=0; i< matrix.length;i++){
            if(this.matrix[i][0] == ch && this.matrix[i][1]==ch && this.matrix[i][2]==ch){
                result =  true;
            }
        }
        return result;
    }
    public boolean checkColumn(Character ch){
        Boolean result = false;
        for (int i=0; i<matrix.length; i++){
            if (this.matrix[0][i]==ch && this.matrix[1][i]==ch && this.matrix[2][i]==ch){
                result= true;
            }
        }
        return result;
    }
    public boolean checkDiagonal(Character ch){
        Boolean result = false;
        for (int i=0; i<matrix.length; i++){
            if (this.matrix[2][0]==ch && this.matrix[1][1]==ch && this.matrix[0][2]==ch){
                result= true;
            }
        }
        return result;
    }
    public boolean checkOtherDiagonal(Character ch){
        Boolean result = false;
        for (int i=0; i<matrix.length; i++){
            if (this.matrix[0][0]==ch && this.matrix[1][1]==ch && this.matrix[2][2]==ch){
                result= true;
            }
        }
        return result;
    }

    public Boolean isInFavorOfX() {
        return checkRow('X') || checkColumn('X') || checkDiagonal('X') || checkDiffDiagonal('X');
    }

    public Boolean isInFavorOfO() {
        return checkRow('O') || checkColumn('O') || checkDiagonal('O') || checkDiffDiagonal('O');
    }

    public Boolean isTie() {
        return isInFavorOfX() == isInFavorOfO();
    }

    public String getWinner() {
        if (isInFavorOfO()){
            return "O";
        } else if (isInFavorOfX()) {
            return "X";
        }else {
            return "";
        }

    }
}
