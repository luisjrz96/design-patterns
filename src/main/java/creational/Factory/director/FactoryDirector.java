package creational.Factory.director;

import creational.Factory.creator.CharacterGenerator;
import creational.Factory.creator.HumanCreator;
import creational.Factory.creator.OrcCreator;
import creational.Factory.creator.TrollCreator;
import creational.Factory.product.CharacterType;

public class FactoryDirector {

	public CharacterGenerator getCreator(CharacterType characterType) {
		switch (characterType) {
		case HUMAN:
			return new HumanCreator();
		case TROLL:
			return new TrollCreator();
		case ORC:
			return new OrcCreator();
		default:
			throw new RuntimeException("Character type not available");
		}
	}

}
