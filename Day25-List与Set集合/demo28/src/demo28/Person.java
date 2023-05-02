package demo28;

/**
 * @author 一一哥Sun
 * 实现Comparable接口，并重新compareTo()方法
 */
public class Person implements Comparable<Person>{

	private String username;
    private String password;
    
    public Person() {
    }
    
    public Person(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + "]";
    }

    //重写compareTo()方法,对Person对象进行比较
    @Override
    public int compareTo(Person o) {
        if(!this.username.equals(o.username)) {
        	//根据姓名及长度进行比较
            return this.username.length() - o.username.length();
        }else {
        	//根据密码进行比较
            if(this.password.equals(o.password)) {
                return 0;
            }else {
            	//比较姓名的长度
                return this.username.length() - o.username.length();
            }
        }
    }
}
