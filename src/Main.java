import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperHero superman = new SuperHero("Superman", List.of(new FlyAbility(), new SuperFuerza()));
        superman.useAbility();

        Avengers avengers = new Avengers(List.of(new Ironman(), new Hulk(), new Thor()));
        avengers.fight();
    }
}