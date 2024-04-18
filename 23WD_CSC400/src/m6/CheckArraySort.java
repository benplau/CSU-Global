package m6;

import java.util.List;

public class CheckArraySort {
	public static boolean isSorted(List<Integer> list) {
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < list.get(i - 1)) {
				return false;
			}
		}
		return true;
	}

}
