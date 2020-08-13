package creational.FactoryMethod.creator;

import creational.FactoryMethod.product.Character;

public abstract class CharacterCreator {
		
	
	public static Character getCharacter(CharacterCreator characterCreator) {
		Character character = characterCreator.createCharacter();
		return character;
	}
	
	public abstract Character createCharacter();

}
