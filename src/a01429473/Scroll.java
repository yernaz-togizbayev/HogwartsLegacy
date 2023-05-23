package a01429473;

public class Scroll extends MagicItem {
	private Spell spell;
	  
	@Override
	public String additionalOutputString() {
	//returns "; casts 'spell'"
	//e.g. (total result of toString) "[Scroll of doom; 1 g; 100 Knuts; 5 usages; casts [Bombarda: 20 mana; -50 % HP]]"
	}

	@Override  
	public void useOn(MagicEffectRealization target) {
	//if usages>0 reduce usages by 1 (tryUsage method) and
	//cast the spell using this as magic source and parameter target as target 
	}
}