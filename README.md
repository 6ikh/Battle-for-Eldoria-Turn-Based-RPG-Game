# Turn-Based RPG Game

A text-based turn-based RPG game built in Java, where players battle dynamically-behaving enemies in the cursed lands of Eldoria. This project demonstrates the use of object-oriented programming principles and Java design patterns to create a modular, extensible, and maintainable game system.

---

## Features

- **Turn-Based Combat**: Players can choose to attack, defend, or heal during their turn while battling an enemy.
- **Dynamic Enemy Behavior**: Enemies use strategies (e.g., Aggressive or Patient) that are dynamically assigned at runtime.
- **Flexible Action System**: Player actions (Attack, Defend, Heal) are encapsulated in their own classes, allowing for easy addition of new actions.
- **Game Loop**: A robust game loop handles player input, turn sequencing, and win/loss conditions in a command-line environment.

---

## Design Patterns Used

- **Command Pattern**: Encapsulates player actions (e.g., Attack, Defend, Heal) into reusable classes, decoupling them from the player logic.
- **Factory Method Pattern**: Dynamically assigns enemy strategies at runtime using a `StrategyFactory`.
- **Bridge Pattern**: Decouples actions from the player and enemy classes, improving modularity and extensibility.

---

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/6ikh/turn-based-rpg-game.git
   cd turn-based-rpg-game
   
2. Compile The Code:
   javac *.java

3. Run the Game:
   java Game

4. Play:
  Follow the on-screen instructions to attack, defend, or heal during your turn.
  Defeat the enemy to win the game!

## Project Structure:

- **├── Game.java** — Main class to start the game  
- **├── Player.java** — Represents the player  
- **├── Enemy.java** — Represents the enemy  
- **├── PlayerTurn.java** — Handles the player's turn  
- **├── Action.java** — Interface for player actions  
- **├── AttackAction.java** — Concrete class for attack action  
- **├── DefendAction.java** — Concrete class for defend action  
- **├── HealAction.java** — Concrete class for heal action  
- **├── Strategy.java** — Interface for enemy strategies  
- **├── AggressiveStrategy.java** — Concrete class for aggressive enemy strategy  
- **├── PatientStrategy.java** — Concrete class for patient enemy strategy  
- **├── StrategyFactory.java** — Factory to create enemy strategies  


## Technologies Used
- **Language: Java**
- **Concepts: Object-Oriented Programming (OOP), Design Patterns (Strategy, Factory)**

## What I Learned

--**In the initial version of the game, all the logic was crammed into the main method, making the code difficult to read, maintain, and extend. Through this project, I learned how to apply object-oriented principles and design patterns to make the system modular, flexible, and scalable.**

## Factory Method Pattern

--**I learned how the Factory Method Pattern can separate object creation logic from the main game flow. Instead of hardcoding the enemy’s behavior (aggressive or patient), I created a StrategyFactory class that randomly generates a Strategy object. This made the enemy behavior dynamic and allowed me to easily add new strategy types without changing existing code. It demonstrated how factories help maintain clean separation of concerns and support extensibility.**

## Bridge Pattern

--**Using the Bridge Pattern, I separated player actions (like attack, defend, and heal) from the player and enemy classes. This taught me how to decouple abstraction from implementation, allowing both to evolve independently. By defining a common Action interface, I was able to add new actions—like a potential “Special Attack”—without modifying the core player or enemy logic. This structure made the codebase easier to manage and more adaptable to future features.**

## Command Pattern

--**Implementing the Command Pattern helped me organize the game’s action logic. Instead of cluttering the main loop with conditionals for each player choice, each action (AttackAction, DefendAction, HealAction) became its own command object with an execute() method. This made the game’s control flow more readable and modular. I learned how commands encapsulate behavior, making it easier to modify or add new functionality while keeping the invoker (PlayerTurn) and receivers (Player, Enemy) independent.**

## Overall Takeaway

--**Overall, this project helped me understand how design patterns improve software architecture by promoting reusability, maintainability, and clarity. Applying these patterns not only fixed issues in the original codebase but also gave me hands-on experience in writing scalable, professional-quality Java code that aligns with real-world design principles.**
