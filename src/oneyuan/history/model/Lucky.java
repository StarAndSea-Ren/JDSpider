package oneyuan.history.model;

public class Lucky {
	private Long id;
	private Integer turnNo;
	private String userName;
	private Integer buyCount;
	private String winTime;
	private String buyTime;
	private Integer luckyNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTurnNo() {
		return turnNo;
	}

	public void setTurnNo(Integer turnNo) {
		this.turnNo = turnNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}

	public String getWinTime() {
		return winTime;
	}

	public void setWinTime(String winTime) {
		this.winTime = winTime;
	}

	public String getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}

	public Integer getLuckyNo() {
		return luckyNo;
	}

	public void setLuckyNo(Integer luckyNo) {
		this.luckyNo = luckyNo;
	}

	@Override
	public String toString() {
		return id + "," + turnNo + ",'" + userName + "'," + buyCount + ",'"
				+ winTime + "','" + buyTime + "'," + luckyNo;
	}
}
