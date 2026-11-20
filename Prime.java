import java.util.*;

class Prime {
    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = A.nextInt();

        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        A.close();
    }
}
