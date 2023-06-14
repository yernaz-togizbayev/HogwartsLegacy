package a01429473;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Erstelle einige MagicLevel-Objekte
		MagicLevel noobLevel = MagicLevel.NOOB;	    	
		MagicLevel adeptLevel = MagicLevel.ADEPT;
		MagicLevel studentLevel = MagicLevel.STUDENT;	
		MagicLevel expertLevel = MagicLevel.EXPERT;	    	
		MagicLevel masterLevel = MagicLevel.MASTER;
		
		// Erstelle einige Spell-Objekte
		Spell heal1 = new HealingSpell("Heal1", 0, noobLevel, false, true, 10);
		Spell heal2 = new HealingSpell("Heal2", 1, adeptLevel, true, true, 15);
		Spell heal3 = new HealingSpell("Heal3", 2, adeptLevel, true, false, 20);
		Spell heal4 = new HealingSpell("Heal4", 3, masterLevel, false, true, 25);
		Spell heal5 = new HealingSpell("Heal5", 4, expertLevel, false, false, 30);
		Spell heal6 = new HealingSpell("Heal6", 5, masterLevel, true, true, 35);
		Spell heal7 = new HealingSpell("Heal7", 6, studentLevel, false, true, 40);
		Spell heal8 = new HealingSpell("Heal8", 7, expertLevel, true, false, 45);
		Spell heal9 = new HealingSpell("Heal9", 8, masterLevel, false, false, 50);
		
		  
		// Erstelle einige AttackingSpell-Objekte  
		AttackingSpell fireball1 = new AttackingSpell("fireball1", 10, noobLevel, true, false, 10);
		AttackingSpell fireball2 = new AttackingSpell("fireball2", 15, adeptLevel, true, true, 20);
		AttackingSpell fireball3 = new AttackingSpell("fireball3", 20, expertLevel, false, false, 30);
		AttackingSpell fireball4 = new AttackingSpell("fireball4", 25, masterLevel, true, true, 40); 
		AttackingSpell fireball5 = new AttackingSpell("fireball5", 30, noobLevel, false, false, 50);
		AttackingSpell fireball6 = new AttackingSpell("fireball6", 35, adeptLevel, true, true, 60);
		AttackingSpell fireball7 = new AttackingSpell("fireball7", 40, expertLevel, false, false, 70);
		AttackingSpell fireball8 = new AttackingSpell("fireball8", 45, masterLevel, true, true, 80);
		AttackingSpell fireball9 = new AttackingSpell("fireball9", 50, noobLevel, false, true, 90);
		
		// Erstelle einige Tradeable-Objekte
		
		Potion potion1 = new HealthPotion("potion1", 10, 5, 1, 90);
		Potion potion2 = new HealthPotion("potion2", 10, 5, 1, 120);
		Potion potion3 = new HealthPotion("potion3", 20, 20, 3, 100);
		Potion potion4 = new HealthPotion("potion4", 15, 10, 2, 80);
		Potion potion5 = new HealthPotion("potion5", 25, 15, 3, 50);
		Potion potion6 = new HealthPotion("potion6", 30, 20, 2, 140);
		Potion potion7 = new HealthPotion("potion7", 10, 25, 1, 25);
		Potion potion8 = new HealthPotion("potion8", 40, 30, 3, 100);
		Potion potion9 = new HealthPotion("potion9", 40, 35, 13000, 95);
		
		// Erstelle ein Set von knownSpells für jeden Wizard
		Set<Spell> knownSpells1 = new HashSet<>();
		knownSpells1.add(heal1);
		knownSpells1.add(heal4);
		knownSpells1.add(heal7);
		
		Set<Spell> knownSpells2 = new HashSet<>();
		knownSpells2.add(heal2);
		knownSpells2.add(heal5);
		knownSpells2.add(heal8);
		
		Set<Spell> knownSpells3 = new HashSet<>();
		//knownSpells3.add(heal3);
		//knownSpells3.add(heal6);
		//knownSpells3.add(heal9);
		
		// Erstelle ein Set von protectedFrom für jeden Wizard
		Set<AttackingSpell> protectedFrom1 = new HashSet<>();
		protectedFrom1.add(fireball1);
		protectedFrom1.add(fireball5);
		protectedFrom1.add(fireball9);
		
		Set<AttackingSpell> protectedFrom2 = new HashSet<>();
		protectedFrom2.add(fireball2);
		protectedFrom2.add(fireball6);
		protectedFrom2.add(fireball4);
		
		Set<AttackingSpell> protectedFrom3 = new HashSet<>();
		//protectedFrom3.add(fireball3);
		//protectedFrom3.add(fireball7);
		//protectedFrom3.add(fireball5);
		//protectedFrom3.add(fireball8);
		
		// Erstelle ein Set von Tradeable-Objekten im Inventar jedes Wizards
		Set<Tradeable> inventory1 = new HashSet<>();
		inventory1.add(potion1);
		inventory1.add(potion4);
		inventory1.add(potion7);
		inventory1.add(potion8);
		inventory1.add(potion6);
		
		Set<Tradeable> inventory2 = new HashSet<>();
		inventory2.add(potion2);
		inventory2.add(potion3);
		inventory2.add(potion5);
		inventory2.add(potion8);
		
		Set<Tradeable> inventory3 = new HashSet<>();      
		inventory3.add(potion1);
		inventory3.add(potion2);
		
		Set<Tradeable> inventory3Steal = new HashSet<>();      
		inventory3Steal.add(potion3);

