package creational.AbstractFactory;

import org.junit.Assert;
import org.junit.Test;

import creational.AbstractFactory.abst.Parser;
import creational.AbstractFactory.abst.Validator;
import creational.AbstractFactory.creator.JsonParserTool;
import creational.AbstractFactory.creator.ParserTool;
import creational.AbstractFactory.creator.XMLParserTool;
import creational.AbstractFactory.products.JsonObject;
import creational.AbstractFactory.products.JsonParser;
import creational.AbstractFactory.products.XmlObject;
import creational.AbstractFactory.products.XmlParser;

public class AbstractFactoryTest {

	
	@Test
	public void test() {
		ParserTool xmlParserTool = new XMLParserTool();
		Parser<?, String> xmlParser =  xmlParserTool.createParser();
		Validator xmlvalidator = xmlParserTool.createValidator();
		XmlObject xmlObject = (XmlObject) xmlParser.parse("<greeting>Hello</greeting>");
		xmlvalidator.validate("<greeting>Hello</greeting>");
		System.out.println(xmlObject.getData());
		
		ParserTool jsonParserTool = new JsonParserTool();
		Parser<?, String> jsonParser = jsonParserTool.createParser();
		Validator jsonValidator = jsonParserTool.createValidator();
		jsonValidator.validate("{\"greeting\":\"Hello\"}");
		JsonObject jsonObject = (JsonObject) jsonParser.parse("{\"greeting\":\"Hello\"}");
		System.out.println(jsonObject.getData());
		Assert.assertEquals(xmlParser.getClass(), XmlParser.class);
		Assert.assertEquals(jsonParser.getClass(), JsonParser.class);
		Assert.assertNotEquals(jsonParser.getClass(), XmlParser.class);
		
		
	}
}
