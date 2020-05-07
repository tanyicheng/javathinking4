package typeinfo;//: typeinfo/FilledList.java


import java.util.*;

class CountedInteger {
    private static long counter;
    private final long id = counter++;
    static {
        System.out.println("counter: " + counter );
    }

    public CountedInteger() {
        System.out.println("counter: " + counter + ", id: " + id + "");
    }

    public String toString() {
        return Long.toString(id);// + "-@" + Integer.toHexString(hashCode());
    }
}
//fixme-3
public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i < nElements; i++) {
                T t = type.newInstance();
                result.add(t);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<CountedInteger> create2(int nElements) {
        List<CountedInteger> result = new ArrayList<CountedInteger>();
        try {
            for (int i = 0; i < nElements; i++) {
                CountedInteger ci = new CountedInteger();
                result.add(ci);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
        System.out.println(fl.create(15));
//        CountedInteger ci = new CountedInteger();
//        CountedInteger ci2 = new CountedInteger();
//        System.out.println(ci);
//        System.out.println(ci2);
    }
}
/* Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
*///:~
