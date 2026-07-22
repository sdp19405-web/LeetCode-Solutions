class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int end=nums.length-1;
      while(mid<=end){
        if(nums[mid]==0){
            // swap(nums,low,mid);
          int temp=nums[low];
          nums[low]=nums[mid];
          nums[mid]=temp;
          low++;
          mid++;
        }else if(nums[mid]==1){
           mid++;
        }else{
            // swap(nums,mid,end);
            int temp=nums[end];
             nums[end]=nums[mid];
             nums[mid]=temp;
             end--;
        }
      }
      }

    }
