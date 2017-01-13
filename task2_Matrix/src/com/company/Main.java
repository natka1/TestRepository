package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //int [] [] matrix1 = createMatrix(4,6);
        //printMatrix(matrix1);

        //printMatrix(10);

        //printMatrix(createRandomMatrix(5));

        //int [][] matrix9_1 = createRandomMatrix(5);
        //sortRows(matrix9_1);
        // printMatrix(matrix9_1);

        /*int [][] matrix9_1 = createRandomMatrix(5);
        sortCols(matrix9_1);
        printMatrix(matrix9_1);*/

        /*int [][] matrix9_2 = createRandomMatrix(5);
        printMatrix(matrix9_2);
        System.out.println("---------------------------");
        shiftLeft(matrix9_2);
        printMatrix(matrix9_2);*/


        /*int [][] matrix9_2 = createRandomMatrix(5);
        printMatrix(matrix9_2);
        System.out.println("---------------------------");
        shiftRight(matrix9_2);
        printMatrix(matrix9_2);*/

        /*int [][] matrix9_2 = createRandomMatrix(5);
        printMatrix(matrix9_2);
        System.out.println("---------------------------");
        shiftUp(matrix9_2);
        printMatrix(matrix9_2);*/

        /*int [][] matrix9_2 = createRandomMatrix(5);
        printMatrix(matrix9_2);
        System.out.println("---------------------------");
        shiftDown(matrix9_2);
        printMatrix(matrix9_2);*/

  /*      int [][] matrix9_3 = createRandomMatrix(5);
        printMatrix(matrix9_3);
        progrUp(matrix9_3);
        progrDown(matrix9_3);*/

        /*int [][] matrix9_4 = createRandomMatrix(5);
        printMatrix(matrix9_4);
        sumBetween(matrix9_4);*/

        /*int [][] matrix9_5 = createRandomMatrix(3);
        printMatrix(matrix9_5);
        System.out.println("---------------------------");
        printMatrix(rotate90(matrix9_5));*/

        /*int [][] matrix9_5 = createRandomMatrix(3);
        printMatrix(matrix9_5);
        System.out.println("---------------------------");
        printMatrix(rotate180(matrix9_5));*/

        /*int [][] matrix9_5 = createRandomMatrix(3);
        printMatrix(matrix9_5);
        System.out.println("---------------------------");
        printMatrix(rotate270(matrix9_5));*/

        /*int [][] matrix9_6 = createRandomMatrix(3);
        printMatrix(matrix9_6);
        System.out.println("---------------------------");
        printMatrix(subArithm(matrix9_6));*/

        int[][] matrix9_8 = createRandomMatrix(5);
        printMatrix(matrix9_8);
        System.out.println("---------------------------");
        zeroInRow(matrix9_8);
        printMatrix(matrix9_8);


    }

    public static int[][] createMatrix(int n, int m) {
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = i * m + j + 1;
            }


        }
        return result;
    }

    public static void printMatrix(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз

    public static void printMatrix(int n) {
        printMatrix(createMatrix(n, n));

    }


//Matrix

    //9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
    //тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
    //сел.

    public static int[][] createRandomMatrix(int size) {
        Random r = new Random();
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = r.nextInt(size * 2 + 1) - size;
            }
        }
        return result;
    }

    //9.1 Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
    public static void sortRows(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = matrix.length - 1; j > i; j--) {
                    if (matrix[row][j] < matrix[row][j - 1]) {
                        int tmp = matrix[row][j];
                        matrix[row][j] = matrix[row][j - 1];
                        matrix[row][j - 1] = tmp;
                    }
                }
            }
        }
    }


    public static void sortCols(int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = matrix.length - 1; j > i; j--) {
                    if (matrix[j][col] < matrix[j - 1][col]) {
                        int tmp = matrix[j][col];
                        matrix[j][col] = matrix[j - 1][col];
                        matrix[j - 1][col] = tmp;
                    }
                }
            }
        }
    }


    //9.2 . Выполнить циклический сдвиг заданной матрицы на k позиций вправо(влево, вверх, вниз).

    public static void shiftLeft(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int tmp = matrix[row][0];
            for (int i = 0; i < matrix.length - 1; i++) {
                matrix[row][i] = matrix[row][i + 1];
            }
            matrix[row][matrix.length - 1] = tmp;
        }
    }

    public static void shiftRight(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int tmp = matrix[row][matrix.length - 1];
            for (int i = matrix.length - 1; i > 0; i--) {
                matrix[row][i] = matrix[row][i - 1];
            }
            matrix[row][0] = tmp;
        }
    }

    public static void shiftUp(int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            int tmp = matrix[0][col];
            for (int i = 0; i < matrix.length - 1; i++) {
                matrix[i][col] = matrix[i + 1][col];
            }
            matrix[matrix.length - 1][col] = tmp;
        }
    }

    public static void shiftDown(int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            int tmp = matrix[matrix.length - 1][col];
            for (int i = matrix.length - 1; i > 0; i--) {
                matrix[i][col] = matrix[i - 1][col];
            }
            matrix[0][col] = tmp;
        }
    }


    //9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
    public static void progrUp(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int max = 1;
            int counter = 1;
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[row][i] > matrix[row][i - 1]) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                    }
                } else {
                    counter = 1;
                }
            }

            System.out.println("Largest progression Up in row " + row + ": " + max);
        }
    }

    public static void progrDown(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int max = 1;
            int counter = 1;
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[row][i] < matrix[row][i - 1]) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                    }
                } else {
                    counter = 1;
                }
            }

            System.out.println("Largest progression Down in row " + row + ": " + max);
        }
    }

//9.4 Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.

    public static void sumBetween(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            int start = -1, end = -1;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] > 0) {
                    if (start == -1) {
                        start = col;
                    } else if (end == -1) {
                        end = col;
                    } else {
                        break;
                    }
                }
            }
            if (start != -1 && end != -1) {
                for (int i = start + 1; i < end; i++) {
                    sum += matrix[row][i];
                }
            }
            System.out.println("Sum of elements between positive in row " + row + ": " + sum);
        }
    }


    //9.5 Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
    public static int[][] rotate90(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                result[row][col] = matrix[(matrix.length - col - 1)][row];
            }
        }
        return result;
    }

    public static int[][] rotate180(int[][] matrix) {
        return rotate90(rotate90(matrix));
    }

    public static int[][] rotate270(int[][] matrix) {
        return rotate90(rotate90(rotate90(matrix)));
    }

//9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.

    public static int[][] subArithm(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            int aver = 0;
            for (int col = 0; col < matrix.length; col++) {
                aver += matrix[row][col];
            }
            aver /= matrix.length;
            for (int col = 0; col < matrix.length; col++) {
                result[row][col] = matrix[row][col] - aver;
            }
        }
        return result;
    }


//9.7 Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.

  /*public static int[][] compactRows(int[][] matrix) {

  }*/

    //9.8 Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных
    public static void zeroInRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = matrix.length - 1; j > i; j--) {
                    if (matrix[row][j - 1] == 0) {
                        matrix[row][j - 1] = matrix[row][j];
                        matrix[row][j] = 0;
                    }
                }
            }
        }
    }
}
