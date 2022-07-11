package gl.assignment.denominations;

import java.util.Arrays;
import java.util.Scanner;

public class DenominationsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of denominations used");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the denomination values");
        for(int i=0;i<num;i++) {
            arr[i]=sc.nextInt();
        }
        MergeSortImplementation merge= new MergeSortImplementation();
        merge.sort(arr, 0, num-1);
        System.out.println("The denominations in decreasing order"+ Arrays.toString(arr));

        System.out.println("enter the amount to pay");
        int payment=sc.nextInt();

        NotesCount count = new NotesCount();
        count.countDenominations(arr, payment);
        sc.close();
    }
}

/*
OUTPUT:

Enter the number of denominations used
3
Enter the denomination values
5
1
10
The denominations in decreasing order[10, 5, 1]
enter the amount to pay
12
Denomination 10 count:1
Denomination 1 count:2

 */


