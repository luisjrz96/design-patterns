package creational.AbstractFactory.products;

import creational.AbstractFactory.abst.Validator;

public class JsonValidator implements Validator{

	public boolean validate(String data) {
		System.out.println("Validating JSON");
		return true;
	}

}
