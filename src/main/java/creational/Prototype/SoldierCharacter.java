package creational.Prototype;

public class SoldierCharacter extends Character{

	
	
	public SoldierCharacter(String color, String name) {
		super(color, name);
	}

	@Override
	public String getType() {
		return "SOLDIER";
	}

	@Override
	public void attack() {
		System.out.println("SOLDIER ATTACK");
	}

}
