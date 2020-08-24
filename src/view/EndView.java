package view;

import model.domain.Student;

public class EndView {
	//모든 데이터 출력
	/* 고려사항1 : 객체가 없는 값이 출력되는 경우
	 */
	public static void printAll(Student[] all){
		for(Student v: all) {
			if(v!=null) {
				System.out.println(v);
			}
		}
	}
	
	public static void printSuccess(String msg) {
		System.out.println(msg);
	}

	public static void printFail(String msg) {
		System.out.println(msg);
	}
	
	// 한명 출력
	public static void printOne(Student one) {
		System.out.println(one);
	}
}
