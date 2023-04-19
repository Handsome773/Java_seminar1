//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Hello what is your name?: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        System.out.println(); // Println - перенос на новую строку,
//        iScanner.close();
////    }
//}

//Задание
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                int[] array = new int[] {1, 1, 0, 1, 1, 1};
                int maxCount = 0;
                for (int i = 0; i < array.length; i++){
                    if (array[i] == 1) {
                        maxCount++;
                    } else {
                        maxCount = 0;
                    }
                }
                System.out.println(maxCount);
            }

            }


