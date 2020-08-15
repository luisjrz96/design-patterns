package creational.AbstractFactory.abst;

public interface Parser<R, T> {
	public R parse(T data);
}
