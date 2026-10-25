## Assignment 5: Strategy Design Pattern (DMC RPG Combat System)

 Implementation of the **Strategy Behavioral Design Pattern** in Java demonstrating dynamic combat mechanics during a multi-phase boss fight.

---

##  Overview

This project simulates an RPG combat system where **Dante** (`GameCharacter`) encounters the Demon King **Mundus**. As Mundus transitions through different battle phases, Dante dynamically switches his attack strategy (`AttackStrategy`) at runtime to adapt to changing combat conditions.
## Components
**Strategy Interface**  `AttackStrategy`  Defines the unified execution contract (`executeAttack`) for all combat behaviors. 
 **Concrete Strategy A**  `MeleeAttack`  Close-range physical attack using Rebellion at ground level. 
 **Concrete Strategy B**  `LongDistAttack`  Long-range firearm attacks using Ebony & Ivory against airborne targets. 
 **Concrete Strategy C**  `DevilTriggerAttack`  Full demon form transformation unleashing overwhelming dark power to bypass magical defenses. 
 **Context**  `GameCharacter`  Holds a reference to Dante's active `AttackStrategy` and delegates combat execution. 
 **Client**  `Main`  Controls the fight phases against Mundus and demonstrates runtime behavior swapping. 

---
##  Clean Code Principles Applied

### 1. Single Responsibility Principle (SRP)
* Each concrete strategy class is solely responsible for one specific attack mechanic and output string.
* The `GameCharacter` class (Dante) is responsible strictly for state management, delegating all combat mechanics to the active strategy.

### 2. Open/Closed Principle (OCP)
* The architecture is **open for extension**: new combat styles (e.g., `RoyalguardStrategy` or `SwordmasterStrategy`) can be added by implementing `AttackStrategy`.
* The core logic is **closed for modification**: adding new behavior requires **zero changes** to `GameCharacter` or existing strategy classes.

### 3. Elimination of Conditional Complexity (No `if/else` or `switch`)
* Replaces branching logic in `performAttack()` with **polymorphic dispatch**.
* Behavior selection occurs transparently at runtime through object composition.

### 4. Meaningful & Self-Documenting Naming
* All interfaces, classes, and methods use domain-driven, descriptive names (`setAttackStrategy`, `performAttack`), eliminating the need for redundant code comments.

### 5. Defensive Programming & Encapsulation
* `GameCharacter` enforces strong state safety by validating parameters against `null` or invalid values, throwing `IllegalArgumentException` / `NullPointerException` to guarantee runtime stability.

---
## How to Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/dmc-strategy-pattern.git](https://github.com/your-username/dmc-strategy-pattern.git)
   cd dmc-strategy-pattern
Compile the Java files:

javac Main.java
Run the application:

java Main
