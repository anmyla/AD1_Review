package Solutions.f_Sort.Demo01_BubbleSort2023;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] numbers = { 4,3,10,49,1,3,5,9 };

        System.out.println("Vor der Sortierung: " + Arrays.toString(numbers));

        bubbleSorter.sort(numbers);

        System.out.println("Nach der Sortierung: " + Arrays.toString(numbers));
    }
}
