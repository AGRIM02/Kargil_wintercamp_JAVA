public class A1Q2 {
    int a;
    String b;

    public A1Q2(int a, String b) {
        this.a = a;
        this.b = b;
    }

    A1Q2(A1Q2 ques2) {
        System.out.println("Copy constructor");
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        A1Q2 obj1 = new A1Q2(1, "Agrim");

        A1Q2 obj2 = (A1Q2) obj1.clone();// cloneable
        A1Q2 obj3 = new A1Q2(obj1);// copy constructor
    }

}
