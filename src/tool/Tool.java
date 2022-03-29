package tool;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Tool {
    public static int[] genRandomSeries(int len){
        int[] res=new int[len];
        for(int i=0;i<len;i++)
        {
            Random random=new Random();
            res[i]=random.nextInt(len);
        }
        return res;
    }
    public static int[] genWorstSeries(int len){
        int[] res=new int[len];
        for(int i=0;i<len;i++)
        {
            res[i]=len-i;
        }
        return res;
    }
    public static int[] genBestSeries(int len){
        int[] res=new int[len];
        for(int i=0;i<len;i++)
        {
            res[i]=i+1;
        }
        return res;
    }
}
