import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		
		try {
		    Class.forName("com.mysql.jdbc.Driver"); 
		    
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/","root","FubahU^1458");
//					//jdbc:mysql://127.0.0.1:3306/?user=root
//			Statement mysd = myConn.createStatement();
			PreparedStatement ps = myConn.prepareStatement("CREATE SCHEMA ASHEDSI");
			System.out.println("trUE");
//			ps.setString(parameterIndex, x);
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
