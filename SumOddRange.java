package com.philipfreyre;

public class SumOddRange {
    public static void main(String[] args) {
        sumOdd(3, 7);
        sumOdd(4, 10);
        sumOdd(29, 55);
    }

    // checks is number is odd or not
    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            //System.out.println("isOdd() true" + number);
            return true;
        } else {
            //System.out.println("isOdd() false" + number);
            return false;
        }
    }

    // uses isOdd() method to check if numbers are odd or not
    // then sums up start + end = total
    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (start > 0 && end >= start) {

            sum = start + end;
            System.out.println("Fist Sum is: " + sum);
            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {
                    System.out.println("Odd number: " + i);
                    sum += i;
                }
            }
            return sum;
        }

        return -1;
    }
}


