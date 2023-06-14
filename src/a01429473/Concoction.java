package a01429473;

import java.util.ArrayList;
import java.util.List;

/**
 * Concoctions can affect health and mana of the target at the same time and additionally
 * cast any number of spells
 * <p>
 * It is not allowed for health and mana to be both 0 and spells to be empty.
 * The concoction must at least have one effect
 */
public class Concoction extends Potion {

	private int health; // change of health on target; may be any int value
	private int mana; // change of mana on target; may be any int value
	private List<Spell> spells; // spells cast when concoction is consumed; must not be null but may be empty; Use ArrayList as concrete type
	
	/**
	 * @param name name
	 * @param usages number of usages still left
	 * @param price price
	 * @param weight weight
	 * @param health change of health on target
	 * @param mana change of mana on target
	 * @param spells list of spells that are cast when consuming the concoction 
	 */
	public Concoction(String name, int usages, int price, int weight, int health, int mana, List<Spell> spells) {
		super(name, usages, price, weight);
		
		if (spells == null)
			throw new IllegalArgumentException("spells must not be null");
		
		if (health == 0 && mana == 0 && spells.isEmpty())
			throw new IllegalArgumentException("The potion must at least have one effect");
		
		this.health = health;
		this.mana = mana;
		this.spells = new ArrayList<>(spells);
	}

	/**
	 * Returns "; '+/-''health' HP; '+/-''mana' MP; cast 'spells'";
	 * here '+/-' denotes the appropriate sign, spells will be a bracketed list
	 * of spells (Java default toString method for lists)
	 * e.g. (total result of toString) "[My Brew; 2 g; 2 Knuts; 4 gulps; -5 HP; +10 MP; cast [[Confringo -20 HP], [Diffindo -15 HP]]]"
	 * If health or mana is 0 or spells is empty, then the respective part(s) are suppressed
	 * e. g. "[Your Brew; 2 g; 1 Knut; 1 gulp; +5 MP]
	 * @return "; '+/-''health' HP; '+/-''mana' MP; cast 'spells'"
	 */
	@Override
	public String additionalOutputString() {
		StringBuilder concoctionOutput = new StringBuilder();
		
		if (health != 0)
			concoctionOutput.append("; " + ((health > 0) ? '+' : '-') + Math.abs(health) + " HP");
		
		if (mana != 0)
			concoctionOutput.append("; " + ((mana > 0) ? '+' : '-') + Math.abs(mana) + " MP");
		
		if (!spells.isEmpty())
			concoctionOutput.append("; cast " + spells);
		
		return concoctionOutput.toString();
	}

	/**
	 * If usages is greater than 0 reduce usages by 1 (tryUsage method) and
	 * change HP of target by health (call method heal(health) or takeDamage(health)
	 * depending on sign of health) and
	 * change MP of target by mana (call method enforceMagic(magic) or weakenMagic(magic)
	 * depending on sign of mana) and
	 * call cast Method for every spell in spells.
	 * @param target target that takes the magic effects
	 */
	@Override  
	public void useOn(MagicEffectRealization target) {
		if (tryUsage()) {
			if (health < 0)
				target.takeDamage(Math.abs(health));
			else
				target.heal(health);
			
			if (mana < 0)
				target.weakenMagic(Math.abs(mana));
			else
				target.enforceMagic(mana);
			
			for (Spell spell : spells)
				spell.cast(this, target);
		}
	}
}