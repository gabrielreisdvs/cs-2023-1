import java.util.Stack;

public class QuickSortIterativo {

    public static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int a[], int start, int end)
    {
        int pivot = a[end];


        int pIndex = start;


        for (int i = start; i < end; i++)
        {
            if (a[i] <= pivot)
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }

        swap (a, pIndex, end);

        return pIndex;
    }

    public static void iterativeQuicksort(int[] a)
    {
        Stack<Pair> stack = new Stack<>();

        int start = 0;
        int end = a.length - 1;

        stack.push(new Pair(start, end));

        while (!stack.empty())
        {

            start = stack.peek().getX();
            end = stack.peek().getY();
            stack.pop();

            int pivot = partition(a, start, end);


            if (pivot - 1 > start) {
                stack.push(new Pair(start, pivot - 1));
            }

            if (pivot + 1 < end) {
                stack.push(new Pair(pivot + 1, end));
            }
        }
    }
}
