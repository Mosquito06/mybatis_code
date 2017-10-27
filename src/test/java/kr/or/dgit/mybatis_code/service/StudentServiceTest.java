package kr.or.dgit.mybatis_code.service;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_code.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void test2FindAllStudents() {
		List<Student> lists = studentService.selectAllStudent();
		Assert.assertNotNull(lists);
	} 
	
	@Test
	public void test1CreatStudent() {
		Student std = new Student();
		std.setName("서현진");
		std.setEmail("seo@test.co.kr");
		std.setDob(new Date());
		
		int res = studentService.createStudent(std);
		Assert.assertEquals(1, res);
	
	}
	
	@Test
	public void test3SelectStudent() {
		Student std = new Student();
		std.setStudId(2);
				
		studentService.selectStudentByNo(std.getStudId());
		Assert.assertEquals(1, std.getStudId());
	}
	
	@Test
	public void test4DeleteStudent() {
		studentService.deleteStudent(1);
		Assert.assertEquals(1, 1);
	}
	

}
