Java Battle Simulator

This is a simple battle simulation project written in Java. Two teams of characters fight until one side is completely defeated. The project demonstrates object-oriented programming principles such as inheritance, polymorphism, and encapsulation.

There is an abstract class called Character. Two subclasses extend it: Mage and Warrior. Each character has properties like name, gender, hitPoint (health), level, and experience. The attack behavior and damage calculation are different depending on the class.

The Player class represents a user who owns multiple characters. The Party class represents a group or team. Characters can be added to a party using addMember.

The Battle class controls the fight between two parties. In each round, a random attacker and defender are selected. Damage is calculated based on the attacker's logic, and the defender's health is reduced. If the defender's hitPoint becomes zero or lower, they are removed from the team. The battle ends when one party has no remaining characters.

The code uses ArrayList for storing characters. It also uses Collections.shuffle to randomize teams and Random for random selection.

Main steps of the program:
- Create players and characters
- Add characters to parties
- Initialize the Battle class
- Call formteams to select 3 random characters from each party
- Start the battle loop with startBattle
- The program prints who attacks who, how much damage is done, and when a character is defeated
- When one team is empty, the battle is over and the winner is printed

This is a basic simulation intended to show how Java classes and inheritance can be used to build a simple game system.
