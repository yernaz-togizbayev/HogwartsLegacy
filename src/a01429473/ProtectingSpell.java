package a01429473;

import java.util.Set;

public class ProtectingSpell extends Spell {
	private Set<AttackingSpell> attacks; //must not be null or empty; use HashSet as concrete type
	
	@Override
	public void doEffect(MagicEffectRealization target) {
	//call setProtection method on target with attacks as parameter
	}

	@Override
	public String additionalOutputString() {
	//returns "; protects against 'listOfAttackSpells'" where 'listOfAttackSpells' is a bracketed list of all the attack spells (Java default toString method for sets)
	//e. g. "; protects against [[Confringo: 10 mana; -20 HP], [Bombarda: 20 mana; -50 % HP]]"
	}
}