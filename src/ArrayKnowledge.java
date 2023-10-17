public class ArrayKnowledge {
    public static void main(String[] args) {
        String str = "whoopity";
        char[] arr = stringToArray(str);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();
        int start = 5;
        int end = 10;
        int step = 2;

        int[] intArray = generateArrayWithBounds(start, end, step);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

    }

    public static char[] stringToArray(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int[] intArray;

        if (step == 1 || (end - start) == 0) {
            intArray = new int[((end - start) / step)];
        } else {
            intArray = new int[((end - start) / step) + 1];
        }

        int i = 0;
        while (i < intArray.length) {
            intArray[i] = start + (step * i);
            i++;
        }
        return intArray;
    }
}
