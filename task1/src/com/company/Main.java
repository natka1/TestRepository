//task 1
package com.company;

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
*/


//task2


/*
public class Main {

    public static void main(String[] args){
        args = new String[] {"a", "b", "c"};
        for (int i = args.length; i != 0; i--)

            System.out.println("args[" + (i-1) +"] = " + args[i-1]);
    }
}
*/


// task3 Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

/*import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите количество случайных чисел: ");
        Scanner reader = new Scanner(System.in);
        int qty = reader.nextInt();
        Random rand = new Random();
        for (Integer i = 0; i < qty; i++) {
            System.out.println(rand.nextInt());
        }
        for (Integer i = 0; i < qty; i++) {
            System.out.print(rand.nextInt());
            if (i != qty - 1){
                System.out.print(", ");
            }
        }
    }
}*/



//task4


/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Enter your password and click Enter:");
        Scanner scan = new Scanner(System.in);
        String pw = scan.next();
       if (pw.equals("qwerty")){
           System.out.println("Password correct!");
       }
       else
       {
           System.out.println("Wrong password!");
       }
   }
}*/


//task5


/*
public class Main {
    public static void main(String[] args) {
        args = new String [] {"2","3"};
        int s=0, p=1;
        for(int i=0; i<args.length; i++)
        {
            int number = Integer.parseInt(args[i]);
            s=s + number;
            p=p * number;
        }
        System.out.println("Сумма = " + s);
        System.out.println("Произведение = "+ p);
    }
}
*/

//task6

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number's quantity");
        int n = reader.nextInt();
        int[] numbersEntered = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter" + (i + 1) + ": ");
            numbersEntered[i] = reader.nextInt();
        }
//6.1 четные и нечетные числа
        System.out.println("Even numbers: ");
        for (int number : numbersEntered) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        System.out.println("Odd numbers: ");
        for (int number : numbersEntered) {
            if (number % 2 != 0) {
                System.out.println(number);
            }


        }

        // 6.2 Max/ Min numbers
        System.out.print("Max number: ");
        int max = numbersEntered[0];
        for (int number : numbersEntered) {
            if (number > max) {
                max = number;
            }

        }
        System.out.println(max);


        System.out.print("Min number: ");
        int min = numbersEntered[0];
        for (int number : numbersEntered) {
            if (number < min) {
                min = number;
            }

        }
        System.out.println(min);

//6.3
        System.out.println("Divide by 3 or 9: ");
        for (int number : numbersEntered) {
            if (number % 3 == 0 || number % 9 == 0) {
                System.out.println(number);
            }
        }

        //6.4
        System.out.println("Divide by 5 and 7: ");
        for (int number : numbersEntered) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println(number);
            }
        }

        // 6.5
        System.out.println("3 digits numbers with no equal digits: ");
        for (int number : numbersEntered) {
            if (number >= 100 && number <= 999) {
                String str = Integer.toString(number);

                int first = str.charAt(0);
                int second = str.charAt(1);
                int third = str.charAt(2);
                if (first != second && first != third && second != third) {
                    System.out.println(number);
                }
            }
        }

        //6.6
        System.out.println("Lucky numbers: ");
        for (int number : numbersEntered) {
            if (number >= 1000 && number <= 9999) {
                String str = Integer.toString(number);

                int first = str.charAt(0);
                int second = str.charAt(1);
                int third = str.charAt(2);
                int fourth = str.charAt(3);
                if (first + second == third + fourth) {
                    System.out.println(number);
                }
            }
        }

        // 6.7

        System.out.println("Half-sum: ");
        for (int i = 1; i < n - 1; i++) {

            int prev = numbersEntered[i - 1];
            int next = numbersEntered[i + 1];
            if ((prev + next) / 2 == numbersEntered[i]) {
                System.out.println(numbersEntered[i]);

            }


        }
    }
}



/*
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < size; i++) {
            if (numbers % 2 == 0)
                list1.add(numbers);
            else
                list2.add(numbers);
        }
        System.out.println("Чётные числа: " + list1);
        System.out.println("Нечётные числа: " + list2);
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] sourceNumbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = in.nextInt();
        }
        // 1. Четные и нечетные числа
       // findEvenAndOddNumbers(sourceNumbers);
    }
}*/
/*import java.util.*;*/
//import java.util.Map.Entry;

//import static java.util.Collections.*;
/*
public class Main {
    public static void main( Integer[]  sourceNumbers) {
        List<Integer> evens = new ArrayList<Integer>();
        List<Integer> odds = new ArrayList<Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            if (sourceNumber % 2 == 0) {
                evens.add(sourceNumber);
            } else {
                odds.add(sourceNumber);
            }
        }
        System.out.println("Чётные числа: " + evens);
        System.out.println("Нечётные числа: " + odds);
    }
}
*/


