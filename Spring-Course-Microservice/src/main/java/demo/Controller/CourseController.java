package demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import demo.Entity.Course;
import demo.Service.CourseService;
@RestController
@RequestMapping("/Course")
public class CourseController {
	
@Autowired	
private CourseService service;	
	
	
	@GetMapping("/{id}")
	public Course get(@PathVariable int id) {
		return service.get_One(id);
	}
	
	@GetMapping("/AllCourses")
	public List<Course> get_all(){
		return service.get_All();
	}
	
	@PostMapping("/AddCourse")
	public Course add(@RequestBody Course course) {
		return service.add_course(course);
		
	}
	


	

}
