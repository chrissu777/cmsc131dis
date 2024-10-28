import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListToArray {
	/* Given an ArrayList of Integers, convert to 
	 * an array and vice versa
	 */
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		int[] numsArr = new int[nums.size()];
		
		for(int i = 0; i < nums.size(); i++) {
			numsArr[i] = nums.get(i);
		}
		System.out.println(Arrays.toString(numsArr));
		ArrayList<Integer> nums2 = new ArrayList<>();
		for(int i = 0; i < numsArr.length; i++) {
			nums2.add(numsArr[i]);
			System.out.println(nums2.get(i));
		}
		
	}
}
