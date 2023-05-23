package a01429473;

public abstract class MagicItem implements Tradeable, MagicEffectRealization, MagicSource {
	private String name; //must not be null or empty
	private int usages; //number of usages remaining; must not be negative
	private int price;  //must not be negative
	private int weight; //must not be negative

	public int getUsages() {
    //returns value of usages (for access from deriving classes)
	}

	public boolean tryUsage() {
    //if usages > 0 reduce usage by 1 and return true, otherwise return false
	}

	public String usageString() {
    //returns "use" if usages is equal to 1, "uses" otherwise
	}

	public String additionalOutputString() {
    //returns empty string. Is overridden in deriving classes as needed
	}

	@Override 
	public String toString() {
    //formats this object according to "['name'; 'weight' g; 'price' 'currencyString'; 'usages' 'usageString''additionalOutputString']"
    //'currencyString' is "Knut" if price is 1, "Knuts" otherwise
    //e.g. (when additionalOutput() returns an empty string) "[Accio Scroll; 1 g; 1 Knut; 5 uses]" or "[Alohomora Scroll; 1 g; 10 Knuts; 1 use]"
	}

	//Tradeable Interface:
	@Override
	public int getPrice() {
    //returns price of the object
	}

	@Override    

	public int getWeight() {
    //returns weight of the object
	}
	  
	//MagicSource Interface:
	@Override
	public boolean provideMana(MagicLevel levelNeeded, int amount) {
    //always returns true; no Exceptions needed
	}

	//MagicEffectRealization Interface:
	@Override
	public void takeDamagePercent(int percentage) {
	//reduce usages to usages*(1-percentage/100.)
	}
}