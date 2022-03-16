package SearchAlgorithms;

public class Search {

// The complexity of linear search is O(n).
// Returns index of target if it is present in list.
// else return -1

    public static int linearSearch(int[] list , int target){


        for(var i = 0 ; i < list.length ; i++){
            if(list[i] == target)
                return i;
        }
        return -1;

    }

// The complexity of binary search is O(log(n))
// Returns index of target if it is present in list.
// else return -1

    public static int binarySearch(int [] list , int target){

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {

            int mid = (high + low) / 2;
            int guess = list[mid];

            if (guess == target) {
                return mid;
            }

            if (guess < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;

    }

    // Main  method
    public static void main(String args[])
    {
        int list[] = { 77, 66, 44, 11, 99 };

        int result = Search.binarySearch(list, 44);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }


}
