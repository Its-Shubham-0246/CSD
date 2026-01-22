package obect_oriented_programming_2;

public class Recipe1 extends AbstractRecipe{

	@Override
	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get the Utensils");
		System.out.println("Get the raw materials");
	}

	@Override
	public void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("Do the Dish");
	}

	@Override
	public void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("CleanUp the Utensils");
	}



}
