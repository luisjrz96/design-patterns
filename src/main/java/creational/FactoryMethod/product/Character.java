package creational.FactoryMethod.product;

public abstract class Character {
	
	private boolean alive;
	
	public Character() {
		alive = true;
	}
	
	public abstract void attack();
	public abstract void useSpecialAbility();
	public abstract void regenerate();
	

	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	

}
