package demo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import demo.Entity.Course;
import demo.Entity.Student;
import demo.Repository.StudentRepository;

import  demo.Entity.StudentDetail;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	@Autowired 
	RestTemplate restTemplate;
	
	Logger logger = LoggerFactory.getLogger(StudentService.class);
	
	 public StudentDetail  getById(int id) {
		 
		 logger.info("Student Logger get Info");
		 
		 Student s= repo.findById(id).orElse(null);
		 StudentDetail sd = new StudentDetail();
		 Course c = new Course();
		 c = restTemplate.getForObject("http://Course-Microservice/Course/" + s.getCourseId() , Course.class) ;
		 
		 sd.setStudent(s);
		 sd.setCourse(c);
		 return sd;
	 }
	
		 
		public  Student save(Student student) {
			logger.info("Student Logger post Info");
			return repo.save(student);
			 
		 }
	
	
	

}
