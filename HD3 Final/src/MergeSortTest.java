	
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortTest {

	@Test
	void prove() {
		int[] nums = new int[] {2,3,1};
		int[] res = new int[] {1,2,3};
		MergeSort sort = new MergeSort();
		System.out.println();
		sort.mergeSort(nums);
		assertArrayEquals(res, nums);
		
		
	}

}
