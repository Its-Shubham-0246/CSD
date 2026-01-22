package obect_oriented_programming_2;

public class GameRunner {
	public static void main(String[] args) {
		GamingConsole[] games = { new MarioGame(), new ChessGame() };

		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
	}
}
