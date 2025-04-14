class JumpGame {
    public int jump(int[] nums) {
        int farthest=0;
        int jump=0;
                int end=0;
        if(nums.length==1) return jump;
        for(int i=0;i<nums.length;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(farthest>=nums.length-1){
                jump++;
                break;
            }
            if(i==end){
                jump++;
                end=farthest;
            }
            
        }
        return jump;
    }
}
