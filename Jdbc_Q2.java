package Assignment_Q2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc_Q2{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url ="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username="system";
		String password="4321";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Created");
		Statement stmt=con.createStatement();
		
		String CreateQuery="CREATE TABLE SALESMEN_(ID NUMBER(10), NAME VARCHAR(50), CITY  VARCHAR(50), SALARY NUMBER(10)) ";
		stmt.executeUpdate(CreateQuery);
		
		String insertRecord1="INSERT INTO SALESMEN_ VALUES(1,'AJAY','BANGALORE',50000)";
		stmt.executeUpdate(insertRecord1);
		String insertRecord2="INSERT INTO SALESMEN_ VALUES(2,'AMURUTHA','MYSORE',35000)";
		stmt.executeUpdate(insertRecord2);
		String insertRecord3="INSERT INTO SALESMEN_ VALUES(3,'UDAY','MANGALORE',45000)";
		stmt.executeUpdate(insertRecord3);
		String insertRecord4="INSERT INTO SALESMEN_ VALUES(4,'TINA','GADAG',30000)";
		stmt.executeUpdate(insertRecord4);
		
		String updateQuery="UPDATE SALESMEN_ SET ID=3,NAME='VEENA',CITY='GOA',SALARY=50000 WHERE ID=3 ";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM SALESMEN_");
		System.out.println("TABLE CREATED");
		
		while(rs.next()) 
		{
			System.out.println(rs.getString("ID") + " : " +  rs.getString("NAME") + " : " + rs.getString("CITY")+" : " + rs.getString("SALARY") );
		}
		con.close();
		}
	

}
