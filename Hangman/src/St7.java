public class St7 {
    public static void main(String[] args) {
        System.out.println("H A N G M A N");
        char[] word = Math.random(["python", "java", "kotlin", "javascript"]);
        char guess = ' ';
        char guessed = ' ';
        char letter = ' ';
        int lives = 8;
        int lives_unchanged = 0;

        while (lives > 0) {
            char word_partial = ' ';
            for (word in word) {
                if (word in guess){
                    word_partial += word_char;
                }
        else{
                    word_partial += '-';
                    System.out.print('\n' + word_partial);
                }
            }

            if (sorted(guess) == sorted(word)) {
                System.out.print("You guessed the word!\nYou survived!");
                break;
            } else {
                lives_unchanged = lives;
                lives -= 1;
                System.out.print("Input a letter: ");
                letter = in.nextInt();
            }

            if (letter not in word){
                if (len(letter) > 1) {
                    System.out.print("You should input a single letter");
                    lives = lives_unchanged;
                } else if (letter char guessed){
                    System.out.print("You've already guessed this letter");
                    lives = lives_unchanged;
                }
        else if (letter.isupper()) {
                    System.out.print("Please enter a lowercase English letter");
                    lives = lives_unchanged;
                } else if (letter.isalpha() == False) {
                    System.out.print("Please enter a lowercase English letter");
                    lives = lives_unchanged;
                } else:
                guessed += letter;
                System.out.print("That letter doesn't appear in the word")

        else:
                guessed += letter;
                if (letter in word_partial){
                    System.out.print("You've already guessed this letter");
                    lives = lives_unchanged;
                } else{
                    guess = guess + letter;
                    lives = lives_unchanged;
                }


                if (sorted(guess) != sorted(word)) {
                    System.out.print("You lost!");
                }
            }
        }
    }
}
