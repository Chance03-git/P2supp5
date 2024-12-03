import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;

public class subArr {
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
