import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // int arr[] = new int[5] ;

        // Scanner scan = new Scanner(System.in);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print("Enter arrays value for "+ (i+1) + " : ");
        //     arr[i] = scan.nextInt();
        // }
        int arr[] = {23,54,34,56,14,98,34};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int Larg = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>Larg)
            {
                Larg = arr[i];
            }
        }
        int Small = 9999999;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<Small)
            {
                Small = arr[i];
            }
        }
        System.out.println();
        System.out.println("Largest number is : "+Larg);
        System.out.println("Largest number is : "+Small);
   
    }
}
