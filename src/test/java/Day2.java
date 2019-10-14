import org.testng.annotations.Test;

import java.util.Arrays;

public class Day2 {

    @Test
    public void testPrintEvenNumbersWorld() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println("Hello World!");
        }
    }

    @Test

    public void evenNumbersReturn() {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    @Test

    public void testConditionalsNumbers() {

        int a = 10;
        int n = 107;
        if (n < a) {
            System.out.println("hah");
        } else {
            System.out.println(n + " greater than " + a);
        }
    }


    @Test

    public void swapArrayNumbers() {

        int[] array = {1, 2, 3, 4};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }

    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;

    }

    @Test

    public void countLettersL() {

        String input = "Hello world";
        int result = 0;
        for (char eachChar : input.toCharArray()) {
            if (eachChar == 'l') result++;

        }
        System.out.println(result);
    }

    @Test

    public void testClassObjects() {
        Actors actor1 = new Actors();
        Actors actor2 = new Actors("Arnold", "Schwarzenegger", 60);
        actor2.act();
        actor2.play();
        actor2.retire();
    }

    @Test

    public void testLoopswhile(){
        int i=0;
        while (i<5){
            System.out.println(" =" +i);
            i++;


        }
    }

}

