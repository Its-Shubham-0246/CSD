package oops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
public class Student {
	String name;
	ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public void marks() {
		for (int mark : marks) {
			System.out.print(mark + " ");
		}
		System.out.println();
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int max = marks[0];
//		for (int i = 1; i < marks.length; i++) {
//			if (marks[i] > max) {
//				max = marks[i];
//			}
//		}
		int max = Collections.max(marks);
		return max;
	}

	public int getMinimumMark() {
//		int min = marks[0];
//		for (int i = 1; i < marks.length; i++) {
//			if (marks[i] < min) {
//				min = marks[i];
//			}
//		}
		int min = Collections.min(marks);
		return min;
	}

	public BigDecimal getAverageMarks() {
		BigDecimal sum = new BigDecimal(String.valueOf(getTotalSumOfMarks()));
		BigDecimal total = new BigDecimal(String.valueOf(marks.size()));
		BigDecimal average = sum.divide(total, 3, RoundingMode.UP);
		return average;
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMark(int index) {
		marks.remove(index);
	}
}
