package Triangle;

import java.util.Scanner;
public class TriangelArea {
    public static void main(String[] args) {

        double side1,side2,side3;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Input the dimension of first side of the Triangle:  ");
        side1=input.nextDouble();
        System.out.println("Please input the dimension of second side of the Triangle:  ");
        side2=input.nextDouble();
        System.out.println("Please input the dimension of thitd side of the Triangle: ");
        side3=input.nextDouble();

        double p,u,a;
        p=(side1+side2+side3);
        u=p/2.0;
        a=Math.sqrt(u*(u-side1)*(u-side2)*(u-side3));

        System.out.println("Your Triangel's perimeter is: " + p);
        System.out.println("Your Triangel's area is: "  +a );









    }



}
