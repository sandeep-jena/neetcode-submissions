class Solution {
    public int search(int[] nums, int target) {
        int low=0, high=nums.length-1, res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid]==target){
                return mid;
            }  
            if(nums[low]<=nums[mid]){//if left is sorted
                if(target>=nums[low] && target<nums[mid])//whether target is in left-range
                    high=mid-1;
                else
                    low=mid+1;
            }
            else{//if right is sorted
                if(target>nums[mid] && target<=nums[high])//whether target is in rigth-range
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
