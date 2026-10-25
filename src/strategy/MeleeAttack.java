package strategy;

public class MeleeAttack implements AttackStrategy {
    @Override
    public void executeAttack(String attackerName, String targetName, int baseDamage) {
        int damage = baseDamage +15;
        System.out.println("[Melee Attack] -Check this out! " + attackerName + " Taking the Rebelion and goes to " + targetName);
        System.out.println("------Take this! " + damage + " dmg---------");
    }

}
