import java.util.Scanner;


public class MultiDimen3 
{
	public static void main(String[] args) 
	{
		String[][] board = new String[3][3];
		
		Initialize(board);
		PrintBoard(board);
		Play(board);
	}
	
	public static boolean hasMoreMovements(String[][] board)
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j] == "_")
					return true;
			}
		}
		System.out.println("No more valid movements. The game has finished");
		return false;
	}
	
	public static void Play(String[][] board)
	{
		Scanner sc = new Scanner(System.in);
		int move = 0;
		
		while(hasMoreMovements(board))
		{
			System.out.println("Enter the row #: ");
			int row = sc.nextInt();
			
			System.out.println("Enter the column #: ");
			int col = sc.nextInt();
			
			if(row >= board.length || col >= board.length)
			{
				System.out.println("incorrect input");
				continue;
			}
			
			if(!isEmpty(board, row, col))
			{
				System.out.println("the space not empty");
				continue;
			}
			
			if(move% 2 == 0) //even move -> put X's
				board[row][col] ="X";
			else
				board[row][col] ="O";
			
			PrintBoard(board);
			if(CheckWinner(board))
				break;
			System.out.println("-----------");
			move++;
		}
	}
	
	/*
	 * Write a method named CheckWinner
	 * which gets a String[][] board and checks
	 * if any rows or any columns or diagonally any
	 * directions contain all X's or O's.
	 * If there are any winners, return true. 
	 * Return false otherwise. 
	 */
	public static boolean CheckWinner(String[][] board)
	{
		return false;
	}
	
	public static boolean isEmpty(String[][] b, int r, int c)
	{
		if(b[r][c] == "_")
			return true;
		return false;
	}
	
	
	public static void PrintBoard(String[][] b)
	{
		for(int i = 0; i < b.length; i++) //b's row count
		{
			for(int j = 0; j < b[i].length; j++) //ith array's length
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void Initialize(String[][] b)
	{
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[i].length; j++)
			{
				b[i][j] = "_";
			}
		}
		/*
		b[0][0] = "-";
		b[0][1] = "-";
		b[0][2] = "-";
		

		b[1][0] = "-";
		b[1][1] = "-";
		b[1][2] = "-";
		

		b[2][0] = "-";
		b[2][1] = "-";
		b[2][2] = "-";
		*/
	}
}
