public class Sum {
    int small;
    int sum=0;
    public Sum(int[] array) {
        int l=array.length;
        small=array[0];
        for(int i=0;i<l;i++)
        {
            sum=sum+array[i];
            if(array[i]<small)
            {
                small=array[i];
            }
        }
    }
    public int getSum()
    {
     return  sum=sum-small;
    }
    public int getDiference()
    {
        return sum-small;
    }

}
