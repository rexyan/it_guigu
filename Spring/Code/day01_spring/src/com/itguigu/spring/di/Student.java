package com.itguigu.spring.di;

public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	private Double score;
	private Teacher teacher;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", score=" + score
				+ ", teacher=" + teacher + "]";
	}
	
	public Student(Integer id, String name, Integer age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student() {
		super();
	}
	
	public Student(Integer id, String name, Double score, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	
	public Student(Integer id, String name, Integer age, String sex, Double score, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
		this.teacher = teacher;
	}
	
	
}
