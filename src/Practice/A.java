package Practice;

class A {
    A() { System.out.print("A "); }
}
class B extends A {
    B() { System.out.print("B "); }
}
class Main {
    public static void main(String[] args) {
        new B();
    }
}