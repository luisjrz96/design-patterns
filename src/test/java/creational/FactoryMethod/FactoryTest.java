package creational.FactoryMethod;

import org.junit.Test;

import creational.FactoryMethod.creator.CharacterCreator;
import creational.FactoryMethod.creator.HumanCreator;
import creational.FactoryMethod.creator.OrcCreator;
import creational.FactoryMethod.creator.TrollCreator;
import creational.FactoryMethod.product.Character;

public class FactoryTest {
	
	
	@Test
	public void factoryTest() {
		
		CharacterCreator creator = new HumanCreator();
		Character character = CharacterCreator.getCharacter(creator);
		character.attack();
		character.regenerate();
		
		creator = new TrollCreator();
		character = CharacterCreator.getCharacter(creator); //you can reuse memory
		character.attack();
		character.useSpecialAbility();
		
		
		creator = new OrcCreator();
		Character orc = CharacterCreator.getCharacter(creator); //you can create new instances if needed
		orc.attack();
		
	}

}
