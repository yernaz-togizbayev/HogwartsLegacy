package a01429473;

import java.util.Set;

public class Wizard implements MagicSource, Trader, MagicEffectRealization {
	private String name; //not null not empty 
	private MagicLevel level; //not null
	private int basicHP; //not negative
	private int HP; //not negative; defaults to basicHP
	private int basicMP; //not less than the manapoints associated with the magic level
	private int MP; //not negative; defaults to basicMP
	private int money; //not negative
	private Set<Spell> knownSpells; //not null, may be empty; use HashSet for instantiation
	private Set<AttackingSpell> protectedFrom; //not null, may be empty; use HashSet for instantiation
	private int carryingCapacity; //not negative
	private Set<Tradeable> inventory; //not null, may be empty, use HashSet for instantiation, total weight of inventory may never exceed carryingCapacity

	public boolean isDead() {
	//return true, if HP is 0, false otherwise
	}  
	  
	private int inventoryTotalWeight() {
	//calculates and returns the total weight of all the items in the inventory
	}
	  
	public boolean learn(Spell s) {
	//if spell is null, IllegalArgumentException has to be thrown
	//if wizard is dead (isDead) no action can be taken and false is returned
	//add spell to the set of knownSpells
	//returns true if insertion was successful, false otherwise
	}
	  
	public boolean forget(Spell s) {
	//if spell is null, IllegalArgumentException has to be thrown
	//if wizard is dead (isDead) no action can be taken and false is returned
	//remove spell from the set of knownSpells
	//returns true if removal was successful, false otherwise
	}
	
	public boolean castSpell(Spell s, MagicEffectRealization target) {
	//if s or target is null, IllegalArgumentException has to be thrown
	//if wizard is dead (isDead) no action can be taken and false is returned
	//if wizard does not know the spell, false is returned
	//call cast on s whith this as source and parameter target as target
	//return true if cast was called
	}
	  
	public boolean castRandomSpell(MagicEffectRealization target) {
	//if this object's knownSpells is empty, return false
	//otherwise choose a random spell from knownSpells and delegate to castSpell(Spell, MagicEffectRealization)
	}
	  
	public boolean useItem(Tradeable item, MagicEffectRealization target) {
	//if item or target is null, IllegalArgumentException has to be thrown
	//if wizard is dead (isDead) no action can be taken and false is returned
	//if wizard does not possess the item, false is returned
	//call useOn on the item with parameter target as target
	//return true if useOn was called
	}

	public boolean useRandomItem(MagicEffectRealization target) {
	//if this object's inventory is empty, return false
	//otherwise choose a random item from inventory and delegate to useItem(MagicItem, MagicEffectRealization)
	}
	  
	public boolean sellItem(Tradeable item, Trader target) {
	//if item or target is null, IllegalArgumentException has to be thrown
	//if wizard is dead (isDead) no action can be taken and false is returned
	//call purchase on the item with this as seller and target as buyer
	//return true if purchase was called
	}

	public boolean sellRandomItem(Trader target) {
	//if this object's inventory is empty, return false
	//otherwise choose a random item from inventory and delegate to sellItem(MagicItem, MagicEffectRealization)
	}

	@Override
	public String toString() {
	//returns a string in the format "['name'('level'): 'HP'/'basicHP' 'MP'/'basicMP'; 'money' 'KnutOrKnuts'; knows 'knownSpells'; carries 'inventory'}"; where 'level' is the asterisks representation of the level (see MagicLevel.toString) and 'knownSpells' and 'inventory' use the default toString method of Java Set; 'KnutOrKnuts' is Knut if 'money' is 1, Knuts otherwise
	//e.g. [Ignatius(**): 70/100 100/150; 72 Knuts; knows [[Episkey(*): 5 mana; +20 HP], [Confringo: 10 mana; -20 HP]]; carries []]
	}
	
