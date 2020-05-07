package generics;//: generics/GenericArray.java

//泛型数组包装器
public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    // Method that exposes the underlying representation:
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<Integer>(10);
        // This causes a ClassCastException:
        //不能直接用Integer 接收，需要用Object转型
        //! Integer[] ia = gai.rep();
        // This is OK:
        Object[] oa = gai.rep();
        for (Object o : oa) {
            System.out.println(o);
        }
    }
} ///:~
