package a01429473;

public interface Trader {
	boolean possesses(Tradeable item);
	//if item is null an IllegalArgumentException must be thrown;
	//returns true if this object possesses the item, false otherwise

	boolean canAfford(int amount);
    //if amount is negative, an IllegalArgumentException must be thrown;
    //returns true if the object has enough money, false otherwise

	boolean hasCapacity(int weight);
    //if weight is negative, an IllegalArgumentException must be thrown;
    //returns true if the weight can be added to the object's inventory without exceeding the maximum weight capacity

	boolean pay(int amount);
    //if amount is negative, an IllegalArgumentException must be thrown;
    //if this owns enough money, deduct amount from money and return true, return false otherwise

	boolean earn(int amount);
    //if amount is negative, an IllegalArgumentException must be thrown;
    //add amount to this object's money and return true

	boolean addToInventory(Tradeable item);
    //if item is null, an IllegalArgumentException must be thrown;
    //if inventory capacity would be exceeded, return false 
    //adds item to the inventory and returns true on success, false if adding the item failed

	boolean removeFromInventory(Tradeable item);
    //if item is null, an IllegalArgumentException must be thrown;
    //removes item from the inventory and returns true on success, false if removing the item failed
	
	default boolean canSteal ();
	// returns true if the object is capable to steal ;
	// default implementation always returns false
	// this will be overridden for the class Wizard , so that only living
	// Wizards can steal
	

	boolean steal(Trader thief);
    //if thief is null, an IllegalArgumentException must be thrown;
	// if thief cannot steal ( canSteal returns false ) no action can be taken and false is returned
    //returns false if the object's inventory is empty
    //otherwise transfers a random item from the this object's inventory into the thief's inventory;
    //if the thief's inventory has not enough capacity, the object just vanishes and false is returned
    //returns true if theft was successful
	
	default boolean isLootable() {
    //returns true if the object can be looted;
    //default implementation always returns false
    //this will be overridden for the class Wizard, so that dead Wizards may be looted
	}
	
	default boolean canLoot ();
	// returns true if the object is capable to loot ;
	// default implementation always returns false
	// this will be overridden for the class Wizard , so that only living
	// Wizards can loot
	

	boolean loot(Trader looter);
    //if looter is null, an IllegalArgumentException must be thrown;
    //if the object can be looted (isLootable), transfer all the items in the object's inventory into the looter's inventory; 
    //items that don't fit in the looter's inventory because of the weight limitation just vanish
    //returns true if at least one item was successfully transferred, false otherwise}
}