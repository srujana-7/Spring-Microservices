package demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.Service.StudentService;

import demo.Entity.Course;
import demo.Entity.Student;
import demo.Entity.StudentDetail;

@RestController
@RequestMapping("/Student")
public class Controller {

	@Autowired
	private StudentService service;
	
	
	
	Logger logger = LoggerFactory.getLogger(StudentService.class);
	
	
	@GetMapping("/Welcome")
	public String Welcome() {
		logger.info(" Logger get method called ");
		return "Welcome to Spring Boot Microservices !!" ;
	
		
	}
	
	
	@GetMapping("/{id}")
	public StudentDetail Get_By_id(@PathVariable int id) {
		return service.getById(id);
		
	}
	
	
	 
	
//public String fallback(Exception e) {

//	return " Course service is not running" ;
	//}
	
	@PostMapping("/Post")
	public Student save(@RequestBody Student student) {
		
	 return	service.save(student);
		
	}
	
	
}
