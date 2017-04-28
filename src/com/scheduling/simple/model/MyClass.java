/*
 * Class.java
 */
package com.scheduling.simple.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class")
public class MyClass {
    
    @XmlElement(name = "code")
    private String code;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String description;
    private List<Student> studentIdList;
    int aux;

    /**
     * @return the code
     */
    public MyClass(){
        aux=0;
    }
    
    public MyClass(String code,String title,String description){
        this.code=code;
        this.title=title;
        this.description=description;
        aux=0;
    }
    
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setStudent(Student s){
        studentIdList.set(aux, s);
    }
    
    public Student getStudent(){
        return studentIdList.get(aux);
    }
    
    public void addStudent(Student s){
        studentIdList.add(s);
        aux++;
    }
}
