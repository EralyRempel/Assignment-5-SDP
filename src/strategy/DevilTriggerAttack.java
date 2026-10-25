package strategy;

public class DevilTriggerAttack implements AttackStrategy {
    @Override
    public void executeAttack(String attackerName, String targetName, int baseDamage) {
        int damage = baseDamage + 20;
        System.out.println("[Devil Trigger] " + attackerName + " used DT to finally defeat " + targetName);
        System.out.println("---------Begone! " + damage + " dmg-----------");
    }
}
