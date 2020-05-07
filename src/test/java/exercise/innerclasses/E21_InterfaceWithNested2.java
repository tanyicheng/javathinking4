package exercise.innerclasses;

/**
 Notice that we use an anonymous inner class to implement interface I.
 It’s generally clearer to list all methods of an interface, then define nested classes.
 * @Author created by barrett in 2020/4/19 10:36
 */
interface I {
    void f();

    void g();

    class Nested {
        static void call(I impl) {
            System.out.println("Calling I.f()");
            impl.f();
            System.out.println("Calling I.g()");
            impl.g();
        }
    }
}
//等同于这么写
//class Imp implements I{
//
//    public void f() {
//
//    }
//
//    public void g() {
//
//    }
//}

public class E21_InterfaceWithNested2 {
    public static void main(String[] args) {
        I impl = new I() {
            public void f() {
                System.out.println("f 被调用");
            }

            public void g() {
                System.out.println("g 被调用");
            }
        };
//        Imp imp = new Imp();
        I.Nested.call(impl);
    }
}/* Output:
Calling I.f()
Calling I.g()
*/
