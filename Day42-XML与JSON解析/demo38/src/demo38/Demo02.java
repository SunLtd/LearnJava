package demo38;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo02 {

	public static void main(String[] args) {
		try {
            // 创建XML解析器工厂
            XMLInputFactory factory = XMLInputFactory.newInstance();
            // 创建XML解析器
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("src/books.xml"));

            // 遍历XML文档
            while (reader.hasNext()) {
            	//获取下一个事件
                int event = reader.next();
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT://开始事件
                        System.out.print(reader.getLocalName() + ": ");
                        // 打印元素的属性
                        for (int i = 0; i < reader.getAttributeCount(); i++) {
                        	//得到元素中的属性名及属性值
                            System.out.print(reader.getAttributeLocalName(i) + "=" + reader.getAttributeValue(i));
                        }
                        System.out.println();
                        break;
                    case XMLStreamConstants.CHARACTERS://匹配字符数据的事件
                        String text = reader.getText().trim();
                        if (!text.isEmpty()) {
                            System.out.println(text);
                        }
                        break;
                }
            }

            // 关闭XML解析器
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
	}
}
