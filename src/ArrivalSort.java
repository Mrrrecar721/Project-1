import java.util.ArrayList;

public class ArrivalSort {
    //partition = pivot position
    static int partition(ArrayList<Task> arr, int start, int end)
    {
        int i = start - 1;
        for(int j = start; j<=end; j++)
        {
            if(arr.get(j).getArrivalTime() <= arr.get(end).getArrivalTime())
            {
                i++;
                Task temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        return i;
    }
    //Entry method calls partition() to return i which represents pivot position
    //quicksort recursively calls itself
    public static void quickSort(ArrayList<Task> arr, int start, int end)
    {
        if(start < end)
        {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static void printArray(ArrayList<Integer> arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
