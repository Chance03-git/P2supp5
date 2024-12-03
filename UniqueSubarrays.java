import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;

public class UniqueSubarrays {
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
    private static String arrayToString(int[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(arr[i]).append(",");
        }
        return sb.toString();
    }
    public void testCountUniqueSubarrays() {
        // Test case 1: General case with multiple unique subarrays
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int target1 = 5;
        int result1 = UniqueSubarrays.countUniqueSubarrays(arr1, target1);
        assertEquals(2, result1);  // Expected: 2 unique subarrays

        // Test case 2: Single element array where sum is equal to the target
        int[] arr2 = {5};
        int target2 = 5;
        int result2 = UniqueSubarrays.countUniqueSubarrays(arr2, target2);
        assertEquals(1, result2);  // Expected: 1 unique subarray (the array itself)
    }
}
