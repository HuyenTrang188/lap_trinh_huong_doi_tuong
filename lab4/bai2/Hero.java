package bai2;

public class Hero extends ActionCharacter implements CanSwim, CanFly, CanFight{
    @Override
    public void fly() {
        System.out.println("Hero is flying");
    }

    @Override
    public void swim() {
        System.out.println("Hero is swimming");
    }
}
