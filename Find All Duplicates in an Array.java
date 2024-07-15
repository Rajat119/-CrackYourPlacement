class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]>1) ls.add(nums[i]);
        }
        return ls;
    }
}