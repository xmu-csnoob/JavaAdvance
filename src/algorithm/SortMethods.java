package algorithm;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

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
    public static int[] mergeSort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        int[] l=new int[mid];
        int[] r=new int[arr.length-mid];
        for(int i=0;i<mid;i++)
            l[i]=arr[i];
        System.out.println("l = " + Arrays.toString(l));
        for(int i=mid;i<arr.length;i++)
            r[i-mid]=arr[i];
        System.out.println("r = " + Arrays.toString(r));
        l=mergeSort(l);
        r=mergeSort(r);
        return merge(l,r);
    }
    public static int[] merge(int[] l, int[] r){
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
            System.out.println("left = " + left);
            System.out.println("right = " + right);
            System.out.println("index = " + index);
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
            System.out.println("leftStack.isEmpty() = " + leftStack.isEmpty());
            System.out.println("rightStack.isEmpty() = " + rightStack.isEmpty());
        }
        return res;
    }
}
