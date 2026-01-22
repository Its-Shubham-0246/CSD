package oops;

import java.math.BigDecimal;
public class StudentRunner {
	public static void main(String[] args) {
		String name = "Shubham";
		Student student = new Student(name, 23, 34, 87);
		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks : " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total sum of Marks : " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum Marks : " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum Marks : " + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average of Marks : " + average);
		student.marks();
		student.addNewMark(35);
		student.removeMark(1);
		student.marks();
		System.out.println(student);
	}
}
