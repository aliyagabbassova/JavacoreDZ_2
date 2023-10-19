package org.example;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

            int[] arrayNumber = createArray();
            System.out.println(Arrays.toString(arrayNumber));
            System.out.println(countEvens(arrayNumber));
            System.out.println(difference(arrayNumber));
            System.out.println(searchZero(arrayNumber));

        }

        //1. Написать метод, возращающий количество четных элементов массива, countEvens([2,1,3,4]) -> 3
        // countEvens([2,2,0]) ->3 countEvens([1,3,5]) ->0

        public static int countEvens(int[] arrayNumber) {
            int count = 0;
            for (int i = 0; i < arrayNumber.length; i++) {

                if (arrayNumber[i] % 2 == 0) {
                    count++;
                }
            }
            System.out.println(count);
            return count;
        }

        //2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
        //переданного не пустого массива.


        public static int difference(int[] arrayNumber) {

            int max = arrayNumber[0];
            int min = arrayNumber[0];
            int diff = 0;
            for (int i = 0; i < arrayNumber.length; i++) {

                if (min > arrayNumber[i]) {
                    min = arrayNumber[i];
                }
                if (max < arrayNumber[i]) {
                    max = arrayNumber[i];
                }

                diff = max - min;
            }

            return diff;
        }

        //3. Написать функцию, возвращающую истину, если в переданном масиве есть
        // два соседних элемента, с нулевым значением.

        public static boolean searchZero(int[] arrayNumber) {

            for (int i = 0; i < arrayNumber.length - 1; i++) {
                if (arrayNumber[i] == 0 && arrayNumber[i + 1] == 0) {
                    return true;
                }
            }
            return false;
        }

        public static int[] createArray() {
            Random random = new Random();
            int[] arrayNumber = new int[4];
            for (int i = 0; i < arrayNumber.length; i++) {
                arrayNumber[i] = random.nextInt(0, 5);
            }
            return arrayNumber;
        }
    }
