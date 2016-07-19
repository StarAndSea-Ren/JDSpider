package oneyuan.history.model;

public class Product {

	private Long id;
	private Integer forecast;
	private String name;
	private String url;
	private Integer turnCount;

	public Product(Long id, Integer forecast, String name, String url,
			Integer turnCount) {
		super();
		this.id = id;
		this.forecast = forecast;
		this.name = name;
		this.url = url;
		this.turnCount = turnCount;
	}
	
	public Product(String id, String forecast, String name, String url,
			String turnCount){
		this.id = Long.valueOf(id);
		this.forecast = Integer.valueOf(forecast);
		this.name = name;
		this.url = url;
		this.turnCount = Integer.valueOf(turnCount);
	}

	public Product() {

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getForecast() {
		return forecast;
	}

	public void setForecast(Integer forecast) {
		this.forecast = forecast;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTurnCount() {
		return turnCount;
	}

	public void setTurnCount(Integer turnCount) {
		this.turnCount = turnCount;
	}

	@Override
	public String toString() {
		return id + "," + forecast + ",'" + name + "','" + url + "'," + turnCount;
	}

}
