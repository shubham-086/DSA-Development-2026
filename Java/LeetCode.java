import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();

		for (String word : strs) {
			char[] arr = word.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}

			map.get(key).add(word);
		}

		return new ArrayList<>(map.values());
	}

	// public static int trap(int[] height) {
	// int n = height.length;

	// int lMax[] = new int[n];
	// int rMax[] = new int[n];

	// lMax[0] = height[0];
	// rMax[n - 1] = height[n - 1];

	// for (int i = n - 2; i >= 0; i--) {
	// rMax[i] = Math.max(height[i], rMax[i + 1]);
	// }

	// for (int i = 1; i < n; i++) {
	// lMax[i] = Math.max(height[i], lMax[i - 1]);
	// }

	// int water = 0;

	// for (int i = 0; i < n; i++) {
	// water += Math.min(lMax[i], rMax[i]) - height[i];
	// }

	// return water;
	// }

	public static int trap(int[] height) {
		int n = height.length;
		int water = 0;

		int l = 0, r = n - 1, lMax = 0, rMax = 0;

		while (l < r) {
			if (height[l] < height[r]) {
				if (height[l] >= lMax) {
					lMax = height[l];
				} else {
					water += lMax - height[l];
				}
				l++;
			} else {
				if (height[r] >= rMax) {
					rMax = height[r];
				} else {
					water += rMax - height[r];
				}
				r--;
			}
		}

		return water;
	}

	public static void main(String[] args) {
		// String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		// System.out.println(groupAnagrams(strs));

		System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
		;
	}
}
