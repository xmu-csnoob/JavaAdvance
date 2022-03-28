package algorithm;

public class SortMethods {
    public static long insertSort(int[] arr){
        //游标从1开始
        long t1=System.nanoTime();
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int key=arr[i];
                if(key<arr[j]){
                    arr[i]=arr[j];
                    arr[j]= key;
                }
            }
        }
        long t2=System.nanoTime();
        System.out.println("Cost:"+(t2 - t1));
        return t2-t1;
    }
}
