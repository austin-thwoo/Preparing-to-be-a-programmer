package Nov1113.jdbc1113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC {
   public static Connection DBconnect() {
      /*DB�� �������� ������ ����
       *Connection Ÿ���� ���� con ����*/
      Connection con = null;
      //������ DB�� �ּ�����
      String url = "jdbc:oracle:thin:@localhost:1521:XE";

      //������ ������ ��������
      String user = "thwoo";
      String password = "1111";

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         //con�� ������ ����
         con = DriverManager.getConnection(url, user, password);
         System.out.print("DB ���� ����!");
      } catch(ClassNotFoundException cne) {
         System.out.println("DB���� ����:����̹�");
      } catch(SQLException se) {
         System.out.println("DB���� ����:DB����");
      }
      return con;
   }
}