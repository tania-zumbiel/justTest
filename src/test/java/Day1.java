import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Arrays;

public class Day1 {

    @Test
    public void testMethod1() {
        System.out.println("Hello World");
    }

    @Test
    public void testNumbers() {
        int myNumber=5;
        double d=4.5;

        System.out.println(myNumber);
        System.out.println(d);
    }

    @Test
    public void testCharsAndString() {
        char letterG='g';
        String howWorks="I am just testing how it works";

        System.out.println(letterG);
        System.out.println(howWorks);
    }

    @Test
    public void testConcat() {
        int numberOfCookies=4;
        String message="I have " + numberOfCookies + " cookies";

        System.out.println(message);
    }

    @Test
    public void testBoolean() {
        boolean b = false;

        System.out.println(b);
    }

    @Test
    public void testTrueFalse() {
        boolean value1 = true;
        boolean value2 = false;

        System.out.println(!value1);
        System.out.println(!value2);
        System.out.println(value1 || value2);
        System.out.println(value1 && value2);
    }

    @Test
    public void testConditionals() {
        int a = 6;
        int b = 7;

        if (a > b) {
            System.out.println("13 is greater than 7!!");
        }
        else {
            System.out.println("Ohh it is not");
        }

    }



    @Test
    public void testArrays() {
        int [] arrayOfInt = {4,5,5,6,7,8,9,8};
        arrayOfInt[0] = 0;
        String result = Arrays.toString(arrayOfInt);
        System.out.println(result);
    }

    @Test
    public void testForLoops() {
        for (int i = 4; i < 45; i++) {
            System.out.println("count is: " + i);
        }
    }

    @Test
    public void testNumbersInArray() {
        int [] arrayOfInt = {4,5,5,6,7,8,9,8};
        for (int i=0; i < arrayOfInt.length; i++){
            System.out.println(arrayOfInt[i]);
        }

    }

    @Test
    public void testPrintEvenNumbers() {
      for (int i=1; i<=100; i++) {
          if (i%2==0) System.out.println(i);
      }
    }

    @Test
    public void testPrintEvenNumbersWorld() {
        for (int i=1; i<=100; i++) {
            if (i%2==0) System.out.println("Hello World!");
        }
    }

    @Test

    public void swapTwoNumbersInArray() {

    int[] array = {1,2,3,4};
    swap (array, 1, 2);
	System.out.println(Arrays.toString(array));
}

    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL]=array[indexR];
        array[indexR]=temp;
    }
}
