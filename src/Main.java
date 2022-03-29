import algorithm.SortMethods;
import tool.Tool;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr=Tool.genWorstSeries(100);
        System.out.println(Arrays.toString(SortMethods.selectSort(arr)));
    }
}
