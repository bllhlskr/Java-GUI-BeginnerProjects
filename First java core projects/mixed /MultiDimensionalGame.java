import java.util.Random;


public class MultiDimensionalGame 
{
	public static void main(String[] args) 
	{
		int[][] board = new int[10][10];
		for (int i = 0; i < board.length; i++) {
			ExamReview.FillArray(board[i]);
		}
		Random r = new Random();
		int row = r.nextInt(10);
		int col = r.nextInt(10);
		int move = 0;
		int total = board[row][col];
		
		while(true)
		{
			PrintBoard(board, row, col);
			if(row == 0 || row == 9 || col == 0 || col == 9)
			{
				break;
			}
			
			int rMove = r.nextInt(3) - 1;
			int cMove = r.nextInt(3) - 1;
			move++;
			row += rMove;
			col += cMove;
			
			total += board[row][col];
		}
		System.out.println("hit the wall");
		System.out.println("game finished with " + total + " points in "+move+" moves");
		
	}
	
	public static void PrintBoard(int[][] board, int r, int c)
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(i ==r && j == c)
					System.out.print("|" + board[i][j] + "|\t");
				else
					System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}
}
