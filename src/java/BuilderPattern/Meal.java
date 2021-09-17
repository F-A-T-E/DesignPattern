package java.BuilderPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
		Objects.nonNull(items);
	}

}
