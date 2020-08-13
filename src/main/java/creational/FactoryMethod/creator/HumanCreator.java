package creational.FactoryMethod.creator;

import creational.FactoryMethod.product.Character;
import creational.FactoryMethod.product.HumanCharacter;

public class HumanCreator extends CharacterCreator{

	@Override
	public Character createCharacter() {
		return new HumanCharacter();
	}
	
}
