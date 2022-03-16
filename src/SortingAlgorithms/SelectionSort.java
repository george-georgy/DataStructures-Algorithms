package SortingAlgorithms;

public class SelectionSort {


    public static int [] sortAsc(int[] list) {
        int temp = 0; //a variable to store temporary value while swapping

        for (int i = 0; i < list.length-1; i++) //for loop to hold the current element to be compared
        {
            for (int j = i + 1; j < list.length; j++) //for loop to iterate over the other elements
            { //to get them compared with the current element
                if (list[i] > list[j]) //if any of the higher index element is smaller than
                { //the current element
                    temp = list[i]; //store the current element to temp
                    list[i] = list[j]; //store the smaller element to the lower index position
                    list[j] = temp; //store the current element to greater index position
                }
            }
        }
        return list;
    }

    // Prints the array
    static void printArray(int list[])
    {
        int n = list.length;
        for (int i=0; i<n; ++i)
            System.out.print(list[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        int list[] = {64,25,12,22,11};
        SelectionSort.sortAsc(list);
        System.out.println("Sorted array");
        SelectionSort.printArray(list);
    }
}
