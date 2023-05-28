package a01429473;

public interface Tradeable {
	int getPrice();
    //returns price of the object

	int getWeight();
    //returns weight of the object

	private boolean transfer(Trader from, Trader to) {
    //caution: this method transfers the item from from's inventory to to's inventory without any checks. It has to be ensured that all necessary conditions for the transfer are met before calling this function.
    //The default implementation calls removeFromInventory on from and addToInventory on to and returns true if both calls succeded (returned true)
	}

	default boolean give(Trader giver, Trader taker) {
    //if giver or taker is null or they are the same object, an IllegalArgumentException must be thrown;
    //giver gives the object away for free. Default implementation checks if the giver has the object (possesses method) and the taker has enough capacity in the inventory (hasCapacity). If any of these checks fail, the method returns false.
    //Otherwise the item is transferred from the giver's inventory to the taker's inventory (transfer method) and the return value of the transfer call is returned
	}

	default boolean purchase(Trader seller, Trader buyer) {
    //if seller or buyer is null or they are the same object, an IllegalArgumentException must be thrown;
    //default implementation checks if the seller has the object (possesses method), the buyer can afford the object (canAfford method) and the buyer has enough capacity in the inventory (hasCapacity). If any of these checks fail, the method returns false.
    //Otherwise the buyer pays the price (pay method), the seller receives the price paid (earn method), The item is transferred from the seller's inventory to the buyer's inventory (transfer method) and the return value of the transfer call is returned
	}

	void useOn(MagicEffectRealization target);
    //if target is null, an IllegalArgumentException must be thrown;
    //use the object on the target
}