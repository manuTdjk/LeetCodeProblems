class jumpGame1 {
    public boolean canJump(int[] nums) {
        int furthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > furthest) {
                return false; // Can't reach this index
            }
            furthest = Math.max(furthest, i + nums[i]);
            if (furthest >= nums.length - 1) {
                return true; // Can reach the last index
            }
        }
        return false;
    }
}
