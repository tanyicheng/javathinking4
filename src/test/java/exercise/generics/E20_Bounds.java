package exercise.generics;

interface Top {
    void a();
    void b();
}

class CombinedImpl implements Top {
    public void a() {
        System.out.println("Top::a()");
    }

    public void b() {
        System.out.println("Top::b()");
    }

    public void c() {
        System.out.println("CombinedImpl::c()");
    }
}

public class E20_Bounds {
    static <T extends Top> void f(T obj) {
        obj.a();
        obj.b();
        // c() is not part of an interface
        // obj.c();
    }

    public static void main(String[] args) {
        f(new CombinedImpl());
    }
} /* Output: 
Top::a() 
Top::b() 
*///:~