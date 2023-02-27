package comstest.springd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getstudent(){
        return new Student("rishav","mahaptra");
    }
    public List<Student> getStudents{
        ret

    }

}
