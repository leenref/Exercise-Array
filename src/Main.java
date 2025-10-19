import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int i;
        int size=0;



      /*  1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to
        2
        Test Data:
        array = 50, -20, 0, 30, 40, 60, 10
        Sample Output: false

       */

        System.out.printf("Enter the size of the array: ");
         size=scan.nextInt();

        if (size < 2) {
            System.out.println("Array size must be greater than or equal to 2");
            return;
        }

        int[] numbers = new int[size];
        System.out.println("enter numbers for the array: ");
        for (i = 0; i < numbers.length; i++) {
            if (scan.hasNextInt()) {
                numbers[i] = scan.nextInt();
            }
        }
            if (numbers[0] == numbers[numbers.length - 1]) {
                System.out.println("First and last elements are the same ");
            }else{
                System.out.println("First and last elements are not the same ");
            }


        /*
        2.Write a Java program to find the numbers greater than the average of the
        numbers of a given array.
                Original Array:
         [1, 4, 17, 7, 25, 3, 100]
        Expected Output:
        The average of the said array is: 22.0 The numbers in the said array that are
        greater than the average are: 25 100
         */


        System.out.printf("Enter the size of the array: ");
         size=scan.nextInt();

        if (size < 2) {
            System.out.println("Array size must be greater than or equal to 2");
            return;
        }

        int[] number = new int[size];
        System.out.println("enter numbers for the array: ");
        for (i = 0; i < number.length; i++) {
            if (scan.hasNextInt()) {
                number[i] = scan.nextInt();
            }
        }

                double avg = 0;
                int sum = 0;
                for (i = 0; i < number.length; i++) {
                    sum += number[i];
                }
                avg = sum / number.length;

                System.out.printf("The average of the said array is: " + avg);

        System.out.println(" The numbers in the said array that are greater than the average are: ");
        for (int n : number) {
            if (n > avg) {
                System.out.println(n + " ");
            }}






        /*
        3.Write a Java program to get the larger value between first and last
        element of an array of integers.
        Original Array:
         [20, 30, 40]
        Sample Output:
        Larger value between first and last element: 40

         */

        System.out.printf("Enter the size of the array: ");
         size=scan.nextInt();

        if (size < 2) {
            System.out.println("Array size must be greater than or equal to 2");
            return;
        }

        int[] firstNLastNum = new int[size];
        System.out.println("enter numbers for the array: ");
        for (i = 0; i < firstNLastNum.length; i++) {
            if (scan.hasNextInt()) {
                firstNLastNum[i] = scan.nextInt();
            }
        }

        if(firstNLastNum[0] > firstNLastNum[firstNLastNum.length-1]){
            System.out.println("Larger value between first and last element: "+ firstNLastNum[0] );

        }else {
            System.out.println("Larger value between first and last element: "+ firstNLastNum[firstNLastNum.length-1] );
        }





        /*
        4.Write a Java program to swap the first and last elements of an array and
        create a new array.
                Original Array:
        [20, 30, 40]
        Sample Output:
        New array after swapping the first and last elements: [40, 30, 20]

         */
    ArrayList<Integer> swapNumbers = new ArrayList<>();

        System.out.printf("Enter the size of the array: ");
         size = scan.nextInt();

        System.out.println("Enter the elements of the array: ");
        for ( i = 0; i < size; i++) {
            if (scan.hasNextInt()) {
                swapNumbers.add(scan.nextInt());
            }
        }

        ArrayList<Integer> swappedNumbers = new ArrayList<Integer>(swapNumbers);

        int first = swappedNumbers.get(0);
        int last = swappedNumbers.get(swappedNumbers.size() - 1);
        swappedNumbers.set(0, last);
        swappedNumbers.set(swappedNumbers.size() - 1, first);

        System.out.println("New array after swapping the first and last elements: "+ swappedNumbers);





        /*

        5. Write a program that places the odd elements of an array before the
        even elements.
        Original Array:
[2,3,40,1,5,9,4,10,7]
        Sample Output:
[3,1,5,9,7,2,40,4,10]*/

        ArrayList<Integer> evenOddnumbers = new ArrayList<>();

        System.out.printf("Enter the size of the array: ");
         size = scan.nextInt();

        System.out.println("Enter the elements of the array: ");
        for ( i = 0; i < size; i++) {
            if (scan.hasNextInt()) {
                evenOddnumbers.add(scan.nextInt());
            }
        }


        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();


        for (int num : evenOddnumbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            } else {
                evenNumbers.add(num);
            }
        }
        oddNumbers.addAll(evenNumbers);

        System.out.println(oddNumbers);






       /* 6. Write a program that test the equality of two arrays.
[2,3,6,6,4] [2,3,6,6,4]
        Sample Output: true
                */
        System.out.print("Enter the size of the first array: ");
        int size1 = scan.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter elements for the first array: ");
        for ( i = 0; i < size1; i++) {
            array1[i] = scan.nextInt();
        }


        System.out.print("Enter the size of the second array: ");
        int size2 = scan.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter elements for the second array: ");
        for ( i = 0; i < size2; i++) {
            array2[i] = scan.nextInt();
        }

        System.out.println(Arrays.equals(array1, array2));


    }
        }
