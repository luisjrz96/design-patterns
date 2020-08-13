package creational.FactoryMethod.product;

public class HumanCharacter extends Character{

	public void attack() {
		System.out.println("Human attack");
		
	}

	public void useSpecialAbility() {
		System.out.println("Human special ability");
		
	}

	public void regenerate() {
		System.out.println("Human regeneration");
	}


}
