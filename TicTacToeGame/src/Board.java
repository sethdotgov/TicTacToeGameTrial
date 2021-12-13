import java.util.Scanner;

public class Board {

	static String one = "1";
	static String two = "2";
	static String three = "3";
	static String four = "4";
	static String five = "5";
	static String six = "6";
	static String seven = "7";
	static String eight = "8";
	static String nine = "9";
	static String board = one + two + three + four + five + six + seven + eight + nine;

	public static void boardDisplay() 
	{
		System.out.println(" ");
		System.out.println(board.substring(0, 1) + " | " + board.substring(1, 2) + " | " + board.substring(2, 3));
		System.out.println("-   -   -");
		System.out.println(board.substring(3, 4) + " | " + board.substring(4, 5) + " | " + board.substring(5, 6));
		System.out.println("-   -   -");
		System.out.println(board.substring(6, 7) + " | " + board.substring(7, 8) + " | " + board.substring(8, 9));
		System.out.println(" ");

	}
	
	public static void checkWin()
	{
		String num1 = board.substring(0,1);
		String num2 = board.substring(1,2);
		String num3 = board.substring(2,3);
		String num4 = board.substring(3,4);
		String num5 = board.substring(4,5);
		String num6 = board.substring(5,6);
		String num7 = board.substring(6,7);
		String num8 = board.substring(7,8);
		String num9 = board.substring(8,9);
		
		if(num1.equals("X") && num2.equals("X") && num3.equals("X")) 
		{
			if(playerChoice.equals("x")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("o")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		
		if(num4.equals("X") && num5.equals("X") && num6.equals("X")) 
		{
			if(playerChoice.equals("x")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("o")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num7.equals("X") && num8.equals("X") && num9.equals("X")) 
		{
			if(playerChoice.equals("x")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("o"))
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num1.equals("X") && num4.equals("X") && num7.equals("X")) 
		{
			if(playerChoice.equals("x")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("o")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num2.equals("X") && num5.equals("X") && num8.equals("X")) 
		{
			if(playerChoice.equals("x")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("o")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num3.equals("X") && num6.equals("X") && num9.equals("X")) 
		{
			if(playerChoice.equals("x")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("o")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num1.equals("X") && num5.equals("X") && num9.equals("X")) 
		{
			if(playerChoice.equals("x")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("o")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num3.equals("X") && num5.equals("X") && num7.equals("X")) 
		{
			if(playerChoice.equals("x")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("o")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num1.equals("O") && num2.equals("O") && num3.equals("O")) 
		{
			if(playerChoice.equals("o")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("x")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		
		if(num4.equals("O") && num5.equals("O") && num6.equals("O")) 
		{
			if(playerChoice.equals("o")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("x")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num7.equals("O") && num8.equals("O") && num9.equals("O")) 
		{
			if(playerChoice.equals("o")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("x"))
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num1.equals("O") && num4.equals("O") && num7.equals("O")) 
		{
			if(playerChoice.equals("o")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("x")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num2.equals("O") && num5.equals("O") && num8.equals("O")) 
		{
			if(playerChoice.equals("o")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("x")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num3.equals("O") && num6.equals("O") && num9.equals("O")) 
		{
			if(playerChoice.equals("o")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("x")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num1.equals("O") && num5.equals("O") && num9.equals("O")) 
		{
			if(playerChoice.equals("o")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("x")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if(num3.equals("O") && num5.equals("O") && num7.equals("O")) 
		{
			if(playerChoice.equals("o")) 
			{
				System.out.println("You win!");
				System.exit(0);
			}
			if(playerChoice.equals("x")) 
			{
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		if((num1.equals("X") || num1.equals("O")) && (num2.equals("X") || num2.equals("O")) && (num3.equals("X") || num3.equals("O")) && (num4.equals("X") || num4.equals("O")) && (num5.equals("X") || num5.equals("O")) && (num6.equals("X") || num6.equals("O")) && (num7.equals("X") || num7.equals("O")) && (num8.equals("X") || num8.equals("O")) && (num9.equals("X") || num9.equals("O"))) 
		{
			System.out.println("Tie!");
			System.exit(0);
		}
	}
	
	public static boolean firstMove() 
	{
		int min = 1;
		int max = 2;
		int randNum = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		if(randNum == 1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	static String playerChoice = "";
	static String computerChoice = "";

	public static void setPlayerChoice() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X or O: ");
		String choice = sc.next();
		if(choice.equals("x") || choice.equals("X")) 
		{
			playerChoice = "x";
			System.out.println("player is x");
		}

		if(choice.equals("o") || choice.equals("O")) 
		{
			playerChoice = "o";
			System.out.println("player is o");
		} 
		if(!(choice.equals("o") || choice.equals("O") || (choice.equals("x") || choice.equals("X"))))
		{
			System.out.println("Not an option");
		}
	}

	public static void setMove() 
	{
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		String playerMove = sc.next();
		if(playerChoice == "x") 
		{
			if(board.contains(playerMove)) 
			{
				board = board.replace(playerMove, "X");
			}
			else 
			{
				System.out.println("Not availible");
			}
		}
		if(playerChoice == "o") 
		{
			if(board.contains(playerMove)) 
			{
				board = board.replace(playerMove, "O");
			}
			else 
			{
				System.out.println("Not availible");
			}
		}
	}
	public static void setComputerChoice() 
	{
		if(playerChoice.equals("x")) 
		{
			computerChoice = "o";
			System.out.println("computer is O");
		}
		if(playerChoice.equals("o")) 
		{
			computerChoice = "x";
			System.out.println("computer is x");
		}
	}
	public static void setComputerMove() 
	{
		boolean move = true;
		while(move) {
			int min = 1;
			int max = 9;
			int randNum = (int)Math.floor(Math.random()*(max-min+1)+min);
			String computerNum = String.valueOf(randNum);
			
			if(computerChoice.equals("x")) 
			{
				
				if(board.contains(computerNum)) 
				{
					board = board.replace(computerNum, "X");
					move = false;
				}
			}
			if(computerChoice.equals("o")) 
			{
				if(board.contains(computerNum)) 
				{
					board = board.replace(computerNum, "O");
					move = false;
				}
			}
		}
	}
}




