import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1,2");

        int[] massiveFirst = new int[]{1, 2, 3};
        double[] massiveTwo = {1.57, 7.654, 9.986};
        int[] massiveThree = new int[20];
        for (int index = 0; index < massiveThree.length; index++) {
            massiveThree[index] = index + 1;
        }

        //Задача 2

        for (int i = 0; i < massiveFirst.length; i++) {
            if (i == massiveFirst.length - 1) {
                System.out.println(massiveFirst[i]);
                break;
            }
            System.out.print(massiveFirst[i] + ", ");
        }
        for (int i = 0; i < massiveTwo.length; i++) {
            if (i == massiveTwo.length - 1) {
                System.out.println(massiveTwo[i]);
                break;
            }
            System.out.print(massiveTwo[i] + ", ");
        }
        for (int i = 0; i < massiveThree.length; i++) {
            if (i == massiveThree.length - 1) {
                System.out.println(massiveThree[i]);
                break;
            }
            System.out.print(massiveThree[i] + ", ");
        }

        System.out.println("Задача 3");
        for (int i = massiveFirst.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiveFirst[i]);
                break;
            }
            System.out.print(massiveFirst[i] + ", ");
        }
        for (int i = massiveTwo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiveTwo[i]);
                break;
            }
            System.out.print(massiveTwo[i] + ", ");
        }
        for (int i = massiveThree.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiveThree[i]);
                break;
            }
            System.out.print(massiveThree[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] massiveFirst = {1, 2, 3};
        for (int i = 0; i < massiveFirst.length; i++) {
            if (massiveFirst[i] % 2 != 0) {
                massiveFirst[i] += 1;
            }
        }
        System.out.println(Arrays.toString(massiveFirst));
    }
}
