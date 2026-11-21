class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        int k = (int) Math.pow(2, nums.length);

		List<List<Integer>> main = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			int temp = i;
			int ind = 0;
			List<Integer> sub = new ArrayList<>();

			while (temp > 0) {

				if (temp % 2 == 1) {
					sub.add(nums[ind]);
				}
				ind++;

				temp /= 2;
			}

			main.add(sub);

		}

		return main;
        
    }
}
