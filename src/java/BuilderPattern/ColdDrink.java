package java.BuilderPattern;

public abstract class ColdDrink implements Item {

	@Override
	public Packing paking() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
