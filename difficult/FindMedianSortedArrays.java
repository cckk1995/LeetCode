package difficult;

import java.util.ArrayList;
import java.util.List;

public class FindMedianSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums1.length; i++) list.add(nums1[i]);
		for(int i = 0; i < nums2.length; i++) list.add(nums2[i]);
		list.sort(null);
		int size = list.size();
		if(size%2==0) {
			return (double)(list.get(size/2) + list.get(size/2-1)) / 2;
		} else {
			return (double)(list.get(size/2));
		}
    }
	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
}
