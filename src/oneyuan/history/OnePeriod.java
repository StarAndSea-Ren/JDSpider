package oneyuan.history;

import java.util.List;

import oneyuan.history.database.DBManager;
import oneyuan.history.model.BuyHistory;
import oneyuan.history.model.Lucky;
import oneyuan.history.model.Product;
import us.codecraft.webmagic.Spider;

/**
 * 一件商品某一期的数据
 */
public class OnePeriod {

	private Product product;

	public OnePeriod(Product product) {
		this.product = product;
	}

	public void run() {
		/**
		 * Step1： 根据该期主页拼接购买历史的Ajax连接 爬取该期获奖记录
		 */
		if (product.getUrl() == null) {
			return;
		}
		ProdProcessorBefore ppb = new ProdProcessorBefore(product.getUrl());
		Spider.create(ppb).addUrl(product.getUrl()).thread(1).run();
		// 获奖数据存入数据库
		Lucky lucky = ppb.getLucky();
		if (lucky != null) {
			DBManager.insertLucky(lucky);
		}

		/**
		 * step2: 爬取该期所有的购买记录
		 */
		if (ppb == null || ppb.getmItemId() == null
				|| ppb.getmIssueNo() == null || ppb.getmIssueId() == null
				|| ppb.getmAjaxUrl() == null) {
			return;
		}

		int threadNo = 1; // 默认线程数
		// 商品价格决定线程数
		if (product.getForecast() != null) {
			int No = product.getForecast() / (400);
			if (No > 0) {
				threadNo = No;
			}
		}
		ProdProcessor pp = new ProdProcessor(ppb.getmItemId(),
				ppb.getmIssueNo(), ppb.getmIssueId());
		Spider.create(pp).addUrl(ppb.getmAjaxUrl()).thread(threadNo).run();
		// 购买历史数据存入数据库
		List<BuyHistory> historys = pp.getHistorys();
		if (historys != null && historys.size() != 0) {
			DBManager.insertBuyhistorys(historys);
		}
	}
}
