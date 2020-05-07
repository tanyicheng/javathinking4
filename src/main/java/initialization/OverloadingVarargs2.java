package initialization;//: initialization/OverloadingVarargs2.java
// {CompileTimeError} (Won't compile)

//todo Error:(13, 5) java: 对f2的引用不明确, initialization.OverloadingVarargs2中的方法 f2(float,java.lang.Character...)和initialization.OverloadingVarargs2中的方法 f2(java.lang.Character...)都匹配
public class OverloadingVarargs2 {
  static void f2(float i, Character... args) {
    System.out.println("first");
  }
  static void f(Character... args) {
    System.out.print("second");
  }
  public static void main(String[] args) {
    f2(1, 'a');
    f('a', 'b');
  }
} ///:~
