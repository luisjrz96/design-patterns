package creational.AbstractFactory.products;

import creational.AbstractFactory.abst.Validator;

public class XmlValidator implements Validator{

	public boolean validate(String data) {
		System.out.println("Validating XML");
		return true;
	}

}
