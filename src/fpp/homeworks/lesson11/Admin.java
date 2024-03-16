package fpp.homeworks.lesson11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> result = new HashMap<>();
		for (Student student : students) {
			Key key = new Key(student.getFirstName(), student.getLastName());
			result.put(key, student);
		}
		return result;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double average = 0.0;
		int quantity = maps.size();
		for (Map.Entry<Key, Student> entry : maps.entrySet()) {
			average += entry.getValue().getGpa();
		}
		return average/quantity;
}
}
