package Remove_Duplicates_from_Sorted_Array;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { 
                i++; 
                nums[i] = nums[j]; // place unique element at next position
            }
        }
        return i + 1; // length of unique elements
    }
}
