

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        int bullHeads = 0 ;
        if (value % 5 == 0)
            bullHeads += 2 ;
        if (value % 10 == (value)/10 % 10 && value != 100)
            bullHeads += 5 ;
        if (value % 10 == 0)
            bullHeads = 3 ;
        if (bullHeads == 0)
            bullHeads = 1 ;

        int oneline = value % 10 == 0 ? 3 : ((value % 5 == 0 ? 2 : 0) + (value % 10 == (value)/10 % 10 && value != 100 ? 5 : 0)) == 0 ? 1 : ((value % 5 == 0 ? 2 : 0) + (value % 10 == (value)/10 % 10 && value != 100 ? 5 : 0)) ;

        return oneline;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
