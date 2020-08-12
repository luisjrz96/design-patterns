package creational.Factory.creator;

import creational.Factory.product.Character;
import creational.Factory.product.HumanCharacter;

public class HumanCreator extends CharacterGenerator{

	@Override
	public Character createCharacter() {
		return new HumanCharacter();
	}
	
}
