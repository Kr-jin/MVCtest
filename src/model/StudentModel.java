package model;

//import com.sun.beans.introspect.PropertyInfo.Name;

import model.domain.Student;

public class StudentModel {
	
	// DB역할
	private static Student[] allData = new Student[5];
	private static int index;
	
	
	// 가상의 데이터 저장
	// byte code가 로딩될때 자동으로 실행되는 특화된 코드
	static {
		allData[0] = new Student("Java", 25);
		allData[1] = new Student("Python", 29);
		allData[2] = new Student("C++", 37);
		index = 3;
	}
	
	
	// 가입메소드
	/* Student 객체가 배열에 저장
	 * 개발
	 *  고려사항 1 : 매개변수 값으로 name, age -> Student객체 생성 -> 배열에 저장
	 *  고려사항 2 : 매개변수 값으로 Student 객체 -> 배열에 저장 
	 */
	public static boolean insert(Student v){
		if(index < 5) {
			allData[index] = v;
			index++;
			return true;
		}else 
			return false;
	}
	
	
	// 삭제메소드
	/* 개발
	 * - 고려사항 1. 미존재 데이터 삭제 요청
	 * - 고려사항 2. 존재 데이터 삭제 요청
	 * - 삭제의 의미 : 배열의 값 삭제
	 * - 만약
	 * 		1. 마지막 index의 데이터 삭제
	 * 		2. 중간 index 데이터값 삭제
	 *       	- 모든 사람 정보 검색시 삭제 영역의 데이터 출력
	 *       	- 고려사항
	 *       		1. 실행시 없는 객체의 내용값 출력시 실행 에러 발생 가능성
	 *       		2. 검증 필수
	 *       
	 * - 이름으로 삭제 요청 : 이름 존재 여부 확인 후 삭제
	 * 		- 확인 방법	
	 * 		1. 반복문을 통한 값 비교
	 * 		2. 반환된 이름값과 매개변수값과 비교
	 * 		3. 만약 
	 * 			- 동일
	 * 				삭제 후 true return
	 * 				반복 종료
	 * 			- 미동일
	 * 				없는 경우엔 false return  
	 */
	public static boolean delete(String name){
		Student v = null;
		for(int i=0; i < allData.length; i++) {
				v = allData[i];
			if(v != null && v.getName().equals(name)) {
				allData[i] = null;
				return true;
			}
		}
			return false;
	}
	
	
	
	// 수정
	public static boolean ageUpdate(Student v) {

		for(int i=0; i<allData.length; i++) {
			if(allData[i].getName().equals(v.getName())) {
				System.out.println(allData[i].getName());
				allData[i].setAge(v.getAge());
				return true;
			}
		}return false;
		
	}

	// 한사람 정보만 검색
	public static Student getOne(String name){
		for(int i=0; i<allData.length; i++) {
			if(allData[i].getName().equals(name)) {
				return allData[i];
			}else
			allData[0] = new Student("Fail", 0);
		
		} return allData[0];
	}

	
	// 모든 학생들 검색
	public static Student[] getAll(){
		return allData;
	}
	
	
}
