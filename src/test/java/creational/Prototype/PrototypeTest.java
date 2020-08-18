package creational.Prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class PrototypeTest {

	private CharacterStore characterStore;

	@Before
	public void setup() {
		characterStore = new CharacterStore();
	}

	@Test
	public void prototypeTestOk() {
		Character soldierCharlie = characterStore.getCharacter("SOLDIER");
		soldierCharlie.setName("Charlie");
		Character soldierSmith = characterStore.getCharacter("SOLDIER");
		soldierSmith.setName("Smith");
		Character zombie = characterStore.getCharacter("ZOMBIE");
		zombie.setName("soldierZombie1");
		assertEquals(soldierCharlie.getClass().getName(), SoldierCharacter.class.getName());
		assertNotEquals(soldierCharlie.getClass().getName(), zombie.getClass().getName());
		assertNotEquals(soldierCharlie.hashCode(), soldierSmith.hashCode());
		System.out.println(String.format("%s -> hashCode: %s -- %s -> hashCode: %s", soldierCharlie.getName(),
				soldierCharlie.hashCode(), soldierSmith.getName(), soldierSmith.hashCode()));

	}

}
