package oneyuan.history;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import oneyuan.history.model.Lucky;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * 根据该期主页拼接购买历史的Ajax连接 爬取该期获奖记录
 */
public class ProdProcessorBefore implements PageProcessor {

	private final int START_PAGE_INDEX = 1;
	private final int START_PAGE_SIZE = 1;

	private Long mItemId;
	private Integer mIssueNo;
	private Long mIssueId;
	private String mAjaxUrl;

	private String mUrl;
	private Lucky mLucky;

	private Site site = Site.me().setRetryTimes(3).setSleepTime(0);

	public ProdProcessorBefore(String url) {
		mUrl = url;
	}

	@Override
	public void process(Page page) {

		try {
			// 获取用户参与记录连接
			String[] str1 = mUrl.split("/product/");
			String[] str2 = str1[1].split("/");
			mItemId = Long.valueOf(str2[0]);
			mIssueNo = Integer.valueOf(str2[1]);
			mIssueId = Long.valueOf(page.getHtml()
					.xpath("//input[@id='issueId']/@value").get());
			mAjaxUrl = "https://1.jd.com/product/participants?" + "itemId="
					+ mItemId + "&issueNo=" + mIssueNo + "&issueId=" + mIssueId
					+ "&pageIndex=" + START_PAGE_INDEX + "&pageSize="
					+ START_PAGE_SIZE;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		// 爬取该期获奖记录
		String tagStr = page.getHtml().xpath("//div[@class='u-name']/text()")
				.get().trim();
		if (tagStr != null && tagStr.contains("恭喜")) {
			String winnerName = page.getHtml()
					.xpath("//div[@class='u-name']/a/text()").get();
			int buyCount = 0;
			String buyTimesStr = page.getHtml()
					.xpath("//ul[@class='info-list']/li/text()").get();
			Pattern pattern = Pattern.compile("[0-9]+");
			Matcher matcher = pattern.matcher(buyTimesStr);
			if (matcher.find()) {
				buyCount = Integer.valueOf(matcher.group(0));
			}
			List<String> dates = page.getHtml()
					.xpath("//span[@class='time-txt']/text()").all();
			String endDate = dates.get(0).replace("揭晓时间：", "");
			String buyDate = dates.get(1).replace("抢宝时间：", "");
			String luckyCode = page.getHtml()
					.xpath("//div[@class='p-end-luckycode']/em/text()").get();

			mLucky = new Lucky();
			mLucky.setBuyCount(buyCount);
			mLucky.setBuyTime(buyDate);
			mLucky.setId(mItemId);
			mLucky.setLuckyNo(Integer.valueOf(luckyCode));
			mLucky.setTurnNo(mIssueNo);
			mLucky.setUserName(winnerName);
			mLucky.setWinTime(endDate);
		}
	}

	@Override
	public Site getSite() {
		return site;
	}

	public Lucky getLucky() {
		return mLucky;
	}

	public Long getmItemId() {
		return mItemId;
	}

	public Integer getmIssueNo() {
		return mIssueNo;
	}

	public Long getmIssueId() {
		return mIssueId;
	}

	public String getmAjaxUrl() {
		return mAjaxUrl;
	}

}
