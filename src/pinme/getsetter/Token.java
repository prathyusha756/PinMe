package pinme.getsetter;

import java.util.Date;
import java.util.Random;

public class Token {
	private int tokenId;
	private int eventId;
	private int userID;
	private Date dateAndTime;

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public int generateToken() {
		Random rand = new Random();
		int n = rand.nextInt(1000) + 1;
		return n;
	}

	public int getTokenId() {
		return tokenId;
	}

	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}
