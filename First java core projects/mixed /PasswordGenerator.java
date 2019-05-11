import java.util.Random;


public class PasswordGenerator 
{
	public static void main(String[] args) 
	{
		char[][] board = new char[10][10];
		FillBoard(board);
		
		Random r = new Random();
		int row = r.nextInt(board.length);
		int col = r.nextInt(board.length);
		int move = 1;
		String total = board[row][col] + "";
		
		while(true)
		{
			PrintBoard(board, row, col);
			if(row == 0 || row == board.length - 1 || col == 0 || col == board.length - 1)
			{
				break;
			}
			
			int rMove = r.nextInt(3) - 1;
			int cMove = r.nextInt(3) - 1;
			move++;
			row += rMove;
			col += cMove;
			
			total += board[row][col] + "";
		}
		System.out.println("hit the wall");
		System.out.println("the generated password is: " + total);
		System.out.println("the password has " + move + " letters");
		
	}
	
	public static void PrintBoard(char[][] board, int r, int c)
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
	
	public static void FillBoard(char[][] letters)
	{
		Random r = new Random();
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				letters[i][j] = (char)(r.nextInt(26) + 65);//0 ,26 + 65 = [65,91)
			}
		}
	}
}
