import character.GameCharacter;
import strategy.DevilTriggerAttack;
import strategy.LongDistAttack;
import strategy.MeleeAttack;

public class Main {
    public static void main(String[] args) {
        final var bossName = "Mundus";
        var hero = new GameCharacter("Dante", 40, new MeleeAttack());

        System.out.println("=========== THE BOSS BATTLE ========");
        System.out.printf("------ Phase 1: he landed on the surface. Hit him!------ ", bossName);
        hero.performAttack(bossName);
        System.out.println();

        System.out.printf("------ Phase 2: He started flying. Get him from there! -------", bossName);
        hero.setAttackStrategy(new LongDistAttack());
        hero.performAttack(bossName);
        System.out.println();


        System.out.printf("------ Phase 3: He started tanking bullets and Rebellion. End him! -------", bossName);
        hero.setAttackStrategy(new DevilTriggerAttack());
        hero.performAttack(bossName);
        System.out.println();


        System.out.print("========== YOU DEFEATED MUNDUS HOOORAY !!!! =============");

    }

}