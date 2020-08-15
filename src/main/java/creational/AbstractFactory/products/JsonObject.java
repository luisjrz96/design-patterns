package creational.AbstractFactory.products;

import creational.AbstractFactory.abst.Data;

public class JsonObject extends Data{

	public JsonObject(String value) {
		super(value);
	}

	public String getData() {
		return "This should be a JSON object: ".concat(value);
	}

}
