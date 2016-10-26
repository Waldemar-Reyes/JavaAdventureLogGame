
public class Apple implements GameThing, Edible {
	public String getName() {
		return "An apple";
	}
	public String getDescription() {
		return "This is a fresh looking green apple!";
	}
	public void eat() {
		System.out.println("You enjoyed that fresh looking green apple!");
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
	}
}
