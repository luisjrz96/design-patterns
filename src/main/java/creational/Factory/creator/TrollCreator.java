package creational.Factory.creator;

import creational.Factory.product.Character;
import creational.Factory.product.TrollCharacter;

public class TrollCreator extends CharacterGenerator{

	@Override
	public Character createCharacter() {
		return new TrollCharacter();
	}

}
