package kr.or.dgit.mybatis_code.dao;

import java.util.List;

import kr.or.dgit.mybatis_code.dto.Student;

public interface StudentDao {
	Student findStudentById(int studeId);

	int insertStudent(Student student);

	void deleteStudent(int studId);

	List<Student> findAllStudents();
}
