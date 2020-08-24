/* 컨트롤러(Controller)
 * - (Start)Veiw에서 요청 -> 요청 처리 결과 반환 -> (End)View 전달
 * - 요청값 - 수행 기능
 * 		1 - 모든 검색
 * 		2 - 개인 검색
 * 		3 - 저장
 * 		4 - 삭제
 * 		5 - 수정
 */

package controller;

import model.StudentModel;
import model.domain.Student;
import view.EndView;

public class StudentController {
	public static void request(int reqNumber) {
		if(reqNumber == 1) {
			EndView.printAll(StudentModel.getAll());	
		}else if(reqNumber == 2) {
			EndView.printOne(StudentModel.getOne("C++"));
		}else if(reqNumber == 3) {
			boolean r = StudentModel.insert(new Student("Go", 11));
			if(r) { 
				EndView.printSuccess("등록 성공");
			}else {
				EndView.printFail("등록 실패");
			}
		}else if(reqNumber == 4) {
			StudentModel.delete("Go");
		}else if(reqNumber == 5) {
			boolean u = StudentModel.ageUpdate(new Student("Python", 49));
			System.out.println(u);
//			if(u) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
		}else {
			EndView.printFail("요청하신 정보는 서비스 할 수 없습니다");
		}
	}
}
