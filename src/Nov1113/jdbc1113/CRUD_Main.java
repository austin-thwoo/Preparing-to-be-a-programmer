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
		
		//Sql 문을 실행하기 윗한 crud 객체 선언 
		CRUD_SQL crud = new CRUD_SQL();
		
		//학생 정보를 담아오는 stu 객체 선언
		CRUD_DTO stu = new CRUD_DTO();
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean run = true;
		int menu =0;
		while (run) {
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("1. DB접속 		2. DB해제");
			System.out.println("3. 학생등록 		4. 학생조회");
			System.out.println("5. 데이터 수정 		6. 학생삭제");
			System.out.println("7. 종료 ");
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("메뉴선택 --->");
			menu=sc.nextInt();
			switch (menu) {
			case 1:
				crud.connect();
				break;
			case 2:
				crud.conClose();
				break;

			case 3:
				System.out.println("학생정보 입력해주셈 ㅋㅁㅋ");
				System.out.print("이름 >>");
				String S_name= sc.next();
				stu.setStuNmae(S_name);
				System.out.println("나이>>");
				int age = sc.nextInt();
				stu.setStuAge(age);
				crud.stuJoin(stu);
				break;
			case 4:
				crud.select();
				break;
			case 5:
				System.out.println("누구꺼 바꿀꺼임()?");
				String str = sc.next();
				stu.setStuNmae(str);
				System.out.println("뭐로바꿀꺼임?");
				int st2 = sc.nextInt();
				stu.setStuAge(st2);
				crud.modification(stu);
				break;
			case 6:
				System.out.println("누구삭제할꺼임?");
				String Str = sc.next();
				stu.setStuNmae(Str);
				crud.deletEmp(stu);
				break;
			case 7:
				run =false;
				System.out.println("시스템 종료!");
				break;

			default:
				break;
			}
			
		}
}
}

