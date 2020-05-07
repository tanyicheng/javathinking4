package interfaces;//: interfaces/HorrorShow.java

// Extending an interface with inheritance.
//怪物
interface Monster {
    void menace();
}

//危险的怪物
interface DangerousMonster extends Monster {
    //破坏
    void destroy();
}

//致死
interface Lethal {
    void kill();
}

//哥斯拉
class DragonZilla implements DangerousMonster {
    //恐吓
    public void menace() {
        System.out.println("恐吓");
    }

    //破坏
    public void destroy() {
        System.out.println("破坏");
    }
}

//吸血鬼
interface Vampire extends DangerousMonster, Lethal {
    //吸血
    void drinkBlood();
}

//邪恶的吸血鬼
class VeryBadVampire implements Vampire {
    public void menace() {
    }

    public void destroy() {
    }

    public void kill() {
    }

    public void drinkBlood() {
    }
}

//干坏事
public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }


    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
//        u(vlad);
//        v(vlad);
//        w(vlad);
    }
} ///:~
