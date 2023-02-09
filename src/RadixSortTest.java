import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RadixSortTest {

    
    @Test
	public void prove() {
		int[] nums = new int[] {2,3,1};
		int[] res = new int[] {1,2,3};
		RadixSort sort = new RadixSort();
		System.out.println();
		sort.radixsort(nums, 3);
		assertArrayEquals(res, nums);
		
		
	}
}
