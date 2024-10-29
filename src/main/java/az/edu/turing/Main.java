package az.edu.turing;

public class Main {
    public static void main(String[] args) {

        int a = 15;
        int b = 7;

        a++; // Increase a by 1
        b++; // Increase b by 1
        System.out.println("After ++: a = " + a + ", b = " + b);

        a--; // Decrease  a by 1
        b--; // Decrease b by 1
        System.out.println("Before --: a = " + a + ", b = " + b);

        a += 2; // Add 2 to a
        System.out.println("Before +=: a = " + a);


        b -= 1; // Subtract 1 from b
        System.out.println("Before -=: b = " + b);
    }
}
