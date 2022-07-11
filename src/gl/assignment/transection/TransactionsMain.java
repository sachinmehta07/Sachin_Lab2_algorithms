package gl.assignment.transection;

import java.util.Scanner;

public class TransactionsMain {
    public static void main(String[] args) {

        Transactions transaction= new Transactions();
        int[] transactionArr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of transaction array");
        int size = sc.nextInt();
        transactionArr = new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("Enter the transaction value "+(i+1));
            transactionArr[i]=sc.nextInt();
        }

        System.out.println("Enter the number of targets to be achieved");
        int noOfTargets = sc.nextInt();
        for(int j=0;j<noOfTargets;j++) {
            System.out.println("Enter the target values");
            int target=sc.nextInt();
            int transactionNumber=transaction.istargetAcheived(transactionArr, target);
            if(transactionNumber==-1) {
                System.out.println("Target not achieved");
            }
            else {
                System.out.println("Target achieved at "+transactionNumber+" transaction");
            }
        }
        sc.close();
    }
}

/*
OUTPUT:

Enter the size of transaction array
3
Enter the transaction value 1
20
Enter the transaction value 2
12
Enter the transaction value 3
31
Enter the number of targets to be achieved
2
Enter the target values
21
Target achieved at 2 transaction
Enter the target values
19
Target achieved at 1 transaction

Process finished with exit code 0

 */