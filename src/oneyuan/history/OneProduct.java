package oneyuan.history;

import oneyuan.history.database.DBManager;
import oneyuan.history.model.Product;

/**
 * 一件商品.
 * 据此拼接基于期数的连接
 * 转到OnPeriod爬取一件商品所有期数数据
 */
public class OneProduct {

	private Product product;

	public OneProduct(Product product) {
		this.product = product;
	}

	public void run() {
		if(product == null || product.getUrl() == null||!product.getUrl().contains("/product/")){
			return;
		}
		String[] str1 = product.getUrl().split("/product/");
		if(str1.length != 2 || str1[1] == null || !str1[1].contains("/")){
			return;
		}
		String[] str2 = str1[1].split("/");
		if(str2.length != 2){
			return;
		}
		String incompleteUrl = str1[0] + "/product/" + str2[0] + "/";
		String periodStr = str2[1];
		int period = Integer.valueOf(periodStr);
		for (int j = period; j > 0; j--) {
			//该产品该期在数据库无数据则爬取
			if(!DBManager.isPeriodExist(product.getId(), j)){
				String completeUrl = incompleteUrl + j;
				product.setUrl(completeUrl);
				(new OnePeriod(product)).run();
			}
		}
	}
}
