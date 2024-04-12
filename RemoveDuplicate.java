import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4};
        System.out.println(removeDuplicates(arr));
    }

    public static  int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int rd = 0;
        for(int i = 0; i <= nums.length-1 ; i++){
            if(nums[rd] != nums[i]){
                rd++;
                temp[rd] = nums[i];
            }

        }
         return rd+1;
    }
}
