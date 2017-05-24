public class Solution {

    public void rotate(int[] nums,int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums, int sdt,int end){
        while(sdt<end){
            int temp=nums[sdt];
            nums[sdt]=nums[end];
            nums[end]=temp;
            sdt++;
            end--;
        }

    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8,9,0};

        Solution sl= new Solution();
        sl.rotate(nums,7);
        System.out.println(Arrays.toString(nums));
    }
}
