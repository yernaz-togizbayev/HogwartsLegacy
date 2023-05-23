package a01429473;

import java.util.List;

public class Concoction extends Potion {
	private int health;  //may be any int value
	private int mana;    //may be any int value
	private List<Spell> spells; //must not be null but may be empty; Use ArrayList as concrete type
	//it is not allowed for health and mana to be both 0 and spells to be empty; The potion must at least have one effect
	  
	@Override
	public String additionalOutputString() {
	//returns "; '+/-''health' HP; '+/-''mana' MP; cast 'spells' ";
	//here '+/-' denotes the appropriate sign, spells will be a bracketed list of spells (Java default toString method for lists)
	//e.g. (total result of toString) "[My Brew; 2 g; 2 Knuts; 4 gulps; -5 HP; +10 MP; cast [[Confringo -20 health], [Diffindo -15 health]]]"
	//if health or mana is 0 or spells is empty, then the respective part(s) are suppressed e. g. "[Your Brew; 2 g; 1 Knut; 1 gulp; +5 MP]
	}

	@Override  
	public void useOn(MagicEffectRealization target) {
	//if usages>0 reduce usages by 1 (tryUsage method) and
	//change HP of target by health (call method heal(health) or takeDamage(health) depending on sign of health)
	//change MP of target by mana (call method enforceMagic(magic) or wakenMagic(magic) depending on sign of magic)
	//call cast Method for every spell in spells
	}
}