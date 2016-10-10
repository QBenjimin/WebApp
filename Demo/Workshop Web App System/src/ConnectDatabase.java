
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;

public class ConnectDatabase {

	private Connection conn;
	private String db_name = "workshopmanagementdatabase";
	private String db_url = "jdbc:mysql://localhost:3307/" + db_name;  
	private String db_username = "root"; // Change to your username if you have mysql (eg root)
	private String db_password = "mysql"; // Change to your password if you have mysql (eg root)

	public ConnectDatabase(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(db_url, db_username, db_password);
			System.out.println("Connection was successful!");
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}





	public ResultSet getLogin(){
		try {
			String sql = "SELECT * from login where username=? and password=?";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			//If there is an object to skip, it returns true
			return rs;
			//while(rs.next()) {

			//System.out.println("mID:" + rs.getString("mID") + "\tTitle:" + rs.getString(2));
			// 2 represents the number of rows you want to retrieve
			// if you type 4, it will show up to the Director


		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}	



	public ResultSet getChangingTyre(){
		try {
			String sql = "SELECT * from ChangingTyre";

			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			return rs;


		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}


	//	public void addMovie(int mID, String title, int year, String director){
	//
	//		try {
	//			String sql = "INSERT INTO Movie VALUES (?, ?, ?, ?)"; 
	//			PreparedStatement ps;
	//			ps = conn.prepareStatement(sql);
	//			ps.setString(2, title);
	//			ps.setInt(3, year);
	//			ps.setString(4, director);
	//			ps.executeUpdate();
	//			//		ResultSet rs = ps.executeQuery();
	//
	//		} catch (SQLException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//
	//
	//
	//
	//	}
	//
	//	public void deleteMovie(int mID) {// delete from mID onwards
	//		try{
	//
	//			String sql = "DELETE from Movie WHERE mID=?"; // ? = input from user
	//			PreparedStatement ps = conn.prepareStatement(sql);
	//
	//			ps.setInt(1, mID);
	//			ps.executeUpdate();
	//
	//		} 
	//		catch (Exception e) {
	//			// TODO: handle exception
	//		}
	//	}
	//
	//	public void editMovieTitle(int mID, String title){
	//		try {
	//			String sql = "UPDATE Movie SET title=? WHERE mID=?";
	//			PreparedStatement ps = conn.prepareStatement(sql);
	//			ps.setString(1, title); // first ?
	//			ps.setInt(2, mID); // 2nd mID
	//			ps.executeUpdate();
	//
	//
	//		} catch (Exception e) {
	//			// TODO: handle exception
	//		}
	//	}
	//
	//	public void editMovie(String mID, String Title, String Year, String Director){
	//		try {
	//			String sql = "UPDATE Movie SET Title=?, Year=?, Director=? WHERE mID=?";
	//			PreparedStatement ps = conn.prepareStatement(sql);
	//			ps.setString(1, Title); // first ?
	//			ps.setString(2, Year);// 2nd mID
	//			ps.setString(3, Director);
	//			ps.setString(4, mID);
	//			ps.executeUpdate();
	//
	//
	//		} catch (Exception e) {
	//			// TODO: handle exception
	//			e.getStackTrace();
	//		}


}



