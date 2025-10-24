import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] nums1={1,3,5};
        int[] nums2={2,4,6,7};

        // Merge the arrays
        int[] merged = mergeArrays(nums1, nums2);

        // Print merged array
        System.out.println("Merged sorted array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    // Function to merge two sorted arrays
    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Merge while both have elements
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Add remaining elements
        while (i < n1) {
            merged[k++] = nums1[i++];
        }

        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }
}
