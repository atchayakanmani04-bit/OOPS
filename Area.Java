import java.util.Scanner;

class Area {
    public static void main(String[] args) {


    float radius;
    float area;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
    radius = sc.nextFloat();
    area= (float) (3.14*radius*radius);
        System.out.println("Area of the circle is : " + area);





    }
}
