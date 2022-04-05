package code._4_student_effort;

public class Challenge3 {
    public static Integer[] removeTheElement(Integer[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        Integer[] anotherArray = new Integer[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
    static int firstNumber;
    static int secondNumber;

    public static void Sumof2(Integer[] numbers){
        int Pairs = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 0) {
                    numbers = removeTheElement(numbers,i);
                    numbers = removeTheElement(numbers,j-1);
                    Pairs++;
                    i--;
                    break;
                }
            }
        }
        System.out.println(Pairs);
    }
}
