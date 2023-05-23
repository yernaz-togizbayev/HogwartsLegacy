package a01429473;

public class HealthPotion extends Potion {
	private int health;  //must not be negative

	@Override
	public String additionalOutputString() {
	//returns "; +'health' HP";
	//e.g. (total result of toString) "[Health Potion; 1 g; 1 Knut; 5 gulps; +10 health]"
	}

	@Override  
	public void useOn(MagicEffectRealization target) {
	//if usages>0 reduce usages by 1 (tryUsage method) and
	//increase HP of target by health (call method heal(health)
	}
}