package creational.Factory;

import org.junit.Test;

import creational.Factory.creator.CharacterGenerator;
import creational.Factory.director.FactoryDirector;
import creational.Factory.product.Character;
import creational.Factory.product.CharacterType;

public class FactoryTest {
	
	
	@Test
	public void factoryTest() {
		FactoryDirector director = new FactoryDirector();
		
		CharacterGenerator characterGenerator = director.getCreator(CharacterType.HUMAN);
		Character character = characterGenerator.createCharacter();
		character.attack();
		System.out.println("Human is: ".concat(character.isAlive()? "alive": "death"));
		
		characterGenerator = director.getCreator(CharacterType.TROLL);
		character = characterGenerator.createCharacter();
		character.attack();
		System.out.println("Troll is: ".concat(character.isAlive()? "alive": "death"));
		
		characterGenerator = director.getCreator(CharacterType.ORC);
		character = characterGenerator.createCharacter();
		character.setAlive(false);
		character.attack();
		System.out.println("Orc is: ".concat(character.isAlive()? "alive": "death"
				+ ""));
		
		
	}

}
