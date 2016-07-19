package oneyuan.history;

import java.util.ArrayList;
import java.util.List;

import oneyuan.history.model.BuyHistory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class ProdProcessor implements PageProcessor {
	private final int PAGE_SIZE = 100;
	
	private Long mItemId;
	private Integer mIssueNo;
	private Long mIssueId;
	private boolean isFirst = true;
	private List<BuyHistory> mHistorys = new ArrayList<BuyHistory>();
	private Site site = Site.me().setRetryTimes(3).setSleepTime(0);

	public ProdProcessor(Long itemId,Integer issueNo,Long issueId) {
		mItemId = itemId;
		mIssueNo = issueNo;
		mIssueId = issueId;
	}
	
	public List<BuyHistory>  getHistorys(){
		return mHistorys;
	}
	
	public int getHistoryCount(){
		return mHistorys.size();
	}
	
	@Override
	public void process(Page page) {
		// 第一次查看页数拼接Ajax连接
		if (isFirst) {
			int participantTotalItem = Integer.valueOf(page.getHtml()
					.xpath("//input[@id='participantTotalItem']/@value").get());
			int pageCount = participantTotalItem / PAGE_SIZE + 1;
			List<String> mUrls = new ArrayList<String>();
			for (int i = 1; i <= pageCount; i++) {
				String url = "https://1.jd.com/product/participants?"
						+ "itemId=" + mItemId + "&issueNo=" + mIssueNo
						+ "&issueId=" + mIssueId + "&pageIndex=" + i
						+ "&pageSize=" + PAGE_SIZE;
				mUrls.add(url);
			}
			page.addTargetRequests(mUrls);
			isFirst = false;
		} else {
			List<String> names = new ArrayList<String>();
			List<String> addrs = new ArrayList<String>();
			List<String> nums = new ArrayList<String>();
			List<String> times = new ArrayList<String>();
			names = page.getHtml().xpath("//div[@class='j-name']/a/text()")
					.all();
			addrs = page.getHtml().xpath("//div[@class='j-addr']/text()").all();
			nums = page.getHtml().xpath("//div[@class='j-num']/text()").all();
			times = page.getHtml().xpath("//div[@class='j-time']/text()").all();
			for (int i = 0; i < names.size(); i++) {
				BuyHistory his = new BuyHistory();
				his.setBuyCount(Integer.valueOf(nums.get(i)));
				his.setBuyTime(times.get(i));
				his.setId(mItemId);
				his.setTurnNo(mIssueNo);
				his.setUserAddr(addrs.get(i));
				his.setUserName(names.get(i));
				mHistorys.add(his);
			}
		}
	}

	@Override
	public Site getSite() {
		return site;
	}
}
