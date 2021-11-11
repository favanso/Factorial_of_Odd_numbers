import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        int number = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("NUMBER: ");
        number = keyboard.nextInt();

        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
            } else
                numbers.add(i);
        }
        System.out.println(numbers.stream().reduce(1, (a, b) -> a * b));
    }
}



