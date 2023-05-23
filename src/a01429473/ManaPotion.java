package a01429473;

public class ManaPotion extends Potion {
	private int mana; //must not be negative

	@Override
	public String additionalOutputString() {
	//returns "; +'mana' MP";
	//e.g. (total result of toString) "[Mana Potion; 1 g; 2 Knuts; 1 gulp; +20 mana]"
	}

	@Override  
	public void useOn(MagicEffectRealization target) {
	//if usages>0 reduce usages by 1 (tryUsage method) and
	//increase MP of target bei mana (call method enforceMagic(mana)
	}
}