package obect_oriented_programming_2;

public abstract class AbstractRecipe {
public void execute() {
	getReady();
	doTheDish();
	cleanUp();
}
public abstract void getReady();
public abstract void doTheDish();
public abstract void cleanUp();
}
