package Nov1113.jdbc1113;

import java.sql.SQLException;
import java.util.Scanner;

public class CRUD_Main {
	public static void main(String[] args) {
	
		/*CRUD
		 * Create
		 * Read
		 * Update
		 * Delete*/
		
		//Sql ���� �����ϱ� ���� crud ��ü ���� 
		CRUD_SQL crud = new CRUD_SQL();
		
		//�л� ������ ��ƿ��� stu ��ü ����
		CRUD_DTO stu = new CRUD_DTO();
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean run = true;
		int menu =0;
		while (run) {
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("1. DB���� 		2. DB����");
			System.out.println("3. �л���� 		4. �л���ȸ");
			System.out.println("5. ������ ���� 		6. �л�����");
			System.out.println("7. ���� ");
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("�޴����� --->");
			menu=sc.nextInt();
			switch (menu) {
			case 1:
				crud.connect();
				break;
			case 2:
				crud.conClose();
				break;

			case 3:
				System.out.println("�л����� �Է����ּ� ������");
				System.out.print("�̸� >>");
				String S_name= sc.next();
				stu.setStuNmae(S_name);
				System.out.println("����>>");
				int age = sc.nextInt();
				stu.setStuAge(age);
				crud.stuJoin(stu);
				break;
			case 4:
				crud.select();
				break;
			case 5:
				System.out.println("������ �ٲܲ���()?");
				String str = sc.next();
				stu.setStuNmae(str);
				System.out.println("���ιٲܲ���?");
				int st2 = sc.nextInt();
				stu.setStuAge(st2);
				crud.modification(stu);
				break;
			case 6:
				System.out.println("���������Ҳ���?");
				String Str = sc.next();
				stu.setStuNmae(Str);
				crud.deletEmp(stu);
				break;
			case 7:
				run =false;
				System.out.println("�ý��� ����!");
				break;

			default:
				break;
			}
			
		}
}
}

