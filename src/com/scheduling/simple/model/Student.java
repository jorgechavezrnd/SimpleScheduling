/*
 * Student.java
 */
package com.scheduling.simple.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.ArrayList;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student")
public class Student {
    
    @XmlElement(name = "studentId")
    private int studentId;
    @XmlElement(name = "lastName")
    private String lastName;
    @XmlElement(name = "firstName")
    private String firstName;
    @XmlElement(name = "classCodeList") 
    private List<MyClass> classCodeList;
    int aux;

    public Student() {
        aux=0;
    }
    
    public Student(int studentId, String lastName, String firstName) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        classCodeList = new ArrayList();
        aux=0;
    }
    
    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setClass(MyClass c){
        classCodeList.set(aux, c);
    }
    
    public MyClass getMyClass(){
        return classCodeList.get(aux);
    }
    
    public void addClass(MyClass c){
        classCodeList.add(c);
        aux++;
    }
}
