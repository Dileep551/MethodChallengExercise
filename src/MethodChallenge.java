public class MethodChallenge {

    public static void displayHighScorePosition(String name, int position)
    {
       System.out.println(name +" managed to get into position "+position +
               " on the high score list");

    }

    public static  int calculateHightScorePosition(int score){
        if( score >= 1000){
            return 1;
        }
        else if(score >= 500){
            return 2;
        }
        else if(score >= 100){
            return 3;
        }
        return 4;
    }
    public static void main(String[] args) {

        int position = calculateHightScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHightScorePosition(1000);
        displayHighScorePosition("Bob", position);

        position = calculateHightScorePosition(500);
        displayHighScorePosition("Tom", position);

        position = calculateHightScorePosition(100);
        displayHighScorePosition("Gib", position);

        position = calculateHightScorePosition(25);
        displayHighScorePosition("Ram", position);


    }
}