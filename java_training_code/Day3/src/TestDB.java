import java.sql.*;
public class TestDB {
	public static void main(String Args[]) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://10.1.29-MariaDB/id4717682_tesingonline","id4717682_8938893628","akshaysharma");
			PreparedStatement st=con.prepareStatement("Insert into Employee values('Akshay')");
			st.executeUpdate();
		}
		catch(Exception EE) {
			System.out.println(EE+"");
		}
	}

}
