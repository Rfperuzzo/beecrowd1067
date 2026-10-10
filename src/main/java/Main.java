
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x , i;

        x = scanner.nextInt();

        for (i = 1 ; i <= x ; i = i + 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }
}
