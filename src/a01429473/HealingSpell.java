package a01429473;

public class HealingSpell extends Spell {
	private boolean type;
	private boolean percentage;
	private int amount; //has to be non negative; if percentage==true, amount must be in the interval [0,100]

	@Override
	public void doEffect(MagicEffectRealization target) {
	//use one of the functions heal, healPercent, enforceMagic or enforceMagicPercent according to the flags type and percentage
	}

	@Override
	public String additionalOutputString() {
	//returns "; +amount 'percentage' 'HPorMP'", where 'percentage' is a '%'-sign if percentage is true, empty otherwise and HPorMP is HP if type is true, MP otherwise
	//e. g. "; +10 HP" or "; +50 % MP"
	}
}