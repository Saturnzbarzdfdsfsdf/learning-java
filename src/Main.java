public class Main {

    // arrays
    public static void main(String[] args) {

        // Заменить 0 -> 1
        int[] arr = {1, 0, 1, 0, 1};
        System.out.println("Изначальный массив:");
        printArray(arr);
        reverse(arr);

        System.out.println("Измененный массив:");
        // Метод для вывода массива
        printArray(arr);

        // Минимальные и максимальные значения массива
        int[] minMax = {1, 2, 3, 4, 5, 6, 7, 8, 77, 10};
        MinMax(minMax);

        // Массив размером 8.
        int[] eight = new int[8];
        multiply(eight);

        // Числа меньшие 6, умножить на 2;
        int[] arrSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Изначальный массив:");
        printArray(arrSix);
        multiplySix(arrSix);
    }

    // Массив размером 8. Заполнить его  0 3 6 9 12 15 18 21;
    static void multiply(int[] args) {
        printArray(args);

        for (int i = 0; i < args.length; i++) {
            args[i] = i * 3;
        }

        printArray(args);
    }

    // Замена 0 на 1
    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        System.out.println("Измененный массив:");
        printArray(arr);
    }

    // Числа меньшие 6, умножить на 2;
    static void multiplySix(int[] arrSix) {

        for (int i = 0; i < arrSix.length; i++) {
            if (arrSix[i] < 6) {
                arrSix[i] = arrSix[i] * 2;
            }
        }
        System.out.println("Измененный массив:");
        printArray(arrSix);

    }

    // Минимальный и максиальный елемент
    static void MinMax(int[] minMax) {

        int min = minMax[0];
        int max = minMax[0];

        printArray(minMax);

        for (int i = 0; i < minMax.length; i++) {
            if (minMax[i] > max) {
                max = minMax[i];
            } else if (minMax[i] < min) {
                min = minMax[i];
            }
        }

        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }

    // Метод для вывода массива
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переход на новую строку после вывода массива
    }
}