package creational.AbstractFactory.products;

import creational.AbstractFactory.abst.Parser;

public class XmlParser implements Parser<XmlObject, String>{

	public XmlObject parse(String input) {
		return new XmlObject(input);
	}

}
