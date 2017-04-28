/*
 * SimpleSchedulingResource.java
 */
package com.scheduling.simple.ws;

import com.scheduling.simple.model.MyClass;
import com.scheduling.simple.model.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class SimpleSchedulingResource {
    
    private Map<Integer, Student> studentsMap;
    private Map<String, MyClass> classMap;
    Scanner sc = new Scanner(System.in);

    public SimpleSchedulingResource() {
        studentsMap = new HashMap<Integer, Student>();
        classMap = new HashMap<String, MyClass>();
    }
    
    public Student createStudent(int studentId, String lastName, String firstName) {
        // TODO validate input data
        Student student = new Student(studentId, lastName, firstName);
        studentsMap.put(studentId, student);
        
        return student;
    }
    
    public MyClass createMyClass(String code,String title,String description){
        MyClass clase=new MyClass(code,title,description);
        classMap.put(code, clase);
        return clase;
    }

    public Student retrieveStudent(int studentId) {
        return studentsMap.get(studentId);
    }
    
    public Student retrieveStudent(String lastName) {
        return studentsMap.get(lastName);
    }
    
    public MyClass retrieveClass(String code){
        return classMap.get(code);
    }
    
    public Student EditStudent(int studentId,String lastName,String firstName ){
        Student s=retrieveStudent(studentId);
        if(s!=null){
            s.setFirstName(firstName);
            s.setLastName(lastName);
        }
        return s;
    }
    
    public MyClass EditClass(String code,String title, String description){
        MyClass c=retrieveClass(code);
        if(c!=null){
            c.setDescription(description);
            c.setTitle(title);
        }
        return c;
    }
    
    public boolean DeleteStudent(int studentId){
        return studentsMap.remove(studentId)!=null;
    }
    
    public boolean DeleteClass(String code){
        return classMap.remove(code)!=null;
    }
    
    public String ViewStudents(){
        /*for(int i=0; i<studentsMap.size(); i++) {
            System.out.println(studentsMap.values().toArray()[i]);
        }*/
        //return (Student) studentsMap;
        String resp = "";
        for(Student s : studentsMap.values()) {
            resp += s.getFirstName() + " " + s.getLastName() + ", ";
        }
        return resp;
    }
    
    public MyClass ViewClass(){
        for(int i=0;i<classMap.size();i++){
            System.out.println(classMap.values().toArray()[i]);
        }
        return (MyClass) classMap;
    }
    
    public void addStudentOfClass(String code){
        MyClass c=retrieveClass(code);
        if(c!=null){
           int studentId;
           String lastName,firstName;
           System.out.println("Id");
           studentId=sc.nextInt();
           System.out.println("lastName");
           lastName=sc.next();
           System.out.println("firstName");
           firstName=sc.next();
           Student s=createStudent(studentId,lastName,firstName);
           c.setStudent(s);
        }
    }
    public void addClassOfStudent(int studentId){
        Student s=retrieveStudent(studentId);
        if(s!=null){
           String code,title,description;
           System.out.println("code");
           code=sc.next();
           System.out.println("title");
           title=sc.next();
           System.out.println("description");
           description=sc.next();
           MyClass c=createMyClass(code,title,description);
           s.setClass(c);
        }
    }
    
    public MyClass ViewClassOfStudent(){
        for(int i=0;i<studentsMap.size();i++){
            System.out.println(studentsMap.values().toArray()[i]);
        }
        return (MyClass) studentsMap;
    }
    
    public Student ViewStudentOfClass(){
        for(int i=0;i<classMap.size();i++){
            System.out.println(classMap.values().toArray()[i]);
        }
        return (Student) classMap;
    }
    
}
