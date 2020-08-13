package creational.FactoryMethod.creator;

import creational.FactoryMethod.product.Character;
import creational.FactoryMethod.product.OrcCharacter;

public class OrcCreator extends CharacterCreator{

	@Override
	public Character createCharacter() {
		return new OrcCharacter();
	}

}
