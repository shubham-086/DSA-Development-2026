import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	static class Student {
		String name;
		int rollNo;

		Student(String name, int rollNo) {
			this.name = name;
			this.rollNo = rollNo;
		}

		@Override
		public String toString() {
			return " Name: " + name + " Roll No. " + rollNo;
		}
	}

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		students.add("Rohit");
		students.add("Rishabh");
		students.add("Vinay");
		students.add("Aditya");

		// System.out.println(students);
		// System.out.println(students.set(2, "Vinay Pandey"));
		// System.out.println(students.get(2));
		// System.out.println(students.contains("Aman"));
		// students.clear();
		// System.out.println(students.isEmpty());
		// students.remove(3);
		System.out.println(students);
		Collections.sort(students, Collections.reverseOrder());
		System.out.println(students);

		// ArrayList<Student> students = new ArrayList<>();

		// students.add(new Student("Vinay", 1));
		// students.add(new Student("Aditya", 2));
		// students.add(new Student("Rishab", 3));

		// System.out.println(students);
		// System.out.println(students.size());

		ArrayList<Integer> marks = new ArrayList<>();

		// for (String stu : students) {
		// System.out.println(stu);
		// }

		// students.forEach((stu) -> System.out.println(stu));
		students.forEach(System.out::println);
	}
}
