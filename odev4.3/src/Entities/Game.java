package Entities;

public class Game {

	private String nameOfTheGame;
	private int idOfTheGame;
	private int price;

	public Game() {
	};

	public Game(String nameOfTheGame, int idOfTheGame, int price) {
		super();
		this.nameOfTheGame = nameOfTheGame;
		this.idOfTheGame = idOfTheGame;
		this.price = price;
	}

	public String getNameOfTheGame() {
		return nameOfTheGame;
	}

	public void setNameOfTheGame(String nameOfTheGame) {
		this.nameOfTheGame = nameOfTheGame;
	}

	public int getIdOfTheGame() {
		return idOfTheGame;
	}

	public void setIdOfTheGame(int idOfTheGame) {
		this.idOfTheGame = idOfTheGame;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
