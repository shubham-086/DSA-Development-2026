import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // fastest
		// Map<String, String> map = new LinkedHashMap<>(); // fast
		// Map<String, String> map = new TreeMap<>(); // slow

		map.put("studentName", "Rahul");
		map.put("fatherName", "Raman");
		map.put("motherName", "Geeta");
		map.put("studentName", "Priya");
		map.put("course", null);
		map.put("rollNo", null);
		map.put(null, null);
		map.put(null, null);

		// System.out.println(map.get("fatherName"));
		// System.out.println(map.keySet());

		// for (String key : map.keySet()) {
		// System.out.println(key + " -> " + map.get(key));
		// }

		// for (Map.Entry<String, String> entry : map.entrySet()) {
		// System.out.println(entry.getKey() + " -> " + entry.getValue());
		// }

		map.forEach((key, value) -> System.out.println(key + " -> " + value));
		// System.out.println(map.values());
	}
}

// put(key, value)
// get(key)
// remove(key)
// containsKey(key)
// containsValue(value)
// size()
// clear()
// isEmpyt()
// keySet()
// entrySet()
// values()
