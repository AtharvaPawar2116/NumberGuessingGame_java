# NumberGuessingGame_java
This is a simple console-based Java mini-project built during my Oasis Infobyte internship. The game randomly selects a number within a defined range, and the player must guess it within a limited number of attempts. After each guess, the program provides hints such as “Too High” or “Too Low” to guide the player. The default range is from 1 to 100, and the default number of attempts is 10, but these values can be configured. The fewer attempts you use to guess the number, the higher your score.

This game uses java.util.Random for generating the secret number and includes input validation to ensure that the user enters a valid numeric guess within the specified range. It also allows the player to replay without restarting the program. The project follows a clean structure, with logic and input/output separated to make it easier to extend or add features.

The project can be organized as follows:

Main.java – Entry point of the program.

Game.java – Contains the main game loop and rules.

Scoreboard.java – Tracks the best scores and number of rounds played.

Utils.java – Contains helper functions for input validation.

If you want to run the game, navigate to the project folder and compile the Java files using javac *.java and then run the program using java Main. You can also provide optional arguments for minimum range, maximum range, and attempts, for example: java Main 1 100 10.

During gameplay, you will be prompted to guess a number. If your guess is lower than the secret number, you will see “Too low!”, and if it’s higher, you will see “Too high!”. If you guess correctly, the program will display the number of attempts it took to win and ask if you want to play again.

The rules are simple: the guess must be an integer within the selected range, each wrong guess decreases the remaining attempts, and the game ends either when you guess correctly or run out of attempts. The scoring system rewards you for having attempts left at the end and can be expanded for more complex scoring in the future.

Possible future enhancements include difficulty levels (Easy, Medium, Hard), saving a leaderboard to a file, adding a timer mode, and creating a graphical interface using JavaFX or Swing.

This project was created as part of the Oasis Infobyte internship and serves as a hands-on practice in Java programming, random number generation, input validation, and basic game logic.
