
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array){
        for(int[] rows : array){
            for(int columns : rows){
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array){
        int sum = 0;
        for(int[] rows : array){
            for(int columns : rows){
                sum += columns;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] array){
        double numOfValues = 0;
        for(int[] rows : array){
            numOfValues += rows.length;
        }
        return sum(array) / numOfValues;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] array){
        int minimum = array[0][0];
        for (int[] rows : array){
            for (int columns : rows){
                if (columns < minimum){
                    minimum = columns;
                }
            }
        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array){
        int maximum = array[0][0];
        for (int[] rows : array){
            for (int columns : rows){
                if (columns > maximum){
                    maximum = columns;
                }
            }
        }
        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array){
        int evens = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] % 2 == 0){
                    evens++;
                }
            }
        }
        return evens;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array){
        int evens = 0;
        for (int[] rows : array){
            for (int columns : rows){
                if (columns % 2 == 0){
                    evens++;
                }
            }
        }
        return evens;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers is positive.
    public static boolean allPositive(int[][] array){
        int count = 0;
        for (int[] rows : array){
            for (int columns : rows){
                if (columns > 0){
                    count++;
                }
            }
        }
        int valuesNum = 0;
        for (int[] rows : array){
            valuesNum += rows.length;
        }
        if (count == valuesNum){
            return true;
        }
        return false;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array){
        int[] sumArr = new int[array.length];
        for(int i = 0; i < array.length; i++){
            int sum = 0;
            for (int column : array[i]){
                sum += column;
            }
            sumArr[i] = sum;
        }
        return sumArr;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] array){
        int[] sumArr = new int[array[0].length];
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sumArr[j] += array[i][j];
            }
        }
        return sumArr;
    }
}
