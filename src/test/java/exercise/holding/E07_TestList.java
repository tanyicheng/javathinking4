package exercise.holding;

import java.util.*;

class IDClass {
    private static int counter;
    private int count = counter++;

    public String toString() {
        return "IDClass " + count;
    }
}

public class E07_TestList {
    public static void main(String args[]) {
        IDClass[] idc = new IDClass[10];
        for (int i = 0; i < idc.length; i++)
            idc[i] = new IDClass();//赋值（对象）

        List<IDClass> lst = new ArrayList<IDClass>(Arrays.asList(idc));
        System.out.println("lst = " + lst);
        List<IDClass> subSet = lst.subList(lst.size() / 4, lst.size() / 2);
        System.out.println("subSet = " + subSet);
        // The semantics of the sub list become undefined if the
        // backing list is structurally modified!
        //! lst.removeAll(subSet);
        subSet.clear();
        System.out.println("subSet = " + subSet);
        System.out.println("lst = " + lst);
    }
} /* Output:
lst = [IDClass 0, IDClass 1, IDClass 2, IDClass 3, IDClass
4, IDClass 5, IDClass 6, IDClass 7, IDClass 8, IDClass 9]
subSet = [IDClass 2, IDClass 3, IDClass 4]
lst = [IDClass 0, IDClass 1, IDClass 5, IDClass 6, IDClass
7, IDClass 8, IDClass 9]
*///:~
 /*
 The methods asList( ) and subList( ) return immutable Lists because they are
        “backed” by the underlying array and list, respectively. If you structurally modify
        the backing list as we did in the commented-out section, you get a concurrent
        modification exception. Therefore, the program operates on the sublist instead
        of the backing list. Alternatively, avoid errors by creating a separate copy of the
        returned sublist and use that as an argument to removeAll( ).*/
