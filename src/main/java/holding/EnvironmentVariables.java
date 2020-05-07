package holding;//: holding/EnvironmentVariables.java

import java.util.*;
/**
 * 系统环境变量
 * @Author created by barrett in 2020/4/21 22:09
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }
} /* (Execute to see output) *///:~
