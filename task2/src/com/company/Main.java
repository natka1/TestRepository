package com.company;


public class Main {
    public static void main(String[] args) {

        int[] example1 = new int[]{55, 2, 777};
        int[] example2 = new int[]{12, 245, 7067};
        int[] example3 = new int[]{22, 444, 1122};
        int[] example4 = new int[]{111, 345, 12};

        //lessLength(example1);
        //muchLength(example1);
        //sortDesc(example1);
        // sortAsc(example1);
        //numbers(example1);
        //printLonger(example1);
        //minDifDigit(example2);
        //evenEvenOdd(example3);
        //numbersIncrement(example4);
        //difDigit(example4);

    }
    //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину


/*    public static void numbers(int[] args) {
        int size = Integer.toString(Integer.MAX_VALUE).length(), el=Integer.MAX_VALUE;
        for (int iterator : args) {
            int itsize = Integer.toString(iterator).length();
            String siterator = Integer.toString(iterator);
            if (itsize < size) {
                size = itsize;
                el = iterator;
            }
        }
        System.out.println("Minimal length: "+size+" character in "+el+" element");
    }


   public static void printLonger(int[] args){
        int size = 0, el=0;
        for (int iterator : args) {
            int itsize = Integer.toString(iterator).length();
            String siterator = Integer.toString(iterator);
            if (itsize > size) {
                size = itsize;
                el = iterator;
            }
        }
        System.out.println("Maximal length: "+size+" character in "+el+" element");
    }
}*/

//2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

/*private static void insertSortDesc(String[] array){
        for(int i=1; i<array.length;i++) {
        String cur = array[i];
        int j;
        for(j=i-1;j>=0&&array[j].length()>cur.length();j--)
        array[j+1]=array[j];
        array[j+1]=cur;
        }
        }

private static void insertSortAsc(String[] array){
        for(int i=1; i<array.length;i++) {
        String cur = array[i];
        int j;
        for(j=i-1;j>=0&&array[j].length()<cur.length();j--)
        array[j+1]=array[j];
        array[j+1]=cur;
        }
        }

public static void printArray(String[] array){
        for(int i=0;i<array.length;i++)
        System.out.print(array[i]+" ");
        System.out.println();
        }

public static void sortDesc(int [] args){
        String[] array = new String[args.length];
        for(int i=0; i<args.length;i++) {
        array[i] = (Integer.toString(args[i]));
        }
        insertSortDesc(array);
        System.out.println("Array sort by count of numbers(desc): ");
        printArray(array);
        }

public static void sortAsc(int [] args){
        String[] array = new String[args.length];
        for(int i=0; i<args.length;i++) {
        array[i] = (Integer.toString(args[i]));
        }
        insertSortAsc(array);
        System.out.println("Array sort by count of numbers(asc): ");
        printArray(array);
        }
}*/


//3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.


/*    public static void lessLength(int [] args) {
        String [] result = new String[args.length] ;
        int average = 0;
        for (int i = 0; i< args.length ; i++) {
            result[i]=(Integer.toString(args[i]));
            average += Integer.toString(args[i]).length();
        }
        average /= result.length;
        System.out.println("Average is: " + average);
        System.out.print("Element with lower then average size: ");
        for (int i = 0; i < result.length; i++) {
            if (result [i].length() < average) {
                System.out.print("element " + result [i] + " length " + result[i].length() + ", ");
            }
        }
        System.out.println();
    }

    public static void muchLength(int [] args) {
        String [] result = new String[args.length];
        int average = 0;
        for (int i=0; i < result.length; i++) {
            result[i]=(Integer.toString(args[i]));
            average += Integer.toString(args[i]).length();
        }
        average /= result.length;
        System.out.println("Average is: " + average);
        System.out.print("Element with higher then average size: ");
        for (int i = 0; i < result.length; i++) {
            if (result [i].length() > average) {
                System.out.print("element " + result[i] + " length " + result[i].length() + ", ");
            }
        }
        System.out.println();
    }
}*/


//4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.


    private static boolean isUnique(String st) {
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j))
                    return false;
            }
        }
        return true;
    }





   private static int uniqueNum(String st){
        int[] nums = new int[10]; // counter 0 1 2 3 4 5 6 7 8 9
        int count=0;
        for(int i = 0; i<st.length();i++) {
        nums[Character.getNumericValue(st.charAt(i))]++;
        }
        for(int i = 0; i<10;i++) {
        if(nums[i]==1) count++;
        }
        return count;
        }

public static void minDifDigit(int [] args) {
    String[] result = new String[args.length];
    String winner = "";
    for (int i = 0; i < args.length; i++) {
        if (Integer.toString(i).length() < 11) {
            result[i]=(Integer.toString(args[i]));
        }
    }
    int min = 11;
    for (String st : result) {
        if (uniqueNum(st) < min) {
            min = uniqueNum(st);
            winner = st;
        }
    }
    System.out.println("Number with minimal count of unique digit is " + winner);
}



//5. Найти количество чисел, содержащих только четные цифры,
// а среди них количество чисел с равным числом четных и нечетных цифр.


/*    private static boolean isEvenOdd(String st) {
        int even = 0, odd = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.getNumericValue(st.charAt(i)) % 2 == 0)
                even++;
            else odd++;
        }
        if (even == odd)
            return true;
        else
            return false;
    }

    public static void evenEvenOdd(int [] args) {
        String [] result = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) {
                result[i]=(Integer.toString(args[i]));
            }
        }
        int count = 0;
        System.out.println("Numbers with equal number of even and odd digits:");
        for (String st : result) {
            if (st == null){
                continue;
            }
            if (isEvenOdd(st)) {
                System.out.print(st + " ");
                count++;
            }
        }
        System.out.println("\nCount of even numbers with equal number of even and odd digits is " + count);
    }
}*/

//6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько,
// найти первое из них

    private static boolean isProgression(String st) {
            for (int j = 1; j < st.length(); j++) {
                if (Character.getNumericValue(st.charAt(j)) <= Character.getNumericValue(st.charAt(j-1)))
                    return false;
            }
        return true;
    }

    public static void numbersIncrement(int [] args) {
        for (int j : args) {
            if (isProgression(Integer.toString(j))) {
                System.out.println("Number with digit in arithmetic progression " + j);
                break;
            }
        }
    }



    //7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них


public static void difDigit(int [] args){
    for(int st: args) {
        if (isUnique(Integer.toString(st))) {
            System.out.println("Number with unique digits is " + st);
            break;
        }
    }
    }

}