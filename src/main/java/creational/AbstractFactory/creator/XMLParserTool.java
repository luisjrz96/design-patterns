package creational.AbstractFactory.creator;

import creational.AbstractFactory.abst.Parser;
import creational.AbstractFactory.abst.Validator;
import creational.AbstractFactory.products.XmlParser;
import creational.AbstractFactory.products.XmlValidator;

public class XMLParserTool implements ParserTool{

	public Parser<?, String> createParser() {
		return new XmlParser();
	}

	public Validator createValidator() {
		return new XmlValidator();
	}
	

}
