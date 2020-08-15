package creational.AbstractFactory.abst;

public abstract class Data {
	
	protected String value;
	
	public Data(String value) {
		this.value = value;
	}
	
	public abstract String getData();
}
