
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array) {
        for (int[] row : array) {
            for (int element : row){
                System.out.print(element + "");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] row : array){
            for (int element : row ){
                sum += element;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] array) {
        int sum = sum(array);
        int totalElements = array.length*array[0].length;
        double average = (double) sum/totalElements;
        return average;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    public static int minimum(int[][] array) {
        int min = Integer.MAX_VALUE;

        for (int[] row : array) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }

        return min;
    }



    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array){
            for (int num : row){
                if (num > max) max = num;
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    public static int evenCountStandard(int[][] array) {
        int evenCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
        }

        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced(int[][] arr) {
        int count = 0;

        for (int[] row : arr) {
            for (int num : row) {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

        public static boolean allPositive(int[][] arr) {
            for (int[] row : arr) {
                for (int num : row) {
                    if (num <= 0) {
                        return false;
                    }
                }
            }

            return true;
        }


    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;
        int[] sums = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            int rowSum = 0;
            for (int j = 0; j < numCols; j++) {
                rowSum += arr[i][j];
            }
            sums[i] = rowSum;
        }

        return sums;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;
        int[] sums = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                sums[j] += arr[i][j];
            }
        }

        return sums;
    }

}
