public class Sign implements GameThing, Readable, Edible {
	public String getName()
	{
		return "A chocolate sign";
	}
	public String getDescription()
	{
		return "This is a small chocolate sign. There seems to be some partially faded writing in it.";
	}
	public void read() {
		System.out.println("You can see the following messsage: \"John was here!\"");
	}
	public void eat() {
		System.out.println("You just ate that chocolate sign!");
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
	}
}
