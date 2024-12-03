import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueSubarrays {

    /**
     * Counts the number of unique subarrays that sum to the given target.
     * 
     * @param arr The input array of integers.
     * @param target The target sum we want to find in subarrays.
     * @return The count of unique subarrays that sum to the target.
     */
    public static int countUniqueSubarrays(int[] arr, int target) {
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        Set<String> uniqueSubarrays = new HashSet<>();
        
        // To store the sum of elements from the start to the current index.
        int currentSum = 0;
        
        // Initialize prefix sum map with 0 to handle cases where the subarray starts at index 0.
        prefixSums.put(0, -1);
        
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            
            // Check if there is a prefix sum that satisfies the condition
            if (prefixSums.containsKey(currentSum - target)) {
                int startIdx = prefixSums.get(currentSum - target) + 1;
                String subarray = arrayToString(arr, startIdx, i);
                uniqueSubarrays.add(subarray);
            }
            
            // Store the current sum in the map
            prefixSums.put(currentSum, i);
        }
        
        // Return the number of unique subarrays
        return uniqueSubarrays.size();
    }

    /**
     * Converts a subarray into a comma-separated string representation.
     * 
     * @param arr The input array.
     * @param start The start index of the subarray.
     * @param end The end index of the subarray.
     * @return The string representation of the subarray.
     */
    private static String arrayToString(int[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(arr[i]).append(",");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;

        System.out.println("Number of unique subarrays that sum to " + target + ": " + countUniqueSubarrays(arr, target));
    }
}

