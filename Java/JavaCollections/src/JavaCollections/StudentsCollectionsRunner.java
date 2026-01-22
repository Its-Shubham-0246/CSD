package JavaCollections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<StudentCollections> {

	@Override
	public int compare(StudentCollections student1, StudentCollections student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}

}
public class StudentsCollectionsRunner {

	public static void main(String[] args) {
		List<StudentCollections> students = List.of(new StudentCollections(8, "Shubham"),
				new StudentCollections(0, "Anamika"), new StudentCollections(1, "Gudiya"));
		List<StudentCollections> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
//		Collections.sort(studentsAl, new DescendingStudentComparator());
		studentsAl.sort(new AscendingStudentComparator());
		System.out.println(studentsAl);
	}
}
