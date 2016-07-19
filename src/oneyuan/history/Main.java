package oneyuan.history;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import oneyuan.history.database.DBManager;
import oneyuan.history.model.Product;

public class Main {

	public static void main(String[] args) {

//		String str = "C:\\YuehDev\\WorkSpace\\Java\\JDSpider\\lib";
//		String lstr = "/home/ubuntu/workspace/lib/";
//		File file = new File(str);
//		StringBuilder sb = new StringBuilder();
//		File[] arr = file.listFiles();
//		for (File f : arr) {
//			if (f.getName().endsWith(".jar")) {
//				sb.append(lstr+f.getName()+":");
//			}
//		}
//		String s = sb.toString();
//		s = s.substring(0, s.length() - 1);
//		System.out.println(s);
		

		// 数据库初始化
		DBManager.createStatement();

		/**
		 * 从全部商品页面爬取每个商品信息 https://1.jd.com/list/-1
		 */
		// ProdListProcessor plp = new ProdListProcessor();
		// Spider.create(plp)
		// .addUrl("https://1.jd.com/list/querylist?categoryId=-1&sortId=10&pageSize=20&pageIndex=1")
		// .thread(5)
		// .run();
		// List<Product> products = plp.getPros();
		// int prosCount = products.size();
		//
		// //商品信息存入数据库
		// if(products != null && prosCount != 0 ){
		// DBManager.insertProducts(products);
		// //System.out.println("-------->Product表新增  " +
		// products.size()+"  条商品记录-------->");
		// }

		// 根据固定的产品来源产生
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("1100000000000003408", "120", " 联通100元充值卡",
				"https://1.jd.com/product/1100000000000003408/8949", "8949"));
		products.add(new Product("1100000000000007808", "240",
				" 漫步者 R26T 2.0电脑音箱 ",
				"https://1.jd.com/product/1100000000000007808/110", "110"));
		products.add(new Product("1100000000000007928", "3600",
				" 极米 Z4X 微联智能投影仪",
				"https://1.jd.com/product/1100000000000007928/46", "46"));
		products.add(new Product("1100000000000009208", "359",
				" 零度探索LIVTOR 户外烧烤大套装",
				"https://1.jd.com/product/1100000000000009208/70", "70"));
		products.add(new Product("1100000000000009808", "666",
				" 博朗电动剃须刀 cruZer 6",
				"https://1.jd.com/product/1100000000000009808/64", "64"));
		products.add(new Product("1100000000000010040", "8266",
				" Apple iPad Pro12.9英寸",
				"https://1.jd.com/product/1100000000000010040/47", "47"));
		products.add(new Product("1100000000000010816", "119",
				" 罗技（Logitech）M275 无线鼠",
				"https://1.jd.com/product/1100000000000010816/58", "58"));
		products.add(new Product("1100000000000011304", "112",
				" 尚烤佳彩虹双人吊床200cm*150cm",
				"https://1.jd.com/product/1100000000000011304/38", "38"));
		products.add(new Product("1100000000000011720", "120", " 中国石化100元加油卡",
				"https://1.jd.com/product/1100000000000011720/872", "872"));
		products.add(new Product("1100000000000012520", "430",
				" 360行车记录仪尊享版 J501",
				"https://1.jd.com/product/1100000000000012520/26", "26"));
		products.add(new Product("1100000000000012528", "149",
				" 蓝月亮 洁净洗衣液-薰2瓶3kg",
				"https://1.jd.com/product/1100000000000012528/44", "44"));
		products.add(new Product("1100000000000012704", "186",
				" 铭塔A7019 实木升降儿童大画板",
				"https://1.jd.com/product/1100000000000012704/20", "20"));
		products.add(new Product("1100000000000013208", "1536",
				" 蔻驰 女款麦迪逊系列褶皱皮真皮长款钱包",
				"https://1.jd.com/product/1100000000000013208/4", "4"));
		products.add(new Product("1100000000000013232", "168",
				" 小米（MI）小钢炮2代音箱",
				"https://1.jd.com/product/1100000000000013232/102", "102"));
		products.add(new Product("1100000000000100304", "149",
				" 屈臣氏苏打水330ml*24听 整箱装",
				"https://1.jd.com/product/1100000000000100304/5", "5"));
		products.add(new Product("1200000000000005705", "9586",
				" Apple iMac 21.5英寸一体机",
				"https://1.jd.com/product/1200000000000005705/112", "112"));
		products.add(new Product("1200000000000005809", "7279",
				" iPhone 6s Plus 64G版",
				"https://1.jd.com/product/1200000000000005809/6320", "6320"));
		products.add(new Product("1200000000000007065", "119",
				" 360安全路由P1 3mm纤薄设计 ",
				"https://1.jd.com/product/1200000000000007065/286", "286"));
		products.add(new Product("1200000000000007089", "167",
				" 金士顿DT SE9H 64GB金属U盘",
				"https://1.jd.com/product/1200000000000007089/295", "295"));
		products.add(new Product("1200000000000007913", "8399",
				" 佳能（Canon） EOS 70D 单反",
				"https://1.jd.com/product/1200000000000007913/146", "146"));
		products.add(new Product("1200000000000007953", "479",
				" 美的（Midea） 电压力锅5l 双胆",
				"https://1.jd.com/product/1200000000000007953/461", "461"));
		products.add(new Product("1200000000000008201", "328",
				" 九阳电热水瓶JYK-50P0 5L大容量",
				"https://1.jd.com/product/1200000000000008201/114", "114"));
		products.add(new Product("1200000000000008217", "959",
				" 爱普生 L310 墨仓式 彩色打印机",
				"https://1.jd.com/product/1200000000000008217/39", "39"));
		products.add(new Product("1200000000000008233", "719",
				" 好孩子 儿童汽车安全座椅9个月-12岁",
				"https://1.jd.com/product/1200000000000008233/75", "75"));
		products.add(new Product("1200000000000008809", "436",
				" Apple iPod shuffle ",
				"https://1.jd.com/product/1200000000000008809/88", "88"));
		products.add(new Product("1200000000000009201", "418", " 李宁LINING羽毛球拍",
				"https://1.jd.com/product/1200000000000009201/28", "28"));
		products.add(new Product("1200000000000009505", "168",
				" 小米移动电源/充电宝 16000mAh",
				"https://1.jd.com/product/1200000000000009505/301", "301"));
		products.add(new Product("1200000000000009601", "7999",
				" Apple iPhone 6s 128G",
				"https://1.jd.com/product/1200000000000009601/402", "402"));
		products.add(new Product("1200000000000009801", "338",
				" 创悦 CREAJOY 踏步机 CY-9",
				"https://1.jd.com/product/1200000000000009801/50", "50"));
		products.add(new Product("1200000000000010825", "2638",
				" 小米定制版Ninebot 九号平衡车",
				"https://1.jd.com/product/1200000000000010825/113", "113"));
		products.add(new Product("1200000000000010833", "115",
				" 锐澳预调酒混合装（六种口味）275*6瓶",
				"https://1.jd.com/product/1200000000000010833/80", "80"));
		products.add(new Product("1200000000000011001", "2879",
				" 亚马逊KindleOasis电子书阅读器",
				"https://1.jd.com/product/1200000000000011001/21", "21"));
		products.add(new Product("1200000000000011401", "120",
				" 京东E卡经典卡100元面值（电子卡）",
				"https://1.jd.com/product/1200000000000011401/2738", "2738"));
		products.add(new Product("1200000000000012001", "98", " 忆江南 茗茶系列三罐组合装",
				"https://1.jd.com/product/1200000000000012001/59", "59"));
		products.add(new Product("1200000000000012505", "346",
				" JBL Pebbles 音乐蜗牛 ",
				"https://1.jd.com/product/1200000000000012505/11", "11"));
		products.add(new Product("1200000000000012529", "358",
				" 光威幻龙鲤6.3米碳素台钓竿",
				"https://1.jd.com/product/1200000000000012529/75", "75"));
		products.add(new Product("1200000000000012537", "199",
				" 友臣 肉松饼 快乐分享装 5000g/箱",
				"https://1.jd.com/product/1200000000000012537/41", "41"));
		products.add(new Product("1200000000000012601", "2808",
				" CSmall 白银投资银条500g",
				"https://1.jd.com/product/1200000000000012601/9", "9"));
		products.add(new Product("1200000000000012705", "218", " 倍轻松 颈椎按摩披肩",
				"https://1.jd.com/product/1200000000000012705/10", "10"));
		products.add(new Product("1200000000000013009", "215",
				" 澳贝（AUBY） 益智玩具 欢乐扭扭车",
				"https://1.jd.com/product/1200000000000013009/25", "25"));
		products.add(new Product("1200000000000013017", "2888", " 小萝卜智能机器人",
				"https://1.jd.com/product/1200000000000013017/4", "4"));
		products.add(new Product("1200000000000013105", "248",
				" 德国爱慕莎贝格系列保温壶玻璃内胆1.5L",
				"https://1.jd.com/product/1200000000000013105/7", "7"));
		products.add(new Product("1200000000000013201", "828",
				" 永久20寸彩配折叠单车YE2015",
				"https://1.jd.com/product/1200000000000013201/82", "82"));
		products.add(new Product("1200000000000013233", "239",
				" 苏泊尔电饼铛JD30A824-130",
				"https://1.jd.com/product/1200000000000013233/18", "18"));
		products.add(new Product("1200000000000100305", "175",
				" 茶人岭雨前西湖龙井50g*3盒",
				"https://1.jd.com/product/1200000000000100305/14", "14"));
		products.add(new Product("1200000000000100401", "539",
				" 罗技G502 炫光自适应游戏鼠标",
				"https://1.jd.com/product/1200000000000100401/11", "11"));
		products.add(new Product("1200000000000100801", "299", " 达能轻饮料豪华组合套餐",
				"https://1.jd.com/product/1200000000000100801/3", "3"));
		products.add(new Product("1300000000000003002", "60", " 移动 50元 充值卡",
				"https://1.jd.com/product/1300000000000003002/13402", "13402"));
		products.add(new Product("1300000000000007922", "143",
				" 小米（MI）小米蓝牙游戏手柄",
				"https://1.jd.com/product/1300000000000007922/162", "162"));
		products.add(new Product("1300000000000007930", "216",
				" 唱吧（changba）C1 麦克风",
				"https://1.jd.com/product/1300000000000007930/58", "58"));
		products.add(new Product("1300000000000008202", "121",
				" 德尔玛DX128C 手持吸尘器",
				"https://1.jd.com/product/1300000000000008202/173", "173"));
		products.add(new Product("1300000000000008234", "216",
				" 抱抱熊 婴儿背带 透气双肩多功能抱婴腰凳",
				"https://1.jd.com/product/1300000000000008234/84", "84"));
		products.add(new Product("1300000000000009602", "3999",
				" 华为 P9 3GB+32GB 4G全网通",
				"https://1.jd.com/product/1300000000000009602/697", "697"));
		products.add(new Product("1300000000000009810", "118",
				" BIAZE 手机镜头三合一镜头套装通用",
				"https://1.jd.com/product/1300000000000009810/47", "47"));
		products.add(new Product("1300000000000010818", "239",
				" 360智能摄像机夜视版 D503 小水滴",
				"https://1.jd.com/product/1300000000000010818/42", "42"));
		products.add(new Product("1300000000000010826", "3588",
				" Apple Watch 42毫米智能手表",
				"https://1.jd.com/product/1300000000000010826/57", "57"));
		products.add(new Product("1300000000000011714", "3458",
				" 微软Xbox One 专业游戏机 标准版",
				"https://1.jd.com/product/1300000000000011714/15", "15"));
		products.add(new Product("1300000000000011722", "1438",
				" 飞利浦（Philips）空气炸锅",
				"https://1.jd.com/product/1300000000000011722/6", "6"));
		products.add(new Product("1300000000000011802", "1138",
				" JBL Pulse 音乐脉动无线蓝牙音箱",
				"https://1.jd.com/product/1300000000000011802/25", "25"));
		products.add(new Product("1300000000000012506", "120",
				" 小米（MI）小米智能手环 光感版 ",
				"https://1.jd.com/product/1300000000000012506/137", "137"));
		products.add(new Product("1300000000000012522", "202",
				" Csmall 足银999福字如意 10g",
				"https://1.jd.com/product/1300000000000012522/10", "10"));
		products.add(new Product("1300000000000012530", "108",
				" 幻响一元抢宝定制 D2 LED护眼台灯",
				"https://1.jd.com/product/1300000000000012530/27", "27"));
		products.add(new Product("1300000000000012538", "225",
				" 五芳斋 丰年五芳 粽子礼盒 2400g",
				"https://1.jd.com/product/1300000000000012538/16", "16"));
		products.add(new Product("1300000000000013010", "298",
				" 言艺 紫砂茶具 功夫茶具套装配实木茶盘",
				"https://1.jd.com/product/1300000000000013010/54", "54"));
		products.add(new Product("1300000000000013018", "228",
				" 拓朴小净士S7 拖地甩干地拖墩布",
				"https://1.jd.com/product/1300000000000013018/15", "15"));
		products.add(new Product("1300000000000013106", "112",
				" 维达卫生纸蓝色经典3层200g*27卷",
				"https://1.jd.com/product/1300000000000013106/97", "97"));
		products.add(new Product("1300000000000013202", "131", " 花王（KAO）蒸汽眼罩",
				"https://1.jd.com/product/1300000000000013202/3", "3"));
		products.add(new Product("1300000000000100802", "4328",
				" 暴风TV 超体50英寸4K液晶电视",
				"https://1.jd.com/product/1300000000000100802/12", "12"));
		products.add(new Product("1400000000000007043", "6380",
				" Apple iPhone 6s 64G",
				"https://1.jd.com/product/1400000000000007043/861", "861"));
		products.add(new Product("1400000000000007067", "155",
				" 得力（deli）2801 可充电激光笔",
				"https://1.jd.com/product/1400000000000007067/26", "26"));
		products.add(new Product("1400000000000007955", "199",
				" AVENE雅漾舒护活泉喷雾300ml",
				"https://1.jd.com/product/1400000000000007955/20", "20"));
		products.add(new Product("1400000000000009211", "488",
				" 任e行V6 行车记录仪1080P全高清",
				"https://1.jd.com/product/1400000000000009211/101", "101"));
		products.add(new Product("1400000000000009603", "5999",
				" 极米 H1 微联智能 无屏电视",
				"https://1.jd.com/product/1400000000000009603/36", "36"));
		products.add(new Product("1400000000000009811", "126",
				" 小熊豆芽机 双层全自动家用",
				"https://1.jd.com/product/1400000000000009811/47", "47"));
		products.add(new Product("1400000000000010035", "1596",
				" 乐视乐2（X620）3G+32GB全网通",
				"https://1.jd.com/product/1400000000000010035/584", "584"));
		products.add(new Product("1400000000000010107", "5735", " 天梭豪致系列机械男表",
				"https://1.jd.com/product/1400000000000010107/91", "91"));
		products.add(new Product("1400000000000010403", "110",
				" 红牛 维生素功能饮料 250ML*12罐",
				"https://1.jd.com/product/1400000000000010403/957", "957"));
		products.add(new Product("1400000000000010819", "119",
				" 九州风神（DEEPCOOL）X6 笔记本",
				"https://1.jd.com/product/1400000000000010819/32", "32"));
		products.add(new Product("1400000000000010827", "7798",
				" 大疆（DJI） 精灵3专业版",
				"https://1.jd.com/product/1400000000000010827/16", "16"));
		products.add(new Product("1400000000000011723", "478",
				" 美固T20 20L车载冰箱 车载冷暖箱",
				"https://1.jd.com/product/1400000000000011723/24", "24"));
		products.add(new Product("1400000000000012203", "1588", " 华为手环B3商务版",
				"https://1.jd.com/product/1400000000000012203/70", "70"));
		products.add(new Product("1400000000000012531", "238",
				" 蕉下双层防晒 黑胶太阳伞黑胶遮阳伞",
				"https://1.jd.com/product/1400000000000012531/7", "7"));
		products.add(new Product("1400000000000013011", "109",
				" 维达抽纸 超韧3层150抽面巾纸*24包",
				"https://1.jd.com/product/1400000000000013011/91", "91"));
		products.add(new Product("1400000000000013019", "2209",
				" 小米Max 3G+64G全网通",
				"https://1.jd.com/product/1400000000000013019/208", "208"));
		products.add(new Product("1400000000000013107", "128",
				" 欧润哲 家用急救医药箱 大号双层",
				"https://1.jd.com/product/1400000000000013107/13", "13"));
		products.add(new Product("1400000000000013211", "2016",
				" COACH 蔻驰 男款休闲单肩斜挎包",
				"https://1.jd.com/product/1400000000000013211/7", "7"));
		products.add(new Product("1400000000000100803", "125",
				" 统一汤达人 豚骨味方便面12碗整箱装",
				"https://1.jd.com/product/1400000000000100803/7", "7"));
		products.add(new Product("1500000000000007924", "146",
				" 飞利浦 SHM7110电脑耳麦 游戏耳机",
				"https://1.jd.com/product/1500000000000007924/75", "75"));
		products.add(new Product("1500000000000007932", "518",
				" 小米（MI）小米盒子3 增强版",
				"https://1.jd.com/product/1500000000000007932/129", "129"));
		products.add(new Product("1500000000000007940", "8399",
				" 机械革命MR X6Ti15.6英寸游戏本",
				"https://1.jd.com/product/1500000000000007940/100", "100"));
		products.add(new Product("1500000000000008204", "479",
				" 九阳 DJ13B-D08EC多功能豆浆机",
				"https://1.jd.com/product/1500000000000008204/104", "104"));
		products.add(new Product("1500000000000008212", "368",
				" 欧姆龙HEM-7051电子血压计",
				"https://1.jd.com/product/1500000000000008212/52", "52"));
		products.add(new Product("1500000000000008236", "263",
				" 帮宝适 Pampers 超薄干爽 婴儿纸",
				"https://1.jd.com/product/1500000000000008236/70", "70"));
		products.add(new Product("1500000000000008404", "229",
				" 幻响 孙小圣 1元抢宝定制蓝牙版",
				"https://1.jd.com/product/1500000000000008404/356", "356"));
		products.add(new Product("1500000000000008804", "1438",
				" Beats Solo2 头戴式耳机 带麦",
				"https://1.jd.com/product/1500000000000008804/34", "34"));
		products.add(new Product("1500000000000009212", "128",
				" 公牛GN-U201T 防过充USB插座",
				"https://1.jd.com/product/1500000000000009212/126", "126"));
		products.add(new Product("1500000000000009812", "368",
				" 九阳紫砂锅DGD50-05AK 电炖锅",
				"https://1.jd.com/product/1500000000000009812/50", "50"));
		products.add(new Product("1500000000000010036", "13306",
				" 微软Surface Book13.5英寸",
				"https://1.jd.com/product/1500000000000010036/17", "17"));
		products.add(new Product("1500000000000010612", "299",
				" 香山蓝牙控制智能婴儿成长秤",
				"https://1.jd.com/product/1500000000000010612/12", "12"));
		products.add(new Product("1500000000000010828", "358",
				" 闪迪 iPhone手机U盘16GB",
				"https://1.jd.com/product/1500000000000010828/8", "8"));
		products.add(new Product("1500000000000010836", "133",
				" 福临门原装进口泰米 5kg",
				"https://1.jd.com/product/1500000000000010836/25", "25"));
		products.add(new Product("1500000000000012516", "155",
				" 费雪fisherprice双面加厚拼图地",
				"https://1.jd.com/product/1500000000000012516/7", "7"));
		products.add(new Product("1500000000000012524", "136",
				" 李施德林常备漱口水三口味装",
				"https://1.jd.com/product/1500000000000012524/5", "5"));
		products.add(new Product("1500000000000012532", "286",
				" Csmall 足银长命富贵锁包对镯套装",
				"https://1.jd.com/product/1500000000000012532/22", "22"));
		products.add(new Product("1500000000000012604", "5159",
				" 武极 i7 四核游戏台式电脑主机",
				"https://1.jd.com/product/1500000000000012604/61", "61"));
		products.add(new Product("1500000000000013004", "458",
				" 拉菲尚品 波尔多干红葡萄酒750ml*2",
				"https://1.jd.com/product/1500000000000013004/27", "27"));
		products.add(new Product("1500000000000013020", "6598",
				" 惠普暗影精灵II代 15.6英寸游戏笔记",
				"https://1.jd.com/product/1500000000000013020/27", "27"));
		products.add(new Product("1500000000000013108", "488",
				" 碧然德净水壶 Fjord 菲傲 2.6L",
				"https://1.jd.com/product/1500000000000013108/8", "8"));
		products.add(new Product("1500000000000013204", "635",
				" 施华洛世奇 Swan小天鹅水晶项链",
				"https://1.jd.com/product/1500000000000013204/10", "10"));
		products.add(new Product("1500000000000013220", "135",
				" 丹麦进口蓝罐 曲奇 礼盒 908g 盒装",
				"https://1.jd.com/product/1500000000000013220/14", "14"));
		products.add(new Product("1500000000000100804", "384",
				" 欧丽薇兰 Olivoilà 橄榄油5L",
				"https://1.jd.com/product/1500000000000100804/1", "1"));
		products.add(new Product("1600000000000003205", "60", " 电信 50元 充值卡",
				"https://1.jd.com/product/1600000000000003205/7344", "7344"));
		products.add(new Product("1600000000000007069", "101",
				" 公牛（BULL）GN-B2440+GN-",
				"https://1.jd.com/product/1600000000000007069/146", "146"));
		products.add(new Product("1600000000000007701", "2999", " 小米 5 32G 标配",
				"https://1.jd.com/product/1600000000000007701/720", "720"));
		products.add(new Product("1600000000000007917", "188",
				" 云腾VT-888 精品便携三脚架云台套装",
				"https://1.jd.com/product/1600000000000007917/59", "59"));
		products.add(new Product("1600000000000007949", "598",
				" 九阳JYZ-V1立式原汁机低速榨汁机",
				"https://1.jd.com/product/1600000000000007949/93", "93"));
		products.add(new Product("1600000000000008213", "276",
				" 格力FD-4010B-WG遥控式落地扇",
				"https://1.jd.com/product/1600000000000008213/419", "419"));
		products.add(new Product("1600000000000008237", "2288",
				" 小米电视3S 43英寸 L43M3-AA",
				"https://1.jd.com/product/1600000000000008237/126", "126"));
		products.add(new Product("1600000000000008805", "146",
				" 小熊 酸奶机 1000mlSNJ-501",
				"https://1.jd.com/product/1600000000000008805/50", "50"));
		products.add(new Product("1600000000000009205", "206",
				" 红色营地 户外自动充气垫子 黄灰色",
				"https://1.jd.com/product/1600000000000009205/66", "66"));
		products.add(new Product("1600000000000009813", "359",
				" 铭塔（MING TA）88件套磁力片积木",
				"https://1.jd.com/product/1600000000000009813/34", "34"));
		products.add(new Product("1600000000000010037", "188", " 鲁花一级花生油5L",
				"https://1.jd.com/product/1600000000000010037/75", "75"));
		products.add(new Product("1600000000000010109", "563",
				" 闪迪加强版 240G 固态硬盘",
				"https://1.jd.com/product/1600000000000010109/120", "120"));
		products.add(new Product("1600000000000010821", "1123",
				" 53度 飞天茅台 500ml",
				"https://1.jd.com/product/1600000000000010821/19", "19"));
		products.add(new Product("1600000000000011301", "7599",
				" 微软Surface Pro 4 128G",
				"https://1.jd.com/product/1600000000000011301/18", "18"));
		products.add(new Product("1600000000000011309", "155",
				" 云麦好轻Color 智能体脂秤（时尚版）",
				"https://1.jd.com/product/1600000000000011309/17", "17"));
		products.add(new Product("1600000000000011901", "500",
				" 米家 iHealth 血压计",
				"https://1.jd.com/product/1600000000000011901/7", "7"));
		products.add(new Product("1600000000000012501", "6826",
				" CSmall Au999 金条 20g",
				"https://1.jd.com/product/1600000000000012501/60", "60"));
		products.add(new Product("1600000000000012509", "2398",
				" 小天鹅TG70-V1262ED滚筒洗衣机",
				"https://1.jd.com/product/1600000000000012509/48", "48"));
		products.add(new Product("1600000000000012517", "166",
				" 花王（Merries）婴儿学步裤",
				"https://1.jd.com/product/1600000000000012517/6", "6"));
		products.add(new Product("1600000000000012533", "168", " 丝塔芙 洁面乳473ml",
				"https://1.jd.com/product/1600000000000012533/4", "4"));
		products.add(new Product("1600000000000013101", "110",
				" 加多宝凉茶310ml*24罐 整箱装",
				"https://1.jd.com/product/1600000000000013101/133", "133"));
		products.add(new Product("1600000000000013109", "2888",
				" 索尼（SONY） DSC-RX100",
				"https://1.jd.com/product/1600000000000013109/4", "4"));
		products.add(new Product("1600000000000013205", "359",
				" 雷柏V500 RGB幻彩背光电竞机械键盘",
				"https://1.jd.com/product/1600000000000013205/54", "54"));
		products.add(new Product("1600000000000013213", "1656",
				" 蔻驰 男款皮质长款钱包钱夹",
				"https://1.jd.com/product/1600000000000013213/6", "6"));
		products.add(new Product("1600000000000100301", "135",
				" 雀巢 咖啡1+2原味100条1500g",
				"https://1.jd.com/product/1600000000000100301/1", "1"));
		products.add(new Product("1600000000000100517", "123",
				" 十月初五澳门经典手信礼袋879g",
				"https://1.jd.com/product/1600000000000100517/6", "6"));
		products.add(new Product("1600000000000100805", "1300",
				" 360巴迪龙儿童手表5s",
				"https://1.jd.com/product/1600000000000100805/1", "1"));
		products.add(new Product("1600000000000100901", "239",
				" 润虎 安溪铁观音乌龙茶茶叶礼盒200g ",
				"https://1.jd.com/product/1600000000000100901/2", "2"));
		products.add(new Product("1700000000000003406", "120", " 移动 100元 充值卡",
				"https://1.jd.com/product/1700000000000003406/50207", "50207"));
		products.add(new Product("1700000000000005806", "4306",
				" Apple iPad mini4 64G",
				"https://1.jd.com/product/1700000000000005806/702", "702"));
		products.add(new Product("1700000000000007038", "6800",
				" 三星 Galaxy S7 edge",
				"https://1.jd.com/product/1700000000000007038/915", "915"));
		products.add(new Product("1700000000000007046", "563",
				" 希捷2.5英寸 1TB 便携式移动硬盘",
				"https://1.jd.com/product/1700000000000007046/98", "98"));
		products.add(new Product("1700000000000007062", "358",
				" 华为荣耀盒子4K高清H.265网络机顶盒",
				"https://1.jd.com/product/1700000000000007062/49", "49"));
		products.add(new Product("1700000000000007918", "7458",
				" 卡西欧（CASIO）EX-TR600 ",
				"https://1.jd.com/product/1700000000000007918/10", "10"));
		products.add(new Product("1700000000000007926", "1316",
				" 惠威（HiVi）M200 有源音箱",
				"https://1.jd.com/product/1700000000000007926/71", "71"));
		products.add(new Product("1700000000000007934", "136",
				" 小米（MI）小米圈铁入耳式耳机",
				"https://1.jd.com/product/1700000000000007934/151", "151"));
		products.add(new Product("1700000000000007942", "299",
				" 罗技（Logitech）K480 多功能",
				"https://1.jd.com/product/1700000000000007942/27", "27"));
		products.add(new Product("1700000000000007950", "1319", " 科沃斯扫地机器人吸尘器",
				"https://1.jd.com/product/1700000000000007950/90", "90"));
		products.add(new Product("1700000000000008206", "398",
				" 美的 MG38CB-AA电烤箱38L家用",
				"https://1.jd.com/product/1700000000000008206/196", "196"));
		products.add(new Product("1700000000000008214", "189",
				" Za 姬芮 甄选隔离2件套",
				"https://1.jd.com/product/1700000000000008214/15", "15"));
		products.add(new Product("1700000000000008238", "442",
				" 阿迪达斯（Adidas）电脑双肩背包",
				"https://1.jd.com/product/1700000000000008238/58", "58"));
		products.add(new Product("1700000000000008302", "478",
				" 格兰仕G70D20CN1P-D2微波炉 ",
				"https://1.jd.com/product/1700000000000008302/206", "206"));
		products.add(new Product("1700000000000008806", "120",
				" 苏泊尔电水壶 SWF17K2-180",
				"https://1.jd.com/product/1700000000000008806/168", "168"));
		products.add(new Product("1700000000000009806", "2615",
				" 新秀丽ENGENERO 20寸拉杆箱",
				"https://1.jd.com/product/1700000000000009806/11", "11"));
		products.add(new Product("1700000000000009902", "251",
				" 电视果Q1 爱奇艺定制手机投屏器",
				"https://1.jd.com/product/1700000000000009902/46", "46"));
		products.add(new Product("1700000000000010006", "429",
				" 美嘉欣六轴飞行器 耐摔航模无人机玩具",
				"https://1.jd.com/product/1700000000000010006/97", "97"));
		products.add(new Product("1700000000000010046", "426",
				" 博朗 欧乐B 3D智能电动牙刷 ",
				"https://1.jd.com/product/1700000000000010046/37", "37"));
		products.add(new Product("1700000000000010822", "4799",
				" 奥克斯2匹 智能操控 圆柱空调柜机",
				"https://1.jd.com/product/1700000000000010822/45", "45"));
		products.add(new Product("1700000000000011102", "98",
				" 幻响 车载手机架+百变猴环扣",
				"https://1.jd.com/product/1700000000000011102/23", "23"));
		products.add(new Product("1700000000000011302", "768",
				" 富士 一次成像拍立得mini25相机",
				"https://1.jd.com/product/1700000000000011302/36", "36"));
		products.add(new Product("1700000000000011502", "85",
				" 可口可乐 整箱装330ml*24听",
				"https://1.jd.com/product/1700000000000011502/251", "251"));
		products.add(new Product("1700000000000011806", "958",
				" DingDong 智能WIFI音箱",
				"https://1.jd.com/product/1700000000000011806/3", "3"));
		products.add(new Product("1700000000000012502", "286",
				" CSmall 足银手镯 女 福字百福手镯",
				"https://1.jd.com/product/1700000000000012502/59", "59"));
		products.add(new Product("1700000000000012518", "4600",
				" Apple iPhone SE 64G",
				"https://1.jd.com/product/1700000000000012518/202", "202"));
		products.add(new Product("1700000000000012526", "128",
				" 悦卡 手动高压便携式车载洗车机16L ",
				"https://1.jd.com/product/1700000000000012526/44", "44"));
		products.add(new Product("1700000000000012534", "226",
				" 韩国777指甲刀剪钳修容组合9件套",
				"https://1.jd.com/product/1700000000000012534/1", "1"));
		products.add(new Product("1700000000000013014", "2039",
				" 双立人锅具套装30cm中式炒锅4件套 ",
				"https://1.jd.com/product/1700000000000013014/6", "6"));
		products.add(new Product("1700000000000013206", "128",
				" 康慈 拔罐器 吕氏真空拔罐器 30罐",
				"https://1.jd.com/product/1700000000000013206/3", "3"));
		products.add(new Product("1700000000000100302", "145",
				" 丹夫华夫饼原味整箱装1500g",
				"https://1.jd.com/product/1700000000000100302/3", "3"));
		products.add(new Product("1700000000000100502", "3618",
				" 【活动专享】机械革命MR X6Ti 本",
				"https://1.jd.com/product/1700000000000100502/1", "1"));
		products.add(new Product("1700000000000100518", "1186",
				" 新秀丽红标VOY 李敏镐同款电脑双肩包",
				"https://1.jd.com/product/1700000000000100518/1", "1"));
		products.add(new Product("1700000000000100702", "310",
				" 欧姆龙红外线电子体温计儿童适用",
				"https://1.jd.com/product/1700000000000100702/5", "5"));
		products.add(new Product("1700000000000100902", "378",
				" 史丹利家用工具箱套装42件套",
				"https://1.jd.com/product/1700000000000100902/6", "6"));
		products.add(new Product("1800000000000003007", "4305",
				" Apple iPad Air 2 16",
				"https://1.jd.com/product/1800000000000003007/149", "149"));
		products.add(new Product("1800000000000005815", "10186",
				" Apple MacBook Air256",
				"https://1.jd.com/product/1800000000000005815/353", "353"));
		products.add(new Product("1800000000000007047", "1199",
				" 三星S24D360HL 23.6英寸显",
				"https://1.jd.com/product/1800000000000007047/77", "77"));
		products.add(new Product("1800000000000007055", "11146",
				" Apple MacBook12英寸256",
				"https://1.jd.com/product/1800000000000007055/100", "100"));
		products.add(new Product("1800000000000007111", "394",
				" 华为 荣耀路由Pro 超大户型穿墙王",
				"https://1.jd.com/product/1800000000000007111/117", "117"));
		products.add(new Product("1800000000000007807", "162",
				" 必恩威（PNY)SDXC 64G极速存储",
				"https://1.jd.com/product/1800000000000007807/49", "49"));
		products.add(new Product("1800000000000007919", "156",
				" 摩米士 SelfiFit 蓝牙自拍杆",
				"https://1.jd.com/product/1800000000000007919/73", "73"));
		products.add(new Product("1800000000000007943", "143",
				" 罗技MK260 无线光电键鼠套装",
				"https://1.jd.com/product/1800000000000007943/100", "100"));
		products.add(new Product("1800000000000008215", "365",
				" 克丽丝汀迪奥DIOR魅惑润唇蜜/唇膏",
				"https://1.jd.com/product/1800000000000008215/48", "48"));
		products.add(new Product("1800000000000008807", "966",
				" LG趣拍得 POPO相印机PD239W",
				"https://1.jd.com/product/1800000000000008807/94", "94"));
		products.add(new Product("1800000000000009207", "146",
				" 皮尔瑜伽 TPE6mm防滑两面用瑜伽垫",
				"https://1.jd.com/product/1800000000000009207/37", "37"));
		products.add(new Product("1800000000000009503", "109",
				" 飞科大功率电吹风机FH6621 ",
				"https://1.jd.com/product/1800000000000009503/157", "157"));
		products.add(new Product("1800000000000010039", "6466",
				" Apple iPad Pro9.7 英寸",
				"https://1.jd.com/product/1800000000000010039/39", "39"));
		products.add(new Product("1800000000000010831", "2200",
				" 华为G9青春版3GB+16GB全网通手机",
				"https://1.jd.com/product/1800000000000010831/184", "184"));
		products.add(new Product("1800000000000011503", "599", " 倍轻松背部智能按摩器",
				"https://1.jd.com/product/1800000000000011503/17", "17"));
		products.add(new Product("1800000000000011719", "97",
				" 伊利安慕希希腊风味酸奶礼盒12*205g",
				"https://1.jd.com/product/1800000000000011719/202", "202"));
		products.add(new Product("1800000000000011807", "905", " 五粮液52度 500ML",
				"https://1.jd.com/product/1800000000000011807/6", "6"));
		products.add(new Product("1800000000000012503", "779",
				" CSmall S999 60g平安银碗",
				"https://1.jd.com/product/1800000000000012503/23", "23"));
		products.add(new Product("1800000000000012519", "299",
				" Yeelight 床头灯1600万种颜色",
				"https://1.jd.com/product/1800000000000012519/12", "12"));
		products.add(new Product("1800000000000012527", "138",
				" 乐扣乐扣缤纷马克保温杯两件套",
				"https://1.jd.com/product/1800000000000012527/49", "49"));
		products.add(new Product("1800000000000012535", "121",
				" 滴露Dettol 消毒液 1.15L*2",
				"https://1.jd.com/product/1800000000000012535/7", "7"));
		products.add(new Product("1800000000000013015", "222",
				" 晟旎尚品 23框实木组合相框墙",
				"https://1.jd.com/product/1800000000000013015/9", "9"));
		products.add(new Product("1800000000000013103", "600",
				" 京东E卡经典卡500面值（电子卡）",
				"https://1.jd.com/product/1800000000000013103/268", "268"));
		products.add(new Product("1800000000000013207", "1218",
				" 卡维饰 汽车座垫四季通用坐垫",
				"https://1.jd.com/product/1800000000000013207/2", "2"));
		products.add(new Product("1800000000000100303", "155",
				" BHB 京东板栗礼盒100g*20袋",
				"https://1.jd.com/product/1800000000000100303/4", "4"));
		products.add(new Product("1800000000000100607", "239",
				" zippo打火机哈雷美国鹰",
				"https://1.jd.com/product/1800000000000100607/17", "17"));
		products.add(new Product("1800000000000100703", "2519",
				" Airwheel Z3 电动车 电动滑板",
				"https://1.jd.com/product/1800000000000100703/6", "6"));

		int prosCount = products.size();

		/**
		 * 依次爬取一个商品每期获奖记录和用户购买记录
		 */
		for (int i = 0; i < prosCount; i++) {
			(new OneProduct(products.get(i))).run();
		}

	}
}
