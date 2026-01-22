import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number % 2 == 0;
	}

}

class printForEach implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		// TODO Auto-generated method stub
		System.out.println(number);
	}


}

class mapThing implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		// TODO Auto-generated method stub
		return number * number;
	}

}
public class LamdaBehindTheScreenRunner {
	public static void main(String[] args) {
		List.of(23, 24, 27, 76, 35, 4, 64, 86, 60).stream().filter(new EvenNumberPredicate()).map(new mapThing())
				.forEach(new printForEach());
	}
}
