package creational.FactoryMethod.product;

public class TrollCharacter extends Character{

	public void attack() {
		System.out.println("Troll attack");
		
	}

	public void useSpecialAbility() {
		System.out.println("Troll special ability");
		
	}

	@Override
	public void regenerate() {
		System.out.println("Troll regeneration");
	}


}
