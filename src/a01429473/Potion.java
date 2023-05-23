package a01429473;

public abstract class Potion extends MagicItem {
	public void drink(Wizard drinker) {
	//delegates to method call useOn(drinker)
	}
	  
	@Override
	public String usageString() {
	//returns "gulp" if usages is equal to 1, "gulps" otherwise
	}
}