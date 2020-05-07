package generics;//: generics/BasicGeneratorDemo.java

import net.mindview.util.*;

//TODO-1 构造通用的对象
public class BasicGeneratorDemo {
    public static void main(String[] args) {

        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);

        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());

        //显示的构造Generator
        Generator<CountedObject> gen2 = new BasicGenerator<CountedObject>(CountedObject.class);
//        for(int i = 0; i < 5; i++)
//            System.out.println(gen2.next());
    }
} /* Output:
CountedObject 0
CountedObject 1
CountedObject 2
CountedObject 3
CountedObject 4
*///:~
