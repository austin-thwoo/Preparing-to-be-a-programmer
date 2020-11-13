package Nov1113.jdbc1113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC {
   public static Connection DBconnect() {
      /*DB에 접속정보 저장을 위한
       *Connection 타입의 변수 con 선언*/
      Connection con = null;
      //접속할 DB의 주소정보
      String url = "jdbc:oracle:thin:@localhost:1521:XE";

      //접속할 유저의 계정정보
      String user = "thwoo";
      String password = "1111";

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         //con에 정보를 저장
         con = DriverManager.getConnection(url, user, password);
         System.out.print("DB 접속 성공!");
      } catch(ClassNotFoundException cne) {
         System.out.println("DB접속 실패:드라이버");
      } catch(SQLException se) {
         System.out.println("DB접속 실패:DB계정");
      }
      return con;
   }
}