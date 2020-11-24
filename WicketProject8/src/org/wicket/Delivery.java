package org.wicket;

public class Delivery {
	private String wicketType, playerName, bowlerName;
	private Long over, ball;

	public Delivery(String wicketType, String playerName, String bowlerName, Long over, Long ball) {
		super();
		this.wicketType = wicketType;
		this.playerName = playerName;
		this.bowlerName = bowlerName;
		this.over = over;
		this.ball = ball;
	}

	public Delivery() {
		// TODO Auto-generated constructor stub
	}

	public String getWicketType() {
		return wicketType;
	}

	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getBowlerName() {
		return bowlerName;
	}

	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	public Long getOver() {
		return over;
	}

	public void setOver(Long over) {
		this.over = over;
	}

	public Long getBall() {
		return ball;
	}

	public void setBall(Long ball) {
		this.ball = ball;
	}

}
