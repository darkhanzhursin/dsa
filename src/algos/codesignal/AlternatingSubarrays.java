package algos.codesignal;

public class AlternatingSubarrays {
    public long countAlternatingSubarrays(int[] nums) {
        var res = (long)nums.length;
        for (int i=0,cur=0;i<nums.length-1;i++){
            if (nums[i]!=nums[i+1]) cur++; else cur=0;
            res+=cur;
        }
        return res;
    }

    public static void main(String[] args) {
        AlternatingSubarrays solution = new AlternatingSubarrays();

//        int[] nums1 = {0, 1, 1, 1};
//        System.out.println(solution.countAlternatingSubarrays(nums1)); // Output: 5

        int[] nums2 = {1, 0, 1, 0};
        System.out.println(solution.countAlternatingSubarrays(nums2)); // Output: 10
    }
}
