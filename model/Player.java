package model;

public class Player {
	
	//money player has
	private int money;
	
	//Property own by player
	private  String[] property;
		
	//current position of player
	private String currentPos;
	private int currentPosNo;
	
	private int playerNum; 
	
	
	//constructor for new game
	public Player(int playerNum) {
		
		
		setMoney(1500);
		setCurrentPos("Go");
		setCurrentPosNo(1);
		setPlayerNum(playerNum);
		
	}
	
	
	//constructor for load game
	public Player(int money, String currentPos, int playerNum) {
		
		
		setMoney(money);
		setCurrentPos(currentPos);
		setPlayerNum(playerNum);
		
	}
	
	
	


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public String getCurrentPos() {
		return currentPos;
	}


	public void setCurrentPos(String currentPos) {
		this.currentPos = currentPos;
	}

	public void setCurrentPosNo(int currentPosNo) {
		this.currentPosNo = currentPosNo;
	}

	public int getCurrentPosNo(){return currentPosNo;}


	public int getPlayerNum() {
		return playerNum;
	}


	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}


	public String[] getProperty() {
		return property;
	}


	public void setProperty(String[] property) {
		this.property = property;
	}
	
	

}
