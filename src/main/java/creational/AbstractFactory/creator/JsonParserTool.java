package creational.AbstractFactory.creator;

import creational.AbstractFactory.abst.Parser;
import creational.AbstractFactory.abst.Validator;
import creational.AbstractFactory.products.JsonParser;
import creational.AbstractFactory.products.JsonValidator;

public class JsonParserTool implements ParserTool{

	public Parser<?, String> createParser() {
		return new JsonParser();
	}

	public Validator createValidator() {
		return new JsonValidator();
	}

}
