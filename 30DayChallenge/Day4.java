class Day4 {
    public static void moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[count++] = nums[i];

        }

        while (count < nums.length) {
            nums[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] ar = { 1, 0, 0, 12, 13, 4, 0, 5 };
        moveZeroes(ar);
    }
}