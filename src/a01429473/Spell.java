package a01429473;

public abstract class Spell {
	private String name;  //must not be null or empty
	private int manaCost; //must not be negative
	private MagicLevel levelNeeded; //must not be null
	  
	public void cast(MagicSource source, MagicEffectRealization target) {
	//ensure necessary magic level and get necessary energy by calling provideMana on source (this will typically reduce MP in source)
	//if provideMana fails (returns false) cast is canceled
	//otherwise the abstract method doEffect is called
	}
	  
	public abstract void doEffect(MagicEffectRealization target);
	//the actual effect of the spell on target must be implemented by the subclasses
	  
	public String additionalOutputString() {
	//returns ""; is overridden in deriving classes when needed
	}
	  
	@Override
	public String toString() {
	//return output in format "['name'('levelNeeded'): 'manaCost' mana'additionalOutputString']"; where 'levelNeeded' is displayed as asterisks (see MagicLevel.toString)
	//e.g. (full Output containing additionalOutputString) [Episkey(*): 5 mana; +20 HP]
	}
}