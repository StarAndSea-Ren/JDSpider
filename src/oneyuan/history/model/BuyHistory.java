package oneyuan.history.model;

public class BuyHistory {
	private Long id;
	private Integer turnNo;
	private String userName;
	private String userAddr;
	private Integer buyCount;
	private String buyTime;

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

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public Integer getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}

	public String getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}

	@Override
	public String toString() {
		return id + "," + turnNo + ",'" + userName + "','" + userAddr + "',"
				+ buyCount + ",'" + buyTime + "'";
	}

}
