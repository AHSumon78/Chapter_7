import java.util.*;
public class SumWithoutSmallest {
    public static void main(String[] args) {

        int[] array =new int[10];
        System.out.println("Enter 10 number :");
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            array[i]=in.nextInt();


        }
        Sum s=new Sum(array);

        System.out.println("Sum of the array without smallest element is:\n"+s.getSum()+"\nDeference between sum and smallest element is :\n"+s.getDiference());


    }
}
