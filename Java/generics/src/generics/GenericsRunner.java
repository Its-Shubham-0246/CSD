package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addCoupleOfNumber(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(5l);
		numbers.add(0.5f);

	}
	static <X extends List> void dublicate(X list) {
		list.addAll(list);
	}

	public static void main(String[] args) {
		List empty = new ArrayList<Number>();
		addCoupleOfNumber(empty);
		System.out.println(empty);
		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.3, 4.4, 5.5)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));

		double value = doubleValue(456.3);
		double value1 = doubleValue(4);
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("String 1");
		list.addElement("String 2");
		String string = list.get(0);
		System.out.println(list);
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(2);
		list2.addElement(4);
		int number = list2.get(0);
		System.out.println(list2);
	}
}
