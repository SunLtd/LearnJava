package demo37.orm.core;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import demo37.orm.annotation.Column;
import demo37.orm.annotation.Table;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 * ORM框架的核心类
 */
public class ORM {

	private Connection conn;

	//构造方法中设置数据库的url、用户名和密码
    public ORM(String url, String user, String password) {
        try {
        	//通过反射的第三种获取字节码方式来获取字节码对象
        	//加载Driver驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库Connection连接对象
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义一个数据库添加数据的方法
     * @param obj，实体类对象
     */
    public void save(Object obj) {
        Class clazz = obj.getClass();
        //得到某个实体对象上绑定的Table注解
        Table table = (Table) clazz.getAnnotation(Table.class);
        //得到实体类绑定的表名
        String tableName = table.name();

        //拼接insert into插值语句
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(tableName).append(" (");

        //获取实体类中每个属性上关联的列名
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Column column = field.getAnnotation(Column.class);
            if (column != null) {
            	//将列名拼接到insert语句中
                sb.append(column.name()).append(",");
            }
        }
        //去掉insert语句中多余的“,”
        sb.deleteCharAt(sb.length() - 1).append(") VALUES (");

        //在insert语句中，拼接values语句后面的值
        for (Field field : fields) {
            Column column = field.getAnnotation(Column.class);
            if (column != null) {
            	//对私有属性设置可访问性
                field.setAccessible(true);
                try {
                    sb.append("'").append(field.get(obj)).append("',");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        //去除insert语句中最后多余的","
        sb.deleteCharAt(sb.length() - 1).append(")");

        try {
        	//执行SQL语句
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sb.toString());
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭数据库连接
     */
    public void close() {
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
