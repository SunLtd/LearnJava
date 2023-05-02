package demo37.orm.entity;

import demo37.orm.annotation.Column;
import demo37.orm.annotation.Table;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
@Table(name = "user")//关联自定义注解@Table,将类名与表名建立映射
public class User {

	//关联自定义注解@Column，将属性名与列名建立映射
	@Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "age")
    private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
    
}
