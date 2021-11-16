package controller;

import java.util.ArrayList;
import java.util.List;

import model.Dice;
import model.Player;
import model.Property;
import model.Square;
import view.Board;

public class GAME_CONTROLLER {
	
	//game round counter
	private int round = 0;




	
	//method to start game
	public void gameStart(int numOfPlayer) {


		//create board
		Board board = new Board();
		board.createBoard();
		Property property;
		List<Square> squareList = board.getSquareList();

		//create dice
		Dice dice = new Dice();


		int postion;
		
		
		//create player
		List<Player> playerList = new ArrayList<>();

		for (int i = 0; i < numOfPlayer; i++) {
			
			playerList.add(i, new Player(numOfPlayer));
		
		}
		
		
		//Round start, max 100 rounds
		for(int i = 0; i < 100; i++) {

			for (Player player: playerList){
				board.printBoard();
				postion = (player.getCurrentPosNo()+dice.getResult())%20;
				player.setCurrentPosNo(postion);

				if(!squareList.get(postion).getType().equals("Property")){
					player.setCurrentPos(squareList.get(postion).getType());
					switch (squareList.get(postion).getType()){
						case "Go":

					}
				}else{
					property =(Property) squareList.get(postion);
					player.setCurrentPos(property.getName());
					property.defaultAsking(player.getPlayerNum());
				}
				squareList.get(postion).setPlayerHere(player.getPlayerNum());

				for (Player player1: playerList){
					System.out.println();
				}




			}





			
			
		}
		
		
		
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	public int getRound() {
		return round;
	}


	public void setRound(int round) {
		this.round = round;
	}
	
	
	
	
	
	
	

}
