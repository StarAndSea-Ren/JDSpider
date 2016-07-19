package oneyuan.history;

import java.util.ArrayList;
import java.util.List;

import oneyuan.history.model.Product;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class ProdListProcessor implements PageProcessor {

	private Site site = Site.me().setRetryTimes(3).setSleepTime(0);
	private List<String> urls = new ArrayList<String>();
	private List<Product> products = new ArrayList<>();

	public ProdListProcessor() {
		for (int i = 2; i < 12; i++) {
			urls.add("https://1.jd.com/list/querylist?categoryId=-1&sortId=10&pageSize=20&pageIndex="
					+ i);
		}
	}

	public List<Product> getPros() {
		return products;
	}

	@Override
	public void process(Page page) {
		page.addTargetRequests(urls);
		List<String> productUrls = new ArrayList<>();
		List<Long> ids = new ArrayList<>();
		List<Integer> turns = new ArrayList<Integer>();
		List<Integer> forecasts = new ArrayList<>();
		List<String> names = new ArrayList<>();

		productUrls = page.getHtml().xpath("//li[@class='d-glist']").links()
				.regex("https://1.jd.com/product/.*").all();
		names = page.getHtml().xpath("//div[@class='p-name']/a/text()").all();

		for (int i = 0; i < productUrls.size(); i++) {
			String[] str1 = productUrls.get(i).split("/product/");
			String[] str2 = str1[1].split("/");
			ids.add(Long.valueOf(str2[0]));
			turns.add(Integer.valueOf(str2[1]));
		}

		List<String> forecastsStrs = page.getHtml()
				.xpath("//li[@class='fore1']/em/text()").all();
		for (int i = 0; i < forecastsStrs.size(); i++) {
			forecasts.add(Integer.valueOf(forecastsStrs.get(i)));
		}

		for (int i = 0; i < productUrls.size(); i++) {
			Product product = new Product();
			product.setId(ids.get(i));
			product.setForecast(forecasts.get(i));
			product.setName(names.get(i));
			product.setUrl(productUrls.get(i));
			product.setTurnCount(turns.get(i));
			products.add(product);
		}
	}

	@Override
	public Site getSite() {
		return site;
	}

}
