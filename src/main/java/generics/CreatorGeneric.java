package generics;//: generics/CreatorGeneric.java
//TODO-2
abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate() {
        System.out.println("1");
        element = create();
    }

    abstract T create();
}

class X {
}

class Creator extends GenericWithCreate<X> {
    X create() {
        System.out.println("2");
        return new X();
    }

    void f() {
        System.out.println("3 "+element.getClass().getSimpleName());
    }
}

public class CreatorGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
} /* Output:
X
*///:~
