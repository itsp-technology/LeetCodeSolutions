import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3,3};
        int[] result = s.twoSum(arr, 6);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class  Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copyArray = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copyArray);

        int head = 0;
        int tail = copyArray.length-1;
        int num1 =0;
        int num2 = 0;
        while(head < tail){
            int sum = copyArray[head]+copyArray[tail];
            if(sum < target){
                head++;
            }else if( sum > target){
                tail--;
            }else{
                num1 = copyArray[head];
                num2 = copyArray[tail];
                break;
            }
        }

        int[] res = new int[2];
        int found =0;
        for(int i = 0 ; i< nums.length && found<2;i++){
            if(nums[i]==num1 || nums[i]==num2){
                res[found]=i;
                found++;
            }
           }
        return res;
    }
}

