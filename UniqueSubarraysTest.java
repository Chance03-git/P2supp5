import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueSubarraysTest {

    @Test
    public void testCountUniqueSubarrays() {
        // Test case 1: General case with multiple unique subarrays
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int target1 = 5;
        int result1 = UniqueSubarrays.countUniqueSubarrays(arr1, target1);
        assertEquals(2, result1);  // Expected: 2 unique subarrays: [2, 3] and [5]

        // Test case 2: Single element array where sum equals target
        int[] arr2 = {5};
        int target2 = 5;
        int result2 = UniqueSubarrays.countUniqueSubarrays(arr2, target2);
        assertEquals(1, result2);  // Expected: 1 unique subarray: [5]

        // Test case 3: No subarrays sum to target
        int[] arr3 = {1, 1, 1};
        int target3 = 5;
        int result3 = UniqueSubarrays.countUniqueSubarrays(arr3, target3);
        assertEquals(0, result3);  // Expected: 0 subarrays

        // Test case 4: Negative numbers in array
        int[] arr4 = {-1, 2, 3, -2, 1};
        int target4 = 3;
        int result4 = UniqueSubarrays.countUniqueSubarrays(arr4, target4);
        assertEquals(2, result4);  // Expected: 2 unique subarrays: [2, 3], [3]
    }
}

