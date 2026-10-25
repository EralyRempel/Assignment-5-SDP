package character;
import strategy.AttackStrategy;

public class GameCharacter {
    private final String name;
    private final int baseDamage;
    private AttackStrategy attackStrategy;

    public GameCharacter(String name, int baseDamage, AttackStrategy initialStrategy) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("You can not leave character nameless");
        }
        if (baseDamage <= 0) {
            throw new IllegalArgumentException("Base damage must be more than 0");
        }
        this.name = name;
        this.baseDamage = baseDamage;
        setAttackStrategy(initialStrategy);
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        if (attackStrategy == null) {
            throw new IllegalArgumentException("Strategy can not be null.");
        }
        this.attackStrategy = attackStrategy;
    }

    public void performAttack(String targetName) {
        if (targetName == null || targetName.isBlank()) {
            throw new IllegalArgumentException("Target name can not be null");
        }
        this.attackStrategy.executeAttack(this.name, targetName, this.baseDamage);
    }

    public String getName() {
        return name;
    }
}
