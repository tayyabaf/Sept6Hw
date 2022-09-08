package homeworksept6;

public class Main {
    //Question 1
    public static int getLastIndex(String[] fruits) {
        return fruits.length - 1;
    }


    //Question 2
    public static int getSecondToLastIndex(String[] fruits) {
        return fruits.length - 2;
    }


    //Question 3
    public static String getFirstElement(String[] fruits) {
        return fruits[0];
    }


    //Question 4
    public static String getLastElement(String[] fruits) {

        return fruits[fruits.length-1];
    }


    //Question 5
    public static String getSecondToLastElement(String[] fruits) {

        return fruits[fruits.length-2];
    }


    //Question 6
    public static int getSum(int[] ints) {
        int sum=0;
        for (int x=0; x < ints.length; x++){
            sum = sum + ints[x];
        }
        return sum;
    }


    //Question 7 FIX LATER
    public static int getAverage(int[] ints) {
        int avg=0;
        int sum=0;
        for (int x=0; x < ints.length; x++){
            sum = sum + ints[x];
            avg = sum / ints.length;
        }
        return avg;
    }


    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        int number = 0;
        int position = 0;
        String oddNumbers = " ";
        while (position < numbers.length) {
            number = numbers[position];
            position++;
            if (number % 2 != 0) {
                oddNumbers = oddNumbers + number + ", ";
            }
        }
        return oddNumbers;
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        int number = 0;
        int position = 0;
        String evenNumbers = " ";
        while (position < numbers.length) {
            number = numbers[position];
            position++;
            if (number % 2 == 0) {
                evenNumbers = evenNumbers + number + ", ";
            }
        }
        return evenNumbers;
    }


    //Question 10
    public static boolean contains(String[] names, String element) {
        for (String inputName : names) {
            if (element == inputName) {
                return true;
            }
        } return false;
    }

    //Question 11
    public static int getIndexByElement(String[] fruits, String element) {
        int num = fruits.length;
        int i = 0;
        while (i < num) {
            if (fruits[i] == element) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -111;
    }


    /* Question 12 NOT DONE!!
    public static void printOddNumbersInRange(int start, int end){
        int number = 0;
        int position = 0;
        String oddNums = " ";
        for (start%2 == 0){
            if (end%2 == 0){
                number = (end-start)/+2 ;
                start++;
                return number;
            }
        }
    }
  */

    public static void main(String[] args) {
        String []fruits = {"Apple", "Orange", "Banana", "Grapes", "Pineapple", "Mango", "Watermelon"};
        int []ints = {1,2,3,4,5,6};
        int []numbers = {11, 14, 23, 29, 55, 66, 100,};
            System.out.println("Answer to #1: " + getLastIndex(fruits));
            System.out.println("Answer to #2: " + getSecondToLastIndex(fruits));
            System.out.println("Answer to #3: " + getFirstElement(fruits));
            System.out.println("Answer to #4: " + getLastElement(fruits));
            System.out.println("Answer to #5: " + getSecondToLastElement(fruits));
            System.out.println("Answer to #6: " + getSum(ints));
            System.out.println("Answer to #7: " + getAverage(ints));
            System.out.println("Answer to #8: " + extractAllOddNumbers(numbers));
            System.out.println("Answer to #9: " + extractAllEvenNumbers(numbers));
            System.out.println("Answer to #10: " + contains(fruits, "Apple"));
            System.out.println("Answer to #11: " + getIndexByElement(fruits, "Orange"));
    }
}
