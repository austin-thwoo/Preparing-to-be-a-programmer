package Nov1113.jdbc1113;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;

public class CRUD_SQL {

   //   DB접속을 위한 변수 con 선언
   Connection con =null;
   Statement stmt = null;
   PreparedStatement pstmt = null;
   ResultSet rs = null;

   //   1.DB접속
   public void connect() {
      con = DBC.DBconnect();
      //DBC에 있는 DBconnect()를 가져온다.

   }
   //   2.DB접속 해제 
   public void conClose() {
      try {
         con.close();
         System.out.println("DB접속 해제");
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
         System.out.println("등록 성공!");
      } catch (SQLException e) {
         System.out.println("등록 실패!");
         e.printStackTrace();
      }


   }
   
   public void select() {
	      try {
	         stmt = con.createStatement();
	         String sql = "select * from stutable";
	         rs = stmt.executeQuery(sql);
	         
	         while(rs.next()) {
	            System.out.println("이름 : "+rs.getString(1));
	            System.out.println("나이 : "+rs.getInt(2));
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
	         System.out.println("수정 성공!(지수정아님 ㅋ_ㅋ)");
	      } catch (SQLException e) {
	         System.out.println("등록 실패!(이건 지수정일수도 ㅋ_ㅋ)");
	         e.printStackTrace();
	      }
		
	
}
   public void deletEmp(CRUD_DTO stu) {
		String sql = "delete stutable where stuname =?";
		try {
	        pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, stu.getStuNmae());

	        pstmt.executeUpdate();
	        System.out.println("삭제 성공! ^^7");
	     } catch (SQLException e) {
	        System.out.println("삭제 실패! ^^7");
	        e.printStackTrace();
	     }
	}
			
}

