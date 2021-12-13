public class Main {

	public static void main(String[] args) {

		boolean playing = true;
		
		Board.setPlayerChoice();
		Board.setComputerChoice();

		if(Board.firstMove()) 
		{
			System.out.println("Player is First");
			while(playing) {
				Board.checkWin();
				
				Board.boardDisplay();
				Board.setMove();	
				Board.boardDisplay();
				Board.checkWin();
				Board.setComputerMove();
				Board.boardDisplay();
				Board.checkWin();
			}
		}
		else 
		{
			System.out.println("Computer is First");
			while(playing) {
				Board.checkWin();
				

				Board.setComputerMove();
				Board.boardDisplay();
				Board.checkWin();
				Board.setMove();
				Board.boardDisplay();
				Board.checkWin();
			}
		}

	}

}
