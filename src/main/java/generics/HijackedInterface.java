package generics;//: generics/HijackedInterface.java
// {CompileTimeError} (Won't compile)

//class Cat extends ComparablePet implements Comparable<Cat>{
class Cat extends ComparablePet {
  // Error: Comparable cannot be inherited with
  // different arguments: <Cat> and <Pet>
  public int compareTo(Cat arg) { return 0; }
} ///:~
