/*
 * SimpleSchedulingWS.java
 */
package com.scheduling.simple.ws;

import com.scheduling.simple.model.MyClass;
import com.scheduling.simple.model.Student;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class SimpleSchedulingWS {
    
    private final SimpleSchedulingResource resource = new SimpleSchedulingResource();
    
    /**
     * Creates a new student.
     * @param studentId Integer
     * @param lastName String
     * @param firstName String
     * @return 
     */
    public Student createStudent(@WebParam(name = "studentId") int studentId, 
            @WebParam(name = "lastName") String lastName, 
            @WebParam(name = "firstName") String firstName) {
        return resource.createStudent(studentId, lastName, firstName);
    }
    
    public MyClass createClass(@WebParam(name = "code") String code, 
            @WebParam(name = "title") String title, 
            @WebParam(name = "description") String description){
        return resource.createMyClass(code, title, description);
    }
    /**
     * Return a student based on its studentId.
     * @param studentId Integer
     * @return 
     */
    public Student retrieveStudent(@WebParam(name="studentId")int studentId) {
        return resource.retrieveStudent(studentId);
    }
   
    
    
    public MyClass retrieve(@WebParam(name = "code") String code){
        return resource.retrieveClass(code);
    }
    
    public Student EditStudent(@WebParam(name = "studentId") int studentId , 
            @WebParam(name = "lastName") String lastName, 
            @WebParam(name = "firstName") String firstName){
        return resource.EditStudent(studentId, lastName, firstName);
    }
    
    public MyClass EditClass(@WebParam(name = "code") String code , 
            @WebParam(name = "title") String lastName, 
            @WebParam(name = "description") String description){
        return resource.EditClass(code, code, description);
    }
    
    public boolean DeleteStudent(@WebParam(name = "studentId") int studentId){
        return resource.DeleteStudent(studentId);
    }
    public boolean DeleteClass(@WebParam(name = "code") String code){
        return resource.DeleteClass(code);
    }
    
    public String ViewStudents(){
        return resource.ViewStudents();
    }
    
    public MyClass ViewClass(){
        return resource.ViewClass();
    }
    
    public void addStudentOfClass(@WebParam(name = "code")String code){
        resource.addStudentOfClass(code);
    }
    
    public void addClassOfStudent(@WebParam(name = "studentId")int studentId){
        resource.addClassOfStudent(studentId);
    }
    
    public MyClass ViewClassOfStudent(){
        return resource.ViewClassOfStudent();
    }
    
    public Student ViewStudentOfClass(){
        return resource.ViewStudentOfClass();
    }
    // add more methods to createClass, registerStudentToClass
}
