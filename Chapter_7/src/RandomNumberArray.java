
public class RandomNumberArray {
    public static void main(String[] args) {
        final int LENGTH=10;
        int[] array = new  int[LENGTH];
        for(int i=0;i<LENGTH;i++)
        {
            array[i]=(int)(10*Math.random());
        }
        for(int i=1;i<LENGTH;i=i+2)
        {
            System.out.print(array[i]+" ");


        }
        System.out.println();
        for (int i=0;i<LENGTH;i++)
        {
            if(array[i]%2==0)
            {
                System.out.print(array[i]+" ");
            }


        }
        System.out.println();
        for (int i=LENGTH-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");



        }
        System.out.println();
        System.out.println(array[0] +" "+array[(array.length-1)]);




    }
}
