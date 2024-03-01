You want to implement your own little RPG (role playing game). To prototype the idea, you
decide to create a minimal version of the game. It should have two enemy types to start with:
goblins and orcs. The player’s hero is a warrior that may carry an armor and a sword. You
may want to add other playable heros later (the same goes for enemy types).
Both enemies and heros have a name, a number of health points (HP), an attack stat (ATK)
and a defense stat (DEF). The initial stats for all game characters are as follows:
▪ The warrior hero starts off with 50 HP, 10 ATK, and 5 DEF.
▪ Goblins have 16 HP, 9 ATK, and 3 DEF.
▪ Orcs are stronger opponents with 30 HP, 11 ATK, and 4 DEF.
Carrying a sword increases the hero’s attack by 6, and wearing an armor increases his or
her defense by 2. After every fight, there is a 25% chance that the hero finds a sword, a 15%
change to find an armor, and a 10% chance to heal 10 HP. If the hero already carries a
sword or armor, there’s no benefit to finding another one.
The damage made by an attack is equal to the attacker’s ATK stat minus the attackee’s DEF
stat.
This prototype will be a console game. When starting the program, the user should be able
to choose whether to fight a goblin or an orc in each round. Beating a goblin earn the player
75 points and beating an orc is worth 200 points. The goal is to earn as many points as
possible.