package Nov1113.jdbc1113;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;

public class CRUD_SQL {

   //   DB������ ���� ���� con ����
   Connection con =null;
   Statement stmt = null;
   PreparedStatement pstmt = null;
   ResultSet rs = null;

   //   1.DB����
   public void connect() {
      con = DBC.DBconnect();
      //DBC�� �ִ� DBconnect()�� �����´�.

   }
   //   2.DB���� ���� 
   public void conClose() {
      try {
         con.close();
         System.out.println("DB���� ����");
      } catch (SQLException e) {

         e.printStackTrace();
      }


   }
   public void stuJoin(CRUD_DTO stu) {
      String sql = "insert into stutable values(?,?)";

      try {
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, stu.getStuNmae());
         pstmt.setInt(2, stu.getStuAge());

         pstmt.executeUpdate();
         System.out.println("��� ����!");
      } catch (SQLException e) {
         System.out.println("��� ����!");
         e.printStackTrace();
      }


   }
   
   public void select() {
	      try {
	         stmt = con.createStatement();
	         String sql = "select * from stutable";
	         rs = stmt.executeQuery(sql);
	         
	         while(rs.next()) {
	            System.out.println("�̸� : "+rs.getString(1));
	            System.out.println("���� : "+rs.getInt(2));
	            System.out.println("------------------------");
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }

   public void modification(CRUD_DTO stu ) {
		String sql = "UPDATE STUTABLE SET STUAGE = ? WHERE STUNAME = ?";
		try {
	         pstmt = con.prepareStatement(sql);
	         pstmt.setString(2, stu.getStuNmae());
	         pstmt.setInt(1, stu.getStuAge());

	         pstmt.executeUpdate();
	         System.out.println("���� ����!(�������ƴ� ��_��)");
	      } catch (SQLException e) {
	         System.out.println("��� ����!(�̰� �������ϼ��� ��_��)");
	         e.printStackTrace();
	      }
		
	
}
   public void deletEmp(CRUD_DTO stu) {
		String sql = "delete stutable where stuname =?";
		try {
	        pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, stu.getStuNmae());

	        pstmt.executeUpdate();
	        System.out.println("���� ����! ^^7");
	     } catch (SQLException e) {
	        System.out.println("���� ����! ^^7");
	        e.printStackTrace();
	     }
	}
			
}

