package com.bankonet.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.backonet.dao.StudentDAO;
import com.backonet.domain.Student;
import com.backonet.service.impl.StudentServiceImpl;

public class StudentServiceTest {
	
	public final static Double DELTA_FOR_DOUBLE_ASSERT = 0.00000000001; 
	
	private StudentServiceImpl studentServiceImpl;
	
	@Mock
	private StudentDAO studentDAO;
	
	@Before
	public void init() {
		
		MockitoAnnotations.initMocks(this);
		
		this.studentServiceImpl = new StudentServiceImpl();
		
		this.studentServiceImpl.setStudentDAO(this.studentDAO);

	}
	
	@Test
	public void testStudentWithNotes(){
		
		Student student31 = new Student();
		student31.addNote(20.0);
		student31.addNote(16.0);
		
		Mockito.when(this.studentDAO.retrieveStudent(31)).thenReturn(student31);
		
		Assert.assertEquals(18.0, this.studentServiceImpl.computeAverageForStudent(31),DELTA_FOR_DOUBLE_ASSERT);
	}
	
	@Test
	public void testStudentWithNoNotes(){
		
		Student student30 = new Student();
		
		Mockito.when(this.studentDAO.retrieveStudent(30)).thenReturn(student30);
		
		Assert.assertNull(this.studentServiceImpl.computeAverageForStudent(30));
	}
}
