package creational.AbstractFactory.products;

import creational.AbstractFactory.abst.Parser;

public class JsonParser implements Parser<JsonObject, String>{

	public JsonObject parse(String input) {
		return new JsonObject(input);
	}

}
