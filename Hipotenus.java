package Triangle;

import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int opposite, adjacent;
        double hipo;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the dimension of opposite side of the Right Triangle: ");
        opposite=input.nextInt();
        System.out.println("Please input the dimension of adjacent side of the Right Triangle: ");
        adjacent=input.nextInt();

        hipo=Math.sqrt((opposite*opposite)+(adjacent*adjacent));

        System.out.println("Triangle.Hipotenus' length is: " +hipo );

    }

}
