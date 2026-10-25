package strategy;

public class LongDistAttack implements AttackStrategy {
    @Override
    public void executeAttack(String attackerName, String targetName, int baseDamage){
        int damage = baseDamage - 5;
        System.out.println("[Long Distance Attack] " + attackerName + " jumping with Ebony & Ivory from " + targetName);
        System.out.println("----------JACKPOT " + damage + " dmg------------");
    }

}
