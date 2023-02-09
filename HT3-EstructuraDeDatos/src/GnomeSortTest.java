	
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class GnomeSortTest {
    
    @Test
	void prove() {
		int[] nums = new int[] {2,3,1};
		int[] res = new int[] {1,2,3};
		GnomeSort g = new GnomeSort();
		System.out.println();
		g.gnomeSort(nums, 3);
		assertArrayEquals(res, nums);
		
		
	}
}