//		//Erstelle einen neuen MagicSource
//		MagicSource magicSourceObj1 = new Wizard("Gandalf", masterLevel, 100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1); 
//		MagicSource magicSourceObj2 = new Wizard("Harry", adeptLevel, 80, 80, 150, 150, 500, knownSpells2, protectedFrom2, 300, inventory2);
//		MagicSource magicSourceObj3 = new Wizard("Merlin", studentLevel, 60, 60, 250, 100, 300, knownSpells3, protectedFrom3, 200, inventory3);
//		
//		//Erstelle einen neuen Trader
//		Trader traderObj1 = new Wizard("Gandalf", masterLevel, 100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory2);
//		Trader traderObj2 = new Wizard("Harry", adeptLevel, 80, 80, 150, 150, 500, knownSpells2, protectedFrom2, 300, inventory1);
//		Trader traderObj3 = new Wizard("Merlin", studentLevel, 60, 60, 250, 100, 300, knownSpells3, protectedFrom3, 200, inventory3);
//		
//		//Erstelle einen neuen MagicEffectRealization
//		MagicEffectRealization magicEffectRealizationObj1 = new Wizard("Gandalf", masterLevel, 100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
//		MagicEffectRealization magicEffectRealizationObj2 = new Wizard("Harry", adeptLevel, 80, 80, 150, 150, 500, knownSpells2, protectedFrom2, 300, inventory2);
//		MagicEffectRealization magicEffectRealizationObj3 = new Wizard("Merlin", studentLevel, 60, 60, 250, 100, 300, knownSpells3, protectedFrom3, 200, inventory3);
//		
		// Erstelle einen neuen Wizard
		try {
			Wizard wizardNameNull = new Wizard("", adeptLevel, 100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardLevel = new Wizard("Gandalf", null, 100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardBasicHP = new Wizard("Gandalf", adeptLevel, -100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardHP = new Wizard("Gandalf", adeptLevel, 100, -100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardBasicMP = new Wizard("Gandalf", adeptLevel, 100, 100, 90, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardMP = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, -200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardMoney = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, -10, knownSpells1, protectedFrom1, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardKnownSpells = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, 10, null, protectedFrom1, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardProtectedFrom = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, 10, knownSpells1, null, 13000, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardCarryingCapacity = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, 10, knownSpells1, protectedFrom1, -130, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardInventory = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, 10, knownSpells1, protectedFrom1, 13000, null);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			Wizard wizardTotalInventory = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, 10, knownSpells1, protectedFrom1, 10, inventory1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}

		Wizard wizard0HMP = new Wizard("Gandalf", adeptLevel, 45, 900, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		Wizard wizard1 = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		Wizard wizard1Random = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory1);
		Wizard wizardSteal1Random = new Wizard("Gandalf", adeptLevel, 100, 100, 1500, 200, 1000, knownSpells1, protectedFrom1, 13000, inventory3);
	    Wizard wizard2 = new Wizard("Harry", adeptLevel, 80, 80, 150, 150, 500, knownSpells2, protectedFrom2, 300, inventory2);
	    Wizard wizard3 = new Wizard("Merlin", studentLevel, 60, 60, 250, 100, 300, knownSpells3, protectedFrom3, 200, inventory3);
	    Wizard wizard3Random = new Wizard("Merlin", studentLevel, 60, 60, 250, 100, 300, knownSpells3, protectedFrom3, 200, inventory3);
	    Wizard wizardSteal3Random = new Wizard("Merlin", studentLevel, 60, 60, 250, 100, 300, knownSpells3, protectedFrom3, 200, inventory3Steal);
	    Wizard wizardDead = new Wizard("Dead", masterLevel, 100, 0, 1500, 200, 1000, knownSpells1, protectedFrom1, 500, inventory1);		
		
		System.out.println();

	    System.out.println("--- Wizard 0HMP ---");
		System.out.println("Name: " + wizard0HMP.getName());
		System.out.println("Level: " + wizard0HMP.getLevel());
		System.out.println("basicHP: " + wizard0HMP.getBasicHP());
		System.out.println("HP: " + wizard0HMP.getHP());
		System.out.println("basicMP: " + wizard0HMP.getBasicMP());
		System.out.println("MP: " + wizard0HMP.getMP());
		System.out.println("Money: " + wizard0HMP.getMoney());
		System.out.println("Known Spells: " + wizard0HMP.getKnownSpells());
		System.out.println("Protected From: " + wizard0HMP.getProtectedFrom());
		System.out.println("Carrying Capacity: " + wizard0HMP.getCarryingCapacity());
		System.out.println("Inventory: " + wizard0HMP.getInventory());
		System.out.println("Wizard0HMP.toString(): " + wizard0HMP.toString());
		System.out.println();

		// Teste die Methoden der Wizard-Klasse
		System.out.println("--- Wizard 1 ---");
		System.out.println("Name: " + wizard1.getName());
		System.out.println("Level: " + wizard1.getLevel());
		System.out.println("basicHP: " + wizard1.getBasicHP());
		System.out.println("HP: " + wizard1.getHP());
		System.out.println("basicMP: " + wizard1.getBasicMP());
		System.out.println("MP: " + wizard1.getMP());
		System.out.println("Money: " + wizard1.getMoney());
		System.out.println("Known Spells: " + wizard1.getKnownSpells());
		System.out.println("Protected From: " + wizard1.getProtectedFrom());
		System.out.println("Carrying Capacity: " + wizard1.getCarryingCapacity());
		System.out.println("Inventory: " + wizard1.getInventory());
		System.out.println("Wizard1.toString(): " + wizard1.toString());
		System.out.println();
		
		System.out.println("--- IsDead() ---");
		if (wizard1.isDead())
			System.out.println("Wizard1 IsDead");
		else
			System.out.println("Wizard1 IsAlive");
		
		if (wizardDead.isDead())
			System.out.println("Wizard1 IsDead");
		else
			System.out.println("Wizard1 IsAlive");

		
		System.out.println();
		
		System.out.println("--- learn(Spell s) ---");
		System.out.println("Knownspells before learn(Spell s) : " + wizard1.getKnownSpells().toString());
		try {
		    if (wizard1.learn(null))
		        System.out.println("heal1 added to the set of knownSpells");
		else
		    System.out.println("heal1 DID NOT add to the set of knownSpells");
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    if (wizard1.learn(heal1))
		        System.out.println("heal1 added to the set of knownSpells");
		else
		    System.out.println("heal1 DID NOT add to the set of knownSpells");
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		try {
		    if (wizard1.learn(heal2))
		        System.out.println("heal2 added to the set of knownSpells");
		else
		    System.out.println("heal2 DID NOT add to the set of knownSpells");
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		System.out.println("Knownspells after learn(Spell s) : " + wizard1.getKnownSpells().toString());
		
		System.out.println();
		
		System.out.println("--- forget(Spell s) ---");
		System.out.println("Knownspells before forget(Spell s) : " + wizard1.getKnownSpells().toString());
		try {
			wizard1.forget(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		try {
		    if (wizard1.forget(heal3))
		        System.out.println("heal3 removed from the set of knownSpells");
		else
		    System.out.println("heal3 DID NOT remove from the set of knownSpells");
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		try {
		    if (wizard1.forget(heal2))
		        System.out.println("heal2 removed from the set of knownSpells");
		else
		    System.out.println("heal2 DID NOT remove from the set of knownSpells");
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}	
		System.out.println("Knownspells after forget(Spell s) : " + wizard1.getKnownSpells().toString());
		
		System.out.println();
		
		System.out.println("--- castSpell(Spell s, MagicEffectRealization target) ---");
		try {
			wizard1.castSpell(null, null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
			if(wizard1.castSpell(heal1, wizard1))
		    	System.out.println("cast(this, target) was called");
		else
			System.out.println("cast(this, target) wasNOT called");
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}	
		
		try {
			if(wizard1.castSpell(heal3, wizard1))
		    	System.out.println("cast(this, target) was called");
		else
			System.out.println("cast(this, target) wasNOT called");
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}	

		System.out.println();
		
		System.out.println("--- castRandomSpell(MagicEffectRealization target) ---");
		if(wizard3Random.castRandomSpell(wizard1Random))
			System.out.println("castSpell(Spell, MagicEffectRealization) was called");
		else
			System.out.println("castSpell(Spell, MagicEffectRealization) wasNOT called");

		if(wizard1Random.castRandomSpell(wizardDead))

		if(wizard1Random.castRandomSpell(wizard1Random))
			System.out.println("castSpell(Spell, MagicEffectRealization) was called");
		else
			System.out.println("castSpell(Spell, MagicEffectRealization) wasNOT called");
		
		System.out.println();
		
		System.out.println("--- useItem(Tradeable item, MagicEffectRealization target) ---");
		System.out.println("Wizard2 HP before useOn() get called: " + wizard2.getHP());
		System.out.println("Potion1 Usages before useOn() get called: " + potion1.getUsages());
		
		try {
			wizard1.useItem(null, null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
			if(wizard1.useItem(potion2, wizard2))
				System.out.println("useOn(target) was called");
		else
			System.out.println("useOn(target) wasNOT called");
		   } catch (IllegalArgumentException e) {
			   System.out.println("Error occurred: " + e.getMessage());
		    }
		
		try {
			if(wizard1.useItem(potion1, wizard2))
				System.out.println("useOn(target) was called");
		else
			System.out.println("useOn(target) wasNOT called");
		   } catch (IllegalArgumentException e) {
			   System.out.println("Error occurred: " + e.getMessage());
		    }

		System.out.println("Wizard2 HP after useOn() get called: " + wizard2.getHP());
		System.out.println("Potion1 Usages after useOn() get called: " + potion1.getUsages());

		System.out.println();
		   
		System.out.println("--- useRandomItem(MagicEffectRealization target) ---");
		if(wizard1Random.useRandomItem(wizard1Random))
			System.out.println("useItem(Tradeable , MagicEffectRealization) was called");
		else
			System.out.println("useItem(Tradeable , MagicEffectRealization) wasNOT called");
		
		System.out.println();
		
		System.out.println("--- sellItem(Tradeable item, Trader target) ---");
		System.out.println("Wizard 1 Potions before sellItem(): " + wizard1.getInventory().toString());
		System.out.println("Wizard 1 Money before sellItem(): " + wizard1.getMoney());
		System.out.println("Wizard 2 Potions before sellItem(): " + wizard2.getInventory().toString());
		System.out.println("Wizard 2 Money before sellItem(): " + wizard2.getMoney());
		System.out.println("Potion1 Price: " + potion1.getPrice());

		try{
			if(wizard1.sellItem(null, null))
				System.out.println("");
		}catch (IllegalArgumentException e) {
				System.out.println("Error occurred: " + e.getMessage());
			}
		
		try{
			if(wizard1.sellItem(potion1, wizard1))
				System.out.println("");
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		
		try{
			if(wizard1.sellItem(potion1, wizard2))
				System.out.println("purchase(this, target) was called");
		else
			System.out.println("purchase(this, target) wasNOT called");
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		
		// potion8 is in wizard1 and wizard2 so the Transfer is not gonna happen
		try{
			if(wizard1.sellItem(potion8, wizard2))
				System.out.println("purchase(this, target) was called");
		else
			System.out.println("purchase(this, target) wasNOT called");
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		
		try{
			if(wizard1.sellItem(potion2, wizard2))
				System.out.println("purchase(this, target) was called");
		else
			System.out.println("purchase(this, target) wasNOT called");
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}

		System.out.println("Wizard 1 Potions after sellItem(): " + wizard1.getInventory().toString());
		System.out.println("Wizard 1 Money after sellItem(): " + wizard1.getMoney());
		System.out.println("Wizard 2 Potions after sellItem(): " + wizard2.getInventory().toString());
		System.out.println("Wizard 2 Money after sellItem(): " + wizard2.getMoney());
		
		System.out.println();
		
		System.out.println("--- sellRandomItem(Trader target) ---");
		System.out.println("wizard1Random Money before sellRandomItem(): " + wizard1Random.getMoney());
		System.out.println("wizard3Random Money before sellRandomItem(): " + wizard3Random.getMoney());
		try{
			if(wizard1Random.sellRandomItem(wizard1Random))
				System.out.println("sellItem(Tradeable , MagicEffectRealization) was called");
		}catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
		if(wizard1Random.sellRandomItem(wizard3Random))
			System.out.println("sellItem(Tradeable , MagicEffectRealization) was called");
		else
			System.out.println("sellItem(Tradeable , MagicEffectRealization) wasNOT called");
		
		System.out.println("wizard1Random Money after sellRandomItem(): " + wizard1Random.getMoney());
		System.out.println("wizard3Random Money after sellRandomItem(): " + wizard3Random.getMoney());
			
		System.out.println();
		
		System.out.println("--- toString() ---");
		System.out.println( wizard1.toString());
		
		System.out.println();
		
		System.out.println("--- provideMana(MagicLevel levelNeeded, int manaAmount) ---");
		System.out.println("MP before provideMana: " + wizard1.getMP());
		try {
			wizard1.provideMana(null, -1);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		try {
			
			if(wizard1.provideMana(masterLevel, 10))
				System.out.println("provideMana is true! MP after provideMana: " + wizard1.getMP());
			else
				System.out.println("provideMana is false! MP after provideMana: " + wizard1.getMP());

		   if(wizard1.provideMana(adeptLevel, 10))
			   System.out.println("provideMana is true! MP after provideMana: " + wizard1.getMP());
		   else 
			   System.out.println("provideMana is false! MP after provideMana: " + wizard1.getMP());
		   
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- possesses(Tradeable item) ---");
		System.out.println(wizard1.getInventory().toString());
		try {
			wizard1.possesses(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    if (wizard1.possesses(potion1))
		    	System.out.println("Wizard1 possesses potion1");
		    else
		    	System.out.println("Wizard1 does NOT possess potion1");
		   
		    if (wizard1.possesses(potion4))
		    	System.out.println("Wizard1 possesses potion4");
		    else
		    	System.out.println("Wizard1 does NOT possess potion4");
		    
		    if (wizard1.possesses(potion7))
		    	System.out.println("Wizard1 possesses potion7");
		    else
		    	System.out.println("Wizard1 does NOT possess potion7");

		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- canAfford(int amount) ---");
		try {
			wizard1.canAfford(-10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
			if (wizard1.canAfford(50))
		        System.out.println("Wizard1 can afford amount 50");
		else
		    System.out.println("Wizard1 cannot afford amount 50");
		
		if (wizard1.canAfford(100))
		    System.out.println("Wizard1 can afford amount 100");
		else
		    System.out.println("Wizard1 cannot afford amount 100");
		
		if (wizard1.canAfford(1050))
		    System.out.println("Wizard1 can afford amount 1050");
		else
		    System.out.println("Wizard1 cannot afford amount 1050");
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- hasCapacity(int weight) ---");
		try {
			wizard1.hasCapacity(-10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		try {
		    if (wizard1.hasCapacity(50))
		        System.out.println("Wizard1 has capacity for weight 50");
		else
		    System.out.println("Wizard1 does NOT have capacity for weight 50");
		
		if (wizard1.hasCapacity(100))
		    System.out.println("Wizard1 has capacity for weight 100");
		else
		    System.out.println("Wizard1 does NOT have capacity for weight 100");
		
		if (wizard1.hasCapacity(15000))
		    System.out.println("Wizard1 has capacity for weight 15000");
		else
		    System.out.println("Wizard1 does NOT have capacity for weight 15000");
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- pay(int amount) ---");
		try {
			wizard1.pay(-10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
			System.out.println("Wizard1 Money before pay(50): " + wizard1.getMoney());
		    if (wizard1.pay(50))
		        System.out.println("Wizard1 paid amount 50");
		else
		    System.out.println("Wizard1 cannot pay amount 50");
		    
		    System.out.println("Wizard1 Money after pay(50): " + wizard1.getMoney());
		    System.out.println("Wizard1 Money before pay(100): " + wizard1.getMoney());
		if (wizard1.pay(100))
		    System.out.println("Wizard1 paid amount 100");
		else
		    System.out.println("Wizard1 cannot pay amount 100");
	    System.out.println("Wizard1 Money after pay(100): " + wizard1.getMoney());
	    System.out.println("WizardDead Money before pay(150): " + wizardDead.getMoney());

		if (wizardDead.pay(150))
		    System.out.println("WizardDead paid amount 150");
		else
		    System.out.println("WizardDead cannot pay amount 150");
	    System.out.println("WizardDead Money after pay(150): " + wizardDead.getMoney());

		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- earn(int amount) ---");
		try {
			wizard1.earn(-10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
			System.out.println("Wizard1 Money before earn(50): " + wizard1.getMoney());
		    if (wizard1.earn(50))
		        System.out.println("Wizard1 earned amount 50");
		else
		    System.out.println("Wizard1 cannot earn amount 50");
		    
		    System.out.println("Wizard1 Money after earn(50): " + wizard1.getMoney());
		    System.out.println("Wizard1 Money before earn(100): " + wizard1.getMoney());
		if (wizard1.earn(100))
		    System.out.println("Wizard1 earned amount 100");
		else
		    System.out.println("Wizard1 cannot earn amount 100");
	    System.out.println("Wizard1 Money after earn(100): " + wizard1.getMoney());
	    System.out.println("WizardDead Money before earn(150): " + wizardDead.getMoney());

		if (wizardDead.earn(150))
		    System.out.println("WizardDead earned amount 150");
		else
		    System.out.println("WizardDead cannot earn amount 150");
	    System.out.println("WizardDead Money after earn(150): " + wizardDead.getMoney());

		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		System.out.println();
		
		System.out.println("--- addToInventory(Tradeable item) ---");
		System.out.println("wizard1.getInventory() before addToInventory: " + wizard1.getInventory());
		try {
			wizard1.addToInventory(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
			// potion8 ist in wizard1
		    if (wizard1.addToInventory(potion8))
		        System.out.println("potion8 added to inventory");
		else
		    System.out.println("potion8 didNOT add to inventory");
		    
		if (wizard1.addToInventory(potion2))
		    System.out.println("potion2 added to inventory");
		else
		    System.out.println("potion2 didNOT add to inventory");
		
		// potion9 hat große Gewicht
		if(wizard1.addToInventory(potion9))
		    System.out.println("potion9 added to inventory");
		else
		    System.out.println("potion9 didNOT add to inventory");

			
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		System.out.println("wizard1.getInventory() after addToInventory: " + wizard1.getInventory());
		
		System.out.println();
		
		System.out.println("--- removeFromInventory(Tradeable item) ---");
		System.out.println("wizard1.getInventory() before removeFromInventory: " + wizard1.getInventory());
		try {
			wizard1.removeFromInventory(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    if (wizard1.removeFromInventory(potion1))
		        System.out.println("potion1 removed from inventory");
		else
		    System.out.println("potion1 didNOT remove from inventory");
		
		if (wizard1.removeFromInventory(potion2))
		    System.out.println("potion2 removed from inventory");
		else
		    System.out.println("potion2 did NOT remove from inventory");
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		System.out.println("wizard1.getInventory() after removeFromInventory: " + wizard1.getInventory());
		
		System.out.println();
		
		System.out.println("--- canSteal() ---");
		
		if (wizard1.canSteal())
			System.out.println("Wizard1 is alive and can steal");
		else
		    System.out.println("Wizard1 is dead and cannot steal");
		
		if (wizardDead.canSteal())
			System.out.println("wizardDead is alive and can steal");
		else
		    System.out.println("wizardDead is dead and cannot steal");

		System.out.println();
		
		System.out.println("--- steal(Trader thief) ---");
		System.out.println("wizardSteal1Random before steal wizard1.getInventory(): " + wizardSteal1Random.getInventory().toString());
		System.out.println("wizardSteal3Random before steal wizard2.getInventory(): " + wizardSteal3Random.getInventory().toString());
		try {
			wizard1.steal(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {	
		    if (wizardSteal1Random.steal(wizardDead))
		        System.out.println("Theft was successful");
		    else
		    	System.out.println("Theft was not successful");
		    
		    if (wizardSteal3Random.steal(wizardSteal1Random))
		        System.out.println("Theft was successful");
		    else
		    	System.out.println("Theft was not successful");  		    

		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println("wizardSteal1Random after steal wizard1.getInventory(): " + wizardSteal1Random.getInventory().toString());
		System.out.println("wizardSteal3Random after steal wizard2.getInventory(): " + wizardSteal3Random.getInventory().toString());
		
		System.out.println();
		
		System.out.println("--- isLootable() ---");
		try {
			if (wizardDead.isLootable())
		        System.out.println("wizardDead is dead and lootable");
			else
				System.out.println("wizardDead is alive and not lootable");
		    
		    if (wizard1.isLootable())
		        System.out.println("wizard1 is dead and lootable");
		    else
		    	System.out.println("wizard1 is alive and not lootable");

		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- canLoot() ---");
		try {
		    if (wizardDead.canLoot())
		        System.out.println("wizardDead is alive and can loot");
		    else
		    	System.out.println("wizardDead is dead and cannot loot");
		    
		    if (wizard1.canLoot())
		        System.out.println("Wizard1 is alive and can loot");
		    else
		    	System.out.println("Wizard1 is dead and cannot loot");

		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- loot(Trader looter) ---");
		System.out.println("Wizard 1 before loot: " + wizard1.toString());
		System.out.println("wizard 2 before loot: " + wizard2.toString());
		System.out.println("wizardDead before loot: " + wizardDead.toString());

		try {
			wizard1.loot(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
			// wizardDead canNotLoot
			if(wizard1.loot(wizardDead))
		        System.out.println("At least one item was successfully looted");
			else
			    System.out.println("No items were successfully looted");
		
			// wizard2 isNotLootable
		    if (wizard2.loot(wizard1))
		        System.out.println("At least one item was successfully looted");
		    else
		    	System.out.println("No items were successfully looted");
		    
		    if (wizardDead.loot(wizard1))
		        System.out.println("At least one item was successfully looted");
		    else
		    	System.out.println("No items were successfully looted");

		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println("Wizard 1 after loot: " + wizard1.toString());
		System.out.println("wizard 2 after loot: " + wizard2.toString());
		System.out.println("wizardDead after loot: " + wizardDead.toString());

		System.out.println();
		
		System.out.println("--- takeDamage(int amount) ---");
		try {
			wizard1.takeDamage(-1);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    System.out.println("HP before takeDamage(50): " + wizard1.getHP());
		    wizard1.takeDamage(50);
		    System.out.println("HP after takeDamage(50): " + wizard1.getHP());
		    
		    System.out.println("HP before takeDamage(55): " + wizard1.getHP());
		    wizard1.takeDamage(55);
		    System.out.println("HP after takeDamage(55): " + wizard1.getHP());

		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- takeDamagePercent(int percentage) ---");
		try {
			wizard2.takeDamagePercent(101);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    System.out.println("HP before takeDamagePercent(10): " + wizard2.getHP());
		    System.out.println("BasicHP before takeDamagePercent(10): " + wizard2.getBasicHP());
		    wizard2.takeDamagePercent(10);
		    System.out.println("HP after takeDamagePercent(10): " + wizard2.getHP());
		    System.out.println("BasicHP after takeDamagePercent(10): " + wizard2.getBasicHP());
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- weakenMagic(int amount) ---");
		try {
			wizard2.weakenMagic(-10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    System.out.println("MP before weakenMagic(5): " + wizard1.getMP());
		    wizard1.weakenMagic(5);
		    System.out.println("MP after weakenMagic(5): " + wizard1.getMP());
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- weakenMagicPercent(int percentage) ---");
		try {
			wizard2.weakenMagicPercent(-10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    System.out.println("MP before weakenMagicPercent(5): " + wizard1.getMP());
		    System.out.println("BasicMP before weakenMagicPercent(5): " + wizard1.getBasicMP());
		    wizard1.weakenMagicPercent(5);
		    System.out.println("MP after weakenMagicPercent(5): " + wizard1.getMP());
		    System.out.println("BasicMP after weakenMagicPercent(5): " + wizard1.getBasicMP());
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- heal(int amount) ---");
		try {
			wizard2.heal(-10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    System.out.println("HP before heal(100): " + wizard1.getHP());
		    wizard1.heal(100);
		    System.out.println("HP after heal(100): " + wizard1.getHP());
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- healPercent(int amount) ---");
		try {
			wizard2.healPercent(101);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    System.out.println("HP before healPercent(10): " + wizard2.getHP());
		    System.out.println("BasicHP before healPercent(10): " + wizard2.getBasicHP());
		    wizard2.healPercent(10);
		    System.out.println("HP after healPercent(10): " + wizard2.getHP());
		    System.out.println("BasicHP after healPercent(10): " + wizard2.getBasicHP());
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- enforceMagic(int amount) ---");
		try {
			wizard2.enforceMagic(-10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    System.out.println("MP before enforceMagic(5): " + wizard1.getMP());
		    wizard1.enforceMagic(5);
		    System.out.println("MP after enforceMagic(5): " + wizard1.getMP());
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- enforceMagicPercent(int percentage) ---");
		try {
			wizard2.enforceMagicPercent(-10);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}

		try {
		    System.out.println("MP before enforceMagicPercent(5): " + wizard1.getMP());
		    System.out.println("BasicMP before enforceMagicPercent(5): " + wizard1.getBasicMP());
		    wizard1.enforceMagicPercent(5);
		    System.out.println("MP after enforceMagicPercent(5): " + wizard1.getMP());
		    System.out.println("BasicMP after enforceMagicPercent(5): " + wizard1.getBasicMP());
		} catch (IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("--- isProtected(Spell s) ---");
		try {
			wizard1.isProtected(null);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
			}

		try {
			if(wizard1.isProtected(fireball1))
		        System.out.println("fireball1 is contained in protectedFrom");
		else
			System.out.println("fireball1 is not contained in protectedFrom");
		} catch (IllegalArgumentException e) {
		System.out.println("Error occurred: " + e.getMessage());
		}
		try {
			if(wizard1.isProtected(heal3))
		        System.out.println("heal2 is contained in protectedFrom");
		else
			System.out.println("heal2 is not contained in protectedFrom");
		} catch (IllegalArgumentException e) {
		System.out.println("Error occurred: " + e.getMessage());
		}

		System.out.println();
		
		System.out.println("--- setProtection(Set<AttackingSpell> attacks) ---");
		try {
			wizard1.setProtection(null);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
			}

		System.out.println("protectedFrom1 size before setProtection: " + wizard1.getProtectedFrom().size());
		System.out.println("protectedFrom1 before: " + wizard1.getProtectedFrom().toString());
		try {
			wizard1.setProtection(protectedFrom2);
		} catch(IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		System.out.println("protectedFrom1 size after setProtection: " + wizard1.getProtectedFrom().size());
		System.out.println("protectedFrom1 after: " + wizard1.getProtectedFrom().toString());		
		
		System.out.println();
		
		System.out.println("--- removeProtection(Set<AttackingSpell> attacks) ---");	
		try {
			wizard1.removeProtection(null);
		} catch (IllegalArgumentException e) {
			System.out.println("Error occurred: " + e.getMessage());
			}

		System.out.println("protectedFrom1 size before removeProtection: " + wizard1.getProtectedFrom().size());
		System.out.println("protectedFrom1 before: " + wizard1.getProtectedFrom().toString());
		
		try {
			wizard1.removeProtection(protectedFrom2);
		} catch(IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		System.out.println("protectedFrom1 size after removeProtection: " + wizard1.getProtectedFrom().size());
		System.out.println("protectedFrom1 after: " + wizard1.getProtectedFrom().toString());	
		
		
		System.out.println();

	    // Erstelle List<Spell> spells
        Spell spell = new AttackingSpell("Confringo", 20, noobLevel, true, false, 15);

	    // Erstelle einen neuen MagicItem und Scroll 
	    MagicItem magicItemScroll1 = new Scroll("AccioScroll", 5, 15, 15, spell);
		
		// Teste die Methoden der MagicItem-Klasse
		System.out.println("--- magicItemScroll1  ---");
		System.out.println("Name: " + magicItemScroll1.getName());
		System.out.println("Usages: " + magicItemScroll1.getUsages());
		System.out.println("Price: " + magicItemScroll1.getPrice());
		System.out.println("Weight: " + magicItemScroll1.getWeight());
		System.out.println(magicItemScroll1.toString());
		System.out.println();
		
		System.out.println("--- magicItemScroll1  useOn()---");
		System.out.println("Usages before drink(): " + magicItemScroll1.getUsages());
		System.out.println("HP before drink(): " + wizard1.getHP());
		System.out.println();
		magicItemScroll1.useOn(wizard1);
		System.out.println("Usages after drink(): " + magicItemScroll1.getUsages());
		System.out.println("HP after drink(): " + wizard1.getHP());

		System.out.println();

		System.out.println("--- takeDamagePercent(int percentage) ---");
		try {
			System.out.println("Usages before takeDamagePercent(50): " + magicItemScroll1.getUsages());
			magicItemScroll1.takeDamagePercent(50);
			System.out.println("Usages after takeDamagePercent(50): " + magicItemScroll1.getUsages());
		}catch(IllegalArgumentException e) {
		    System.out.println("Error occurred: " + e.getMessage());
		}
		
		System.out.println();

        List<Spell> spells = new ArrayList<>();
        spells.add(new AttackingSpell("Confringo", 20, noobLevel, true, true, 15));
        spells.add(new HealingSpell("Diffindo", 20, masterLevel, true, true, 15));
        spells.add(new ProtectingSpell("Liffindo", 20, studentLevel, protectedFrom1));

		Potion healtPotion0 = new HealthPotion("AccioScroll", 0, 1, 1, 10);
        Potion healtPotion1 = new HealthPotion("AccioScroll", 5, 1, 1, 10);
        
        Potion manaPotion0 = new ManaPotion("AlohomoraScroll", 0, 10, 1, 15);
		Potion manaPotion1 = new ManaPotion("AlohomoraScroll", 5, 10, 1, 15);
		
		Potion conPotion0 = new Concoction("ExpelliarmusScroll", 0, 5, 2, 10, 15, spells);
		Potion conPotion1 = new Concoction("ExpelliarmusScroll", 5, 5, 2, 10, 15, spells);
		Potion conPotion2 = new Concoction("ExpelliarmusScroll", 5, 5, 2, -10, -15, spells);

		System.out.println("--- healtPotion1 ---");
		System.out.println("Name: " + healtPotion1.getName());
		System.out.println("Usages: " + healtPotion1.getUsages());
		System.out.println("Price: " + healtPotion1.getPrice());
		System.out.println("Weight: " + healtPotion1.getWeight());
		System.out.println(healtPotion1.toString());
		
		System.out.println();

		System.out.println("--- manaPotion1 ---");
		System.out.println("Name: " + manaPotion1.getName());
		System.out.println("Usages: " + manaPotion1.getUsages());
		System.out.println("Price: " + manaPotion1.getPrice());
		System.out.println("Weight: " + manaPotion1.getWeight());
		System.out.println(manaPotion1.toString());
		
		System.out.println();
		
		System.out.println("--- conPotion1 ---");
		System.out.println("Name: " + conPotion1.getName());
		System.out.println("Usages: " + conPotion1.getUsages());
		System.out.println("Price: " + conPotion1.getPrice());
		System.out.println("Weight: " + conPotion1.getWeight());
		System.out.println(conPotion1.toString());
		
		System.out.println();


		System.out.println("--- drink(Wizard drinker) ---");
		System.out.println("--- healtPotion0 --- Does not attend tryUsage()");
		System.out.println("Usages before drink(): " + healtPotion0.getUsages());
		System.out.println("HP before drink(): " + wizard1.getHP());
		System.out.println();
		healtPotion0.drink(wizard1);
		System.out.println("Usages after drink(): " + healtPotion0.getUsages());
		System.out.println("HP after drink(): " + wizard1.getHP());
		
		System.out.println();
		
		System.out.println("--- healtPotion1 ---");
		System.out.println("Usages before drink(): " + healtPotion1.getUsages());
		System.out.println("HP before drink(): " + wizard1.getHP());
		System.out.println();
		healtPotion1.drink(wizard1);
		System.out.println("Usages after drink(): " + healtPotion1.getUsages());
		System.out.println("HP after drink(): " + wizard1.getHP());
		
		System.out.println();
		
		System.out.println("--- manaPotion0 --- Does not attend tryUsage()");
		System.out.println("Usages before drink(): " + manaPotion0.getUsages());
		System.out.println("MP before drink(): " + wizard1.getMP());
		System.out.println();
		manaPotion0.drink(wizard1);
		System.out.println("Usages after drink(): " + manaPotion0.getUsages());
		System.out.println("MP after drink(): " + wizard1.getMP());
		
		System.out.println();
		
		System.out.println("--- manaPotion1 ---");
		System.out.println("Usages before drink(): " + manaPotion1.getUsages());
		System.out.println("MP before drink(): " + wizard1.getMP());
		System.out.println();
		manaPotion1.drink(wizard1);
		System.out.println("Usages after drink(): " + manaPotion1.getUsages());
		System.out.println("MP after drink(): " + wizard1.getMP());
		
		System.out.println();

		System.out.println("--- conPotion0 Does not attend tryUsage()---");
		System.out.println("Usages before drink(): " + conPotion0.getUsages());
		System.out.println("MP before drink(): " + wizard1.getMP());
		System.out.println("HP before drink(): " + wizard1.getHP());
		System.out.println();
		conPotion0.drink(wizard1);
		System.out.println("Usages after drink(): " + conPotion0.getUsages());
		System.out.println("MP after drink(): " + wizard1.getMP());
		System.out.println("HP after drink(): " + wizard1.getHP());
		
		System.out.println();

		System.out.println("--- conPotion1 ---");
		System.out.println("Usages before drink(): " + conPotion1.getUsages());
		System.out.println("MP before drink(): " + wizard1.getMP());
		System.out.println("HP before drink(): " + wizard1.getHP());
		System.out.println();
		conPotion1.drink(wizard1);
		System.out.println("Usages after drink(): " + conPotion1.getUsages());
		System.out.println("MP after drink(): " + wizard1.getMP());
		System.out.println("HP after drink(): " + wizard1.getHP());
		
		System.out.println();
		System.out.println("--- conPotion2 ---");
		System.out.println("Usages before drink(): " + conPotion2.getUsages());
		System.out.println("MP before drink(): " + wizard1.getMP());
		System.out.println("HP before drink(): " + wizard1.getHP());
		System.out.println();
		conPotion2.drink(wizard1);
		System.out.println("Usages after drink(): " + conPotion2.getUsages());
		System.out.println("MP after drink(): " + wizard1.getMP());
		System.out.println("HP after drink(): " + wizard1.getHP());
				
		System.out.println();

		System.out.println();
				
		Spell attacking0 = new AttackingSpell("Attack0", 10, masterLevel, false, true, 15);
		Spell attacking1 = new AttackingSpell("Attack1", 10, adeptLevel, true, true, 15);
		Spell attacking2 = new AttackingSpell("Attack2", 10, noobLevel, true, false, 15);
		Spell attacking3 = new AttackingSpell("Attack3", 10, adeptLevel, false, true, 15);
		Spell attacking4 = new AttackingSpell("Attack4", 10, noobLevel, false, false, 15);
		
		Spell healing0 = new HealingSpell("Heal0", 10, masterLevel, false, true, 15);
		Spell healing1 = new HealingSpell("Heal1", 10, adeptLevel, true, true, 15);
		Spell healing2 = new HealingSpell("Heal2", 10, adeptLevel, true, false, 15);
		Spell healing3 = new HealingSpell("Heal3", 10, noobLevel, false, true, 15);
		Spell healing4 = new HealingSpell("Heal4", 10, adeptLevel, false, false, 15);

		Spell protecting1 = new ProtectingSpell("Protecting1", 80, adeptLevel, protectedFrom1);
		
		System.out.println("--- Spell - AttackingSpell ---");
		System.out.println("Name: " + attacking1.getName());
		System.out.println("ManaCost: " + attacking1.getManaCost());
		System.out.println("MagicLevel: " + attacking1.getLevelNeeded());
		System.out.println(attacking1.toString());
		System.out.println(attacking2.toString());
		
		System.out.println();

		System.out.println("--- Spell - HealingSpell ---");
		System.out.println("Name: " + healing1.getName());
		System.out.println("ManaCost: " + healing1.getManaCost());
		System.out.println("MagicLevel: " + healing1.getLevelNeeded());
		System.out.println(healing1.toString());
		System.out.println(healing2.toString());
		
		System.out.println();
		
		System.out.println("--- Spell - ProtectingSpell ---");
		System.out.println("Name: " + protecting1.getName());
		System.out.println("ManaCost: " + protecting1.getManaCost());
		System.out.println("MagicLevel: " + protecting1.getLevelNeeded());
		System.out.println(protecting1.toString());
		
		System.out.println();
		
		System.out.println("--- cast(MagicSource source, MagicEffectRealization target) ---");
		wizard1.enforceMagic(100);
		wizard2.enforceMagic(100);
		
		System.out.println("--- attacking0 --- Does not attend ProvideMana()");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		attacking0.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());
		
		System.out.println();

		System.out.println("--- attacking1 ---");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		attacking1.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());

		System.out.println();

		System.out.println("--- attacking2 ---");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		attacking2.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());
		
		System.out.println();

		System.out.println("--- attacking3 ---");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		attacking3.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());

		System.out.println();

		System.out.println("--- attacking4 ---");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		attacking4.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());

		System.out.println();

		System.out.println("--- healing0 --- Does not attend ProvideMana()");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		healing0.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());
		
		System.out.println();
		
		System.out.println("--- healing1 ---");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		healing1.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());
		
		System.out.println();

		System.out.println("--- healing2 ---");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		healing2.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());
		
		System.out.println();

		System.out.println("--- healing3 ---");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		healing3.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());
		
		System.out.println();
		
		System.out.println("--- healing4 ---");
		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP before cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP before cast: " + wizard2.getHP());
		System.out.println();
		healing4.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 MP after cast: " + wizard2.getMP());
		System.out.println("Wizard 2 HP after cast: " + wizard2.getHP());
		
		System.out.println(); 
		
		System.out.println("--- protecting1 ---");
		wizard1.enforceMagic(100);

		System.out.println("Wizard 1 MP before cast: " + wizard1.getMP());
		System.out.println("Wizard 2 ProtectedFrom before cast: " + wizard2.getProtectedFrom());
		System.out.println();
		protecting1.cast(wizard1, wizard2);
		System.out.println("Wizard 1 MP after cast: " + wizard1.getMP());
		System.out.println("Wizard 2 ProtectedFrom after cast: " + wizard2.getProtectedFrom());
		
		System.out.println();
			}
		}
