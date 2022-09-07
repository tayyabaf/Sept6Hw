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
        String[] myNumbers = new String[numbers.length];
        int x;
        for (x = 0; x < numbers.length ; x++) {
            if(numbers[x]%2!=0){
                System.out.println(numbers[x] + " ");
            }
        }
        myNumbers[x] = Integer.toString(numbers[x]);
        return myNumbers[x];
    }


    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String[] myNumberz = new String[numbers.length];
        int i;
        for (i = 0; i < numbers.length ; i++) {
            if(numbers[i]%2==0){
                System.out.println(numbers[i] + " ");
            }
        }
        myNumberz[i] = Integer.toString(numbers[i]);
        return myNumberz[i];
    }


    //Question 10
    /*public static boolean contains(String[] names, String element) {

        return names[].contains("wow");
    } */

    public static void main(String[] args) {
        String []fruits = {"Apple", "Orange", "Banana", "Grapes", "Pineapple", "Mango", "Watermelon"};
        int []ints = {1,2,3,4,5,6};
        int []numbers = {11, 14, 23, 29, 55, 66, 100,};
        String []names = {"Bob", "Sue", "Jack", "May"};
            System.out.println("Answer to #1: " + getLastIndex(fruits));
            System.out.println("Answer to #2: " + getSecondToLastIndex(fruits));
            System.out.println("Answer to #3: " + getFirstElement(fruits));
            System.out.println("Answer to #4: " + getLastElement(fruits));
            System.out.println("Answer to #5: " + getSecondToLastElement(fruits));
            System.out.println("Answer to #6: " + getSum(ints));
            System.out.println("Answer to #7: " + getAverage(ints));
            System.out.println("Answer to #8: " + extractAllOddNumbers(numbers));
            System.out.println("Answer to #9: " + extractAllEvenNumbers(numbers));
            //System.out.println("Answer to #10: " + getAverage(ints));
    }
}
