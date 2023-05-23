package a01429473;

public interface MagicSource {
	boolean provideMana(MagicLevel levelNeeded, int manaAmount);
    //levelNeeded==null or negative manaAmount must throw IllegalArgumentException; returns true if the object has at least the required level and can provide enough mana, false otherwise.
    //a typical implementation will check if the objects level is high enough, returning false if not. Otherwise it reduces the object's MP by manaAmount. There may be exceptions though, like objects with infinite mana or supporting all levels  for example
}