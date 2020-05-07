package interfaces;//: interfaces/Adventure.java
// Multiple interfaces.
//打架
interface CanFight {
    void fight();
}
//游泳
interface CanSwim {
    void swim();
}
//飞行
interface CanFly {
    void fly();
}
//攀岩
interface CanClimb {
    void climb();
}
//角色
class ActionCharacter {

    public void fight() {
        System.out.println("打架");
    }

    public void climb() {
        System.out.println("攀岩");
    }

}
//英雄人物
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly,CanClimb {
    public void swim() {
        System.out.println("冒险英雄：游泳");
    }

    public void fly() {
        System.out.println("冒险英雄：飞行");
    }

}
//去冒险
public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
    }
} ///:~
