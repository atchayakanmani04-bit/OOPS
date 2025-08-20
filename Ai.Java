class Ai {
    int a;
    String name, B;

    void set(int a) {
        this.a = a;
        System.out.println("Value of a is :" + a);
    }

    void set(String name, int a) {
        this.name = name;
        this.a = a;
        System.out.println("The value of name is : "+ name + " a is :" + a);
    }

    void set(String name, String B) {
        this.name = name;
        this.B = B;
        System.out.println("The value of name is:" + name + " B is :" + B);
    }
}
public class A {
    public static void main(String[] args) {

        Ai obj = new Ai();
        obj.set("Aishwarya",8);
        obj.set("Aishwarya","Cat");
        obj.set(26);

    }
}
