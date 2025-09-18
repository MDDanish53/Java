public class SudokuSolver {

  public static boolean isSafe(char board[][], int row, int col, int number) {
    // X and Y axis check
    for(int i = 0; i < board.length; i++) {
      // Y - vertical check
      if(board[i][col] == (char)(number + '0')) {
        return false;
      }
      // X - horizontal check
      if(board[row][i] == (char)(number + '0')) {
        return false;
      }
    }

    // Grid Check
    // Getting the starting cell of each grid
    int sr = (row / 3) * 3;
    int sc = (col / 3) * 3;

    // Checking if the provided number exists in grid or not
    for(int i = sr; i < sr + 3; i++) {
      for(int j = sc; j < sc + 3; j++) {
        if(board[i][j] == (char)(number + '0')) {
          return false;
        }
      }
    }

    return true;
  }

  public static boolean helper(char board[][], int row, int col) {
    if(row == board.length) {
      return true;
    }

    // new row and col for moving to further cells through recursion
    int nrow = 0;
    int ncol = 0;

    // moving to further cells on the sudoku board
    if(col != board.length - 1) {
      nrow = row;
      ncol = col + 1;
    } else {
      nrow = row + 1;
      ncol = 0;
    }

    // checking if a cell contains a number or not
    // if contains then move to the next cell recursively
    if(board[row][col] != '.') {
      if(helper(board, nrow, ncol)) {
        return true;
      }
      // otherwise add a number from 1 to 9 according to the isSafe function
    } else {
      for(int i = 1; i <= 9; i++) {
        // if safe then add the number in the cell and check for the further cells
        if(isSafe(board, row, col, i)) {
          board[row][col] = (char)(i + '0');
          if(helper(board, nrow, ncol)) {
            return true;
            // otherwise do not add the number in the cell
          } else {
            board[row][col] = '.';
          }
        }
      }
    }
    return false;
  }

  public static void solveSudoku(char board[][]) {
    // final result that sudoku is solved or not
    boolean result = helper(board, 0, 0);
    System.out.println("result = "+result);
    // Printing the solved sudoku board
    for(char row[]: board) {
      for(char cell: row) {
        System.out.print(cell + " ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]) {
    // input of sudoku board
    char[][] board = {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
};
  solveSudoku(board);
  }
}
