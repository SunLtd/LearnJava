package demo38;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo01 {

	public static void main(String[] args) {
		try {
			// 创建DOM解析器工厂
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// 创建DOM解析器
			DocumentBuilder builder = factory.newDocumentBuilder();
			// 加载XML文件，解析XML文档
			Document doc = builder.parse(new File("src/books.xml"));

			// 获取根元素
			Element root = doc.getDocumentElement();
			System.out.println("根元素：" + root.getNodeName());

			// 获取所有的book元素
			NodeList books = root.getElementsByTagName("book");
			for (int i = 0; i < books.getLength(); i++) {
				//得到得到每一个book元素
				Element book = (Element) books.item(i);
				System.out.println("book元素：");

				// 获取book元素中的category属性
				String category = book.getAttribute("category");
				System.out.println("category属性：" + category);

				// 获取title元素
				Element title = (Element) book.getElementsByTagName("title").item(0);
				//获取title里的lang属性
				String lang = title.getAttribute("lang");
				//得到元素中的第一个孩子的节点内容
				String text = title.getFirstChild().getNodeValue();
				System.out.println("title元素：" + lang + " " + text);

				// 获取author元素
				Element author = (Element) book.getElementsByTagName("author").item(0);
				String authorText = author.getFirstChild().getNodeValue();
				System.out.println("author元素：" + authorText);

				// 获取year元素
				Element year = (Element) book.getElementsByTagName("year").item(0);
				String yearText = year.getFirstChild().getNodeValue();
				System.out.println("year元素：" + yearText);

				// 获取price元素
				Element price = (Element) book.getElementsByTagName("price").item(0);
				String priceText = price.getFirstChild().getNodeValue();
				System.out.println("price元素：" + priceText);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
