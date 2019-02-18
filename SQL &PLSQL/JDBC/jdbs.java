package com.capg.jdbc1;
import java.sql.*;
public class jdbs {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="Capgemini123";
		Connection con= DriverManager.getConnection(url, user, password);
		try {
			Statement st=con.createStatement();
			//ResultSet re=st.executeQuery("create table new(id number(2),price number(4))");
			//ResultSet re1=st.executeQuery("insert into new(id ,price )values(01,200)");
			//ResultSet re2=st.executeQuery("insert into new(id ,price )values(02,400)");
			ResultSet re3=st.executeQuery("delete from new where id=2");
			ResultSet re4=st.executeQuery("update new set price=250 where id=1");
			  /*ResultSet re5=st.executeQuery("select *from new");
			while(re5.next()) {
				System.out.println("Success");
			}*/
		}catch(Exception e) {
			//System.out.println("Error in query..."+e);
		}
		con.close();
	}
	

}
