/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltermassignementstudentmanagement;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author samiu
 */
public class Student 
{
    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty mobile;
    private final StringProperty  course;
     
    public Student()
    {
        id = new SimpleStringProperty(this, "id");
        name = new SimpleStringProperty(this, "name");
        mobile = new SimpleStringProperty(this, "mobile");
        course = new SimpleStringProperty(this, "course");
    }
    public StringProperty idProperty() { return id; }
    public String getId() { return id.get(); }
    public void setId(String newId) { id.set(newId); }
    public StringProperty nameProperty() { return name; }
    public String getName() { return name.get(); }
    public void setName(String newName) { name.set(newName); }
    public StringProperty mobileProperty() { return mobile; }
    public String getMobile() { return mobile.get(); }
    public void setMobile(String newMobile) { mobile.set(newMobile); }
    
    public StringProperty courseProperty() { return course; }
    public String getCourse() { return course.get(); }
    public void setCourse(String newCourse) { course.set(newCourse); }
}
