package conditionals;

public class GuessGame {

    public int currentGuess = 0; // maximum is around 7-8
    int minPossibleValue = 1;
    int maxPossibleValue = 100;

    public GuessGame(int minPossibleValue, int maxPossibleValue) {
        this.minPossibleValue = minPossibleValue;
        this.maxPossibleValue = maxPossibleValue;
    }

    int generateAnewGuess(int previousGuess, boolean guessWasBiggerThanAnswer) {
        if(previousGuess!=-1) {

            if (guessWasBiggerThanAnswer) {
                this.maxPossibleValue = previousGuess;
            } else {
                this.minPossibleValue = previousGuess;
            }
        }

        currentGuess +=1;

        int guess = ( maxPossibleValue - minPossibleValue) / 2 + minPossibleValue;
        if (guess != previousGuess) {
            return guess;
        }

        return guess + 1;
    }

    int generateATriangularNewGuess(int previousGuess, boolean guessWasBiggerThanAnswer) {
        if(previousGuess!=-1) {

            if (guessWasBiggerThanAnswer) {
                this.maxPossibleValue = previousGuess;
            } else {
                this.minPossibleValue = previousGuess;
            }
        }

        currentGuess +=1;

        int guess = ( maxPossibleValue - minPossibleValue) / 3 + minPossibleValue;
        if(currentGuess%2 ==0){
            guess = 2*( maxPossibleValue - minPossibleValue) / 3 + minPossibleValue;
        }
        if (guess != previousGuess) {
            return guess;
        }

        return guess + 1;
    }
}
