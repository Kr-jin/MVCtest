package view; 

import controller.StudentController;

public class StartView {

	public static void main(String[] args) {
		System.out.println("-- 모든 검색 --");
		StudentController.request(1);
		System.out.println("-- 학생 등록 --");
		StudentController.request(3);
		System.out.println("-- 등록 후 모든 검색 --");
		StudentController.request(1);
		System.out.println("-- 학생 삭제 --");
		StudentController.request(4);
		System.out.println("-- 삭제 후 모든 검색 --");
		StudentController.request(1);
		System.out.println("-- 학생 나이 업데이트 --");
		StudentController.request(5);
		System.out.println("-- 업데이트 후 모든 검색 --");
		StudentController.request(1);
//		
		System.out.println("-- 특정 학생 검색 --");
		StudentController.request(2);
	}

}