	//MagicSource Interface
	@Override
	public boolean provideMana(MagicLevel levelNeeded, int manaAmount) {
	//if wizard is dead (isDead) no action can be taken and false is returned
	//check if level is at least levelNeeded, return false
	//if MP<manaAmount return false
	//subtract manaAmount from MP and return true
	}

	//Trader Interface
	@Override
	public boolean possesses(Tradeable item) {
	//return true if the item is in the inventory, false otherwise
	}

	@Override
	public boolean canAfford(int amount) {
	//return true if money>=amount, false otherwise
	}

	@Override
	public boolean hasCapacity(int weight) {
	//return true if inventoryTotalWeight+weight<=carryingCapacity, false otherwise
	}

	@Override
	public boolean pay(int amount) {
	//if wizard is dead (isDead) no action can be taken and false is returned
	//if this owns enough money deduct amount from money and return true, return false otherwise
	}
	    
	@Override
	public boolean earn(int amount) {
	//if wizard is dead (isDead) no action can be taken and false is returned
	//add amount to this object's money and return true
	}
	    
	@Override
	public boolean addToInventory(Tradeable item) {
	//add item to inventory if carryingCapacity is sufficient
	//returns true if item is successfully added, false otherwise (carrying capacity exceeded or item is already in the inventory)
	}

	@Override
	public boolean removeFromInventory(Tradeable item) {
	//remove item from inventory
	//returns true if item is successfully removed, false otherwise (item not in the inventory)
	}
	
	@Override
	public boolean steal(Trader thief) {
	//if thief is null, IllegalARgumentException has to be thrown
	//if thief is dead (isDead) no action can be taken and false is returned
	//returns false if the object's inventory is empty
	//otherwise transfers a random item from the this object's inventory into the thief's inventory;
	//if the thief's inventory has not enough capacity the object just vanishes and false is returned
	//returns true if theft was successful
	}

	@Override
	public boolean isLootable() {
	//returns true if this object's HP are 0 (dead wizard)
	}
	  
	@Override
	public boolean loot(Trader looter) {
	//if looter is dead (isDead) no action can be taken and false is returned
	//if the this object can be looted (isLootable), transfer all the items in the object's inventory into the looter's inventory; 
	//items that don't fit in the looter's inventory because auf the weight limitation just vanish
	//returns true if at least one item was successfully transferred, false otherwise
	}
	  
	//MagicEffectRealization Interface
	@Override
	public void takeDamage(int amount) {
	//reduce the object's HP by amount ensuring however that HP does not become negative.
	}
	    
	@Override
	public void takeDamagePercent(int percentage) {
	//reduce the object's HP by the percentage given of the object's basic HP value ensuring however, that HP does not become negative. Do calculations in double truncating to int only for the assignment
	}
	    
	@Override
	public void weakenMagic(int amount) {
	//reduce the object's MP by amount ensuring however that MP does not become negative.
	}
	  
	@Override
	public void weakenMagicPercent(int percentage) {
	//reduce the object's MP by the percentage given of the object's basic MP value ensuring however, that MP does not become negative. Do calculations in double truncating to int only for the assignment
	}
	  
	@Override
	public void heal(int amount) {
	//increase the object's HP by the amount given.
	}
	    
	@Override
	public void healPercent(int percentage) {
	//increase the object's HP by the percentage given of the object's basic HP. Do calculations in double truncating to int only for the assignment
	}

	@Override
	public void enforceMagic(int amount) {
	//increase the object's MP by the amount given.
	}
	  
	@Override
	public void enforceMagicPercent(int percentage) {
	//increase the object's MP by the percentage given of the object's basic MP. Do calculations in double truncating to int only for the assignment
	}
	    
	@Override
	public boolean isProtected(Spell s) {
	//return true if s is contained in instance variable protectedFrom
	}
	    
	@Override
	public void setProtection(Set<AttackingSpell> attacks) {
	//add all spells from attacks to instance variable protectedFrom
	}

	@Override
	public void removeProtection(Set<AttackingSpell> attacks) {}
	//remove all spells from attacks from instance variable protectedFrom
}