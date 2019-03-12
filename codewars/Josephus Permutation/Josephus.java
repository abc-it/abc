import java.util.ArrayList;
import java.util.List;

public class Josephus {
	public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
		List<T> output = new ArrayList<T>();
		int i = 0;
		while (items.size() > 0) {
			i = (i - 1 + k) % items.size();
			output.add(items.remove(i));
		}
		return output;
	}
}