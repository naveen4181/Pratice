package servlet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

@Entity
public class pojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private	int id;

	
	
	
	
private String name;
private	String age;
private	String sal; 
private	String job;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getSal() {
	return sal;
}
public void setSal(String sal) {
	this.sal = sal;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
}