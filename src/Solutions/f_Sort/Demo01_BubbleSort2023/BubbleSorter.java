package Solutions.f_Sort.Demo01_BubbleSort2023;

public class BubbleSorter {

    public void sort(int[] numbers)
    {
        // j = Durchläufe
        for (int j = numbers.length; j > 1; j--)
        {
            // i = Vergleichs-Index in einem bestimmten Durchlauf
            for (int i = 0; i < (j-1); i++)
            {
                // Ist der linke Wert größer als der rechte Wert?
                if (numbers[i] > numbers[i+1]) {
                    // Austauschen
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }


}
