package creational.Factory.creator;

import creational.Factory.product.Character;
import creational.Factory.product.OrcCharacter;

public class OrcCreator extends CharacterGenerator{

	@Override
	public Character createCharacter() {
		return new OrcCharacter();
	}

}
