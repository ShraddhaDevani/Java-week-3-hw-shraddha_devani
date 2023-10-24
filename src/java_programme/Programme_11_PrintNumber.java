package java_programme;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.
 */
public class Programme_11_PrintNumber {
    public static void main(String[] args) {
        int x = 1;
        int y = 100;
        System.out.println("Number divided by 3: ");
        DividedBy3(x, y);
        System.out.println("Number divided by 5: ");
        DividedBy5(x, y);
    }

    //Method for divided by 3
    public static void DividedBy3(int current, int end) {
        if (current <= end) {
            if (current % 3 == 0) {
                System.out.println(current + "  ");
            }
            DividedBy3(current + 1, end);
        }
    }

    //Method for divided by 5
    public static void DividedBy5(int current, int end) {
        if (current <= end) {
            if (current % 5 == 0) {
                System.out.println(current + "  ");
            }
            DividedBy5(current + 1, end);
        }
    }

}
