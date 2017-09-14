package com.pezhmankasraee.schoolctrl;

import com.pezhmankasraee.student.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A class
 */
@RestController
@RequestMapping("/")
public class SchoolController {

    @RequestMapping("/appname")
    public String printApplicationName(){
        return "<h6>This application is called \"School\" which is based on RESTful software architecture.</h6>";
    }

    @RequestMapping("/name/{firstName}")
    public String printSurname(@PathVariable(name = "firstName") String firstName){

        return "pezhman".equals(firstName.toLowerCase()) ? "Author: Pezhman Kasraee."
                : "Unknown input<br>Please contact me@pezhmankasraee.com";
    }

    @RequestMapping("/student")
    public Student getStudent(){

        return new Student("760207-123", "Pezhman Kasraee", "MSc SE");
    }
}
