package creational.AbstractFactory.creator;

import creational.AbstractFactory.abst.Parser;
import creational.AbstractFactory.abst.Validator;

public interface ParserTool {
	
	public Parser<?, String> createParser();
	public Validator createValidator();

}
