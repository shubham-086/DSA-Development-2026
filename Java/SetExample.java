import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<>();
		// Set<Integer> set = new LinkedHashSet<>();
		Set<Integer> set = new TreeSet<>();
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(25);
		set.add(50);
		set.add(20);

		System.out.println(set);
	}
}

//
// Set is an Interface
// It does not allow duplicate values, stores only unique values.
// Indexing is not supported

// ["Ravi", "Akash", "Sameer", "Vinay", "Ravi"]
// ["Ravi", "Akash", "Sameer", "Vinay"]

// Derived Classes of Set
// HashSet
// LinkedHashSet
// TreeSet

// Methods:
// size()
// add()
// Remove()
// isEmpty()
// clear()
// containes()
