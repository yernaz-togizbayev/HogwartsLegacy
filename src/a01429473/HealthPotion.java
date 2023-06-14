package a01429473;

/**
 * HealthPotions increase the consumer's mana
 */
public class HealthPotion extends Potion {
	
	private int health; // Must not be negative
	
	/**
	 * @param name name
	 * @param usages number of usages still left
	 * @param price price
	 * @param weight weight
	 */
	public HealthPotion(String name, int usages, int price, int weight) {
		super(name, usages, price, weight);
	}
	
	/**
	 * @param name name
	 * @param usages number of usages still left
	 * @param price price
	 * @param weight weight
	 * @param health change of health on consumer
	 */
	public HealthPotion(String name, int usages, int price, int weight, int health) {
		super(name, usages, price, weight);
		
		if (health < 0)
			throw new IllegalArgumentException("health must not be negative");
		
		this.health = health;
	}

	/**
	 * returns "; +'health' HP".
	 * e.g. (total result of toString) "[Health Potion; 1 g; 1 Knut; 5 gulps; +10 HP]"
	 * @return "; +'health' HP"
	 */
	@Override
	public String additionalOutputString() {
		return "; +" + health + " HP";
	}

	/**
	 * If usages is greater than 0 reduce usages by 1 (tryUsage method) and
	 * increase HP of target by health (call method heal(health))
	 * @param target target on which to object is to be used on
	 */
	@Override  
	public void useOn(MagicEffectRealization target) {
		if (tryUsage())
			target.heal(health);
	}

	/**
	 * Returns health of consumer
	 * @return health of consumer
	 */
	public int getHealth() { return health; }
}