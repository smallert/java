package org.db;
import java.sql.*;

public class DBconn {
	public static Connection conn;     //Connection�������ӣ�
	//�������ݿ�
	public static Connection getConn(){
		try{
			//����ע��SQLSever��JDBC����
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//��д�����ַ������������һ�ȡ����
			conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MessageBoard","sa","19961002happy");
			return conn;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public static void CloseConn(){
		try{
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
