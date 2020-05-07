package exercise.generics;

import generics.watercolors.*;

import java.util.*;

import static net.mindview.util.Print.*;
import static generics.watercolors.Watercolors.*;

/**
 * 研究jdk文档中EnumSet部分，它定义了clone()方法，在Sets2中却不能复制set接口中的引用，尝试修改Sets，使其不但能接受set接口，
 * 且能直接接受EnumSet,并使用clone()而不是新建HashSet对象
 * @Author created by barrett in 2020/5/2 15:27
 */
class Sets2 {
    @SuppressWarnings("unchecked")
    protected static <T> Set<T> copy(Set<T> s) {
        if (s instanceof EnumSet)
            return ((EnumSet) s).clone();
        return new HashSet<T>(s);
    }

    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = copy(a);
        result.addAll(b);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {

        Set<T> result = copy(a);
        result.retainAll(b);
        return result;
    }

    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = copy(superset);
        result.removeAll(subset);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}

public class E17_Sets2 {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        print("set1: " + set1);
        print("set2: " + set2);
        print("union(set1, set2): " + Sets2.union(set1, set2));
        print("union(set1, set2) type: " + Sets2.union(set1, set2).getClass().getSimpleName());
        Set<Integer> set3 = new HashSet<Integer>();
        set3.add(1);
        Set<Integer> set4 = new HashSet<Integer>();
        set4.add(2);
        print("set3: " + set3);
        print("set4: " + set4);
        print("union(set3, set4): " + Sets2.union(set3, set4));
        print("union(set3, set4) type: " + Sets2.union(set3, set4).getClass().getSimpleName());
    }
}