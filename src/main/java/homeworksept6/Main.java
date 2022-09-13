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

        return fruits[fruits.length - 1];
    }


    //Question 5
    public static String getSecondToLastElement(String[] fruits) {

        return fruits[fruits.length - 2];
    }


    //Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int x = 0; x < ints.length; x++) {
            sum = sum + ints[x];
        }
        return sum;
    }


    //Question 7 FIX LATER
    public static int getAverage(int[] ints) {
        int avg = 0;
        int sum = 0;
        for (int x = 0; x < ints.length; x++) {
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
        for (int i = 0; i < names.length; i++) {
            if (element == names[i]) {
                return true;
            }
        }
        return false;
    }

    //Question 11
    public static int getIndexByElement(String[] fruits, String element) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == element) {
                return i;
            }
        }
        return -1;
    }


    // Question 12
    public static void printOddNumbersInRange(int start, int end) {
        //once it recieves start and end points, print odd numbers from this range
        System.out.println("#12: ");
        for (int x = start; x <= end; x++) {
            if (x % 2 != 0) {
                System.out.println(x + ", ");
            }
        }
    }


    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        //given string str, given n
        // print string str n times
        System.out.println("#13: ");
        int x;
        for (x = 0; x < n; x++) {
            System.out.println(str);
        }
        return "Please try again";
    }


    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        // get a number, which is int n
        // get a string, which is str
        // convert str to char
        // loop through the diff letters of the string
        // while x<=3, print x
        String firstThree = "";
        for (int x = 0; x < n; x++){
            char letters = str.charAt(x);
            firstThree = firstThree + letters;
        }
        return firstThree;
    }

//Question 15
public static int countWordsInString(String str){
    for (int x = 0; x < str.length() ; x++){
        char spaceFinder =str.charAt(x);
        if (spaceFinder == ' '){

            return x;
        }
    }
    return 1;
}


    //Question 16
    public static int vowelsCounter(String str){
        int counter = 0;
        for (int x = 0; x < str.length() ; x++){
            char letter =str.charAt(x);
            // char letters = sentence.charAt(x);
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U' ){
                counter++;
            }
        }
        return counter;
    }


    //Question 17
public static String[] swap(String[] fruits){
            System.out.println("#17: ");
            String [] swappedArray=fruits;
            String first = swappedArray[swappedArray.length - 1];
            String last = swappedArray[0];
            swappedArray[0] = first;
            swappedArray[swappedArray.length - 1] = last;
            for (int i=0; i<swappedArray.length; i++){
                System.out.print( swappedArray[i] +", ");
            }

            return fruits;
        }

    public static void main(String[] args) {
        String []fruits = {"Apple", "Orange", "Banana", "Grapes", "Pineapple", "Mango", "Watermelon"};
        int []ints = {1,2,3,4,5,6};
        int []numbers = {11, 14, 23, 29, 55, 66, 100,};
        String str = "Hello my name is Tayyaba";
            System.out.println("#1: " + getLastIndex(fruits));
            System.out.println("#2: " + getSecondToLastIndex(fruits));
            System.out.println("#3: " + getFirstElement(fruits));
            System.out.println("#4: " + getLastElement(fruits));
            System.out.println("#5: " + getSecondToLastElement(fruits));
            System.out.println("#6: " + getSum(ints));
            System.out.println("#7: " + getAverage(ints));
            System.out.println("#8: " + extractAllOddNumbers(numbers));
            System.out.println("#9: " + extractAllEvenNumbers(numbers));
            System.out.println("#10: " + contains(fruits, "Apple"));
            System.out.println("#11: " + getIndexByElement(fruits, "Orange"));
            printOddNumbersInRange(3,9);
            printGivenStringTimesNumberGiven("hey", 5);
            System.out.println("#14: " + repeatFirstThreeLetters(str, 3));
            System.out.println("#15: " + countWordsInString(str));
            System.out.println("#16: " + vowelsCounter(str));
            swap(fruits);
    }
}
