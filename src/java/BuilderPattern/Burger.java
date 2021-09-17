package java.BuilderPattern;

public abstract class Burger implements Item {
	@Override
	public Packing paking() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
