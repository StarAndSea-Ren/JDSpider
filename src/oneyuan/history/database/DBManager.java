package oneyuan.history.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;



import oneyuan.history.model.BuyHistory;
import oneyuan.history.model.Lucky;
import oneyuan.history.model.Product;

public class DBManager {

	private static Statement sql_statement;
	private static Connection conn;

	public static Connection getConnection() throws SQLException,
			java.lang.ClassNotFoundException {
		// 第一步：加载MySQL的JDBC的驱动
		Class.forName("com.mysql.jdbc.Driver");

		// 取得连接的url,能访问MySQL数据库的用户名,密码；jsj：数据库名
		String url = "jdbc:mysql://57539f19cfa56.bj.cdb.myqcloud.com:8218/jd?useUnicode=true&amp;characterEncoding=UTF-8";
		String username = "root";
		String password = "ren695221283";

		// 第二步：创建与MySQL数据库的连接类的实例
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}

	public static void createStatement() {
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			sql_statement = conn.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isPeriodExist(Long id, Integer turn){
		boolean isExist = false;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		String sql = "SELECT COUNT(*) totalCount FROM buyhistory WHERE b_p_id = " + id + " and b_turn_no ="+turn;
		try {
			preparedStatement = conn.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				int rowCount = resultSet.getInt("totalCount");
				if(rowCount > 0){
					isExist = true;
				}
			}
			preparedStatement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isExist;
	}

	public static void insertProducts(List<Product> products) {
		for (int i = 0; i < products.size(); i++) {
			insertProduct(products.get(i));
		}
	}

	public static void insertBuyhistorys(List<BuyHistory> historys) {
		if (historys == null || historys.size() == 0) {
			return;
		}
		if (sql_statement == null) {
			createStatement();
		}
		try {
			for (int i = 0; i < historys.size(); i++) {
				sql_statement.execute("insert buyhistory values("
						+ historys.get(i).toString() + ")");
			}
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertLuckys(List<Lucky> luckys) {
		for (int i = 0; i < luckys.size(); i++) {
			insertLucky(luckys.get(i));
		}
	}

	public static void insertProduct(Product product) {
		if (product == null) {
			return;
		}
		String sql = "insert product values(" + product.toString() + ")";
		if (sql_statement == null) {
			createStatement();
		}
		try {
			sql_statement.executeUpdate(sql);
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertBuyhistory(BuyHistory history) {
		if (history == null) {
			return;
		}
		String sql = "insert buyhistory values(" + history.toString() + ")";
		if (sql_statement == null) {
			createStatement();
		}
		try {
			sql_statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertLucky(Lucky lucky) {
		if (lucky == null) {
			return;
		}
		String sql = "insert lucky values(" + lucky.toString() + ")";
		if (sql_statement == null) {
			createStatement();
		}
		try {
			sql_statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
