package exercise.innerclasses;

/**
 * Even if an interface itself has no use, a nested class defined within it can still be
 * useful. If we define Nested within WithNested, that just means we locate its
 * name there, since all elements of an interface are public. Nested has no
 * added access to the elements of WithNested.
 * @Author created by barrett in 2020/4/19 10:31
 */
interface WithNested {
    class Nested {
        int i;

        public Nested(int i) {
            this.i = i;
        }

        void f() {
            System.out.println("Nested.f");
        }
    }
}

class B2 implements WithNested {
}

public class E20_InterfaceWithNested {
    public static void main(String args[]) {
        B2 b = new B2();

        WithNested.Nested ne = new WithNested.Nested(5);
        ne.f();
    }
} /* Output:
Nested.f
*///:~

