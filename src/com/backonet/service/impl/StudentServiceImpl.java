package com.backonet.service.impl;

import com.backonet.dao.StudentDAO;
import com.backonet.domain.Student;

public class StudentServiceImpl {

	private StudentDAO studentDAO;

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public StudentServiceImpl() {		
	}
	
	public Double computeAverageForStudent(Integer studentId) {
		
		Double result = 0.0;
		
		Student student = this.studentDAO.retrieveStudent(studentId);
		
		if (!student.getNotes().isEmpty()) {
			for (Double note : student.getNotes()) {
				result = result + note;
			}
			result = result / student.getNotes().size();
		}
		else {
			result = null;
		}
		
		return result;
	}
}