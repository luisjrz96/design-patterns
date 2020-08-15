package creational.AbstractFactory.products;

import creational.AbstractFactory.abst.Data;

public class XmlObject extends Data{

	public XmlObject(String value) {
		super(value);
	}

	public String getData() {
		return "This should be a XML object: ".concat(value);
	}

}
