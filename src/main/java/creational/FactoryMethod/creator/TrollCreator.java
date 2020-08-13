package creational.FactoryMethod.creator;

import creational.FactoryMethod.product.Character;
import creational.FactoryMethod.product.TrollCharacter;

public class TrollCreator extends CharacterCreator{

	@Override
	public Character createCharacter() {
		return new TrollCharacter();
	}

}
