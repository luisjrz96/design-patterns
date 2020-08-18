package creational.Prototype;

public abstract class Character implements Cloneable{
	
	private String color;
	private String name;
	
	
	public Character(String color, String name) {
		this.color = color;
		this.name = name;
	}


	public abstract String getType();
	public abstract void attack();
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	protected Object clone(){
		Object cloned = null;
		try {
			cloned = super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
}
