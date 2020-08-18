package creational.Prototype;

public class ZombieCharacter extends Character{

	public ZombieCharacter(String color, String name) {
		super(color, name);
	}

	@Override
	public String getType() {
		return "ZOMBIE";
	}

	@Override
	public void attack() {
		System.out.println("ZOMBIE ATTACK");
	}

}
