import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {
    @Test
	public void prove() {
		int[] nums = new int[] {2,3,1};
		int[] res = new int[] {1,2,3};
		QuickSort sort = new QuickSort();
		System.out.println();
		sort.quicksort(nums, 0, 2);
		assertArrayEquals(res, nums);
		
		
	}
}
