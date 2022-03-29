package algorithm;

import java.util.Arrays;
import java.util.Stack;

public class SortMethods {
    //插入排序
    //时间复杂度O(n²)
    public static int[] insertSort(int[] arr){
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
        return arr;
    }
    //冒泡排序
    //时间复杂度O(n²)
    public static int[] bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    //选择排序
    //时间复杂度O(n²)
    public static int[] selectSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int min=Integer.MAX_VALUE;
            int minIndex=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
            i++;
        }
        return arr;
    }
    //归并排序
    //时间复杂度O(nlogn)
    public static int[] mergeSort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        int[] l=new int[mid];
        int[] r=new int[arr.length-mid];
        System.arraycopy(arr, 0, l, 0, mid);
        if (arr.length - mid >= 0) System.arraycopy(arr, mid, r, 0, arr.length - mid);
        l=mergeSort(l);
        r=mergeSort(r);
        return merge(l,r);
    }
    private static int[] merge(int[] l, int[] r){
        int len=l.length+r.length;
        int[] res=new int[len];
        Stack<Integer> leftStack=new Stack<Integer>();
        Stack<Integer> rightStack=new Stack<Integer>();
        for(int i=l.length-1;i>=0;i--){
            leftStack.push(l[i]);
        }
        for(int i=r.length-1;i>=0;i--){
            rightStack.push(r[i]);
        }
        int index=0;
        while(!leftStack.isEmpty()||!rightStack.isEmpty()){
            int left,right;
            if(!leftStack.isEmpty()){
                left=leftStack.pop();
            }else{
                left=Integer.MAX_VALUE;
            }
            if(!rightStack.isEmpty()){
                right=rightStack.pop();
            }else{
                right=Integer.MAX_VALUE;
            }
            if(left<right){
                res[index]=left;
                if(right!=Integer.MAX_VALUE)
                    rightStack.push(right);
            }else if(left>right){
                res[index]=right;
                if(left!=Integer.MAX_VALUE)
                    leftStack.push(left);
            }
            index++;
        }
        return res;
    }
}
