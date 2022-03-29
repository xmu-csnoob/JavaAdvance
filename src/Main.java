import algorithm.SortMethods;
import tool.Tool;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        /*HashMap<Integer,Long> res=new LinkedHashMap<>();
        for(int i=1;i<=1000;i++)
        {
            System.out.println(("数据量为" + i + ":"));
            int[] rand= Tool.genBestSeries(i);
            long ns=SortMethods.insertSort(rand);
            res.put(i,ns);
            System.out.println(Arrays.toString(rand));
        }
        Tool.writeResults(res,"insertSortBest");*/
        int[] a={1,3,4};
        int[] b={2,5,6};
        int[] arr=Tool.genWorstSeries(20);
        System.out.println(Arrays.toString(SortMethods.mergeSort(arr)));
    }
}
