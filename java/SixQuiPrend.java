

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        //défi : faire en une ligne
        int bullHeads = 0 ;
        if (value % 5 == 0)
            bullHeads += 2 ;
        if (value % 10 == (value)/10 % 10 && value != 100)
            bullHeads += 5 ;
        if (value % 10 == 0)
            bullHeads = 3 ;
        if (bullHeads == 0)
            bullHeads = 1 ;

        return bullHeads;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
