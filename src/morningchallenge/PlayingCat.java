package morningchallenge;

/**
 * The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive).
 * Write a method isCatPlaying that has 2 parameters. The method needs to return true if the cat is playing, otherwise,
 * return false.
 * 1st parameter should be of type boolean and be named summer it represents if it is summer.
 * 2nd parameter represents the temperature and is of type int with the name temperature.
 * OutPut:
 * isCatPlaying(true, 10) should return false since temperature is not  in range 25-35
 * isCatPlaying(false, 36) should return false since the temperature is not in the range 25-35(summer parameter is false)
 * isCatPlaying(false, 35) should return true since the temperature is in the range 25-45
 * Note:
 * The isCatPlaying() method needs to be defined as public static
 */
public class PlayingCat {

    /* public static boolean isCatPlaying(boolean summer, int temperature) {
        return temperature >= 25 && temperature <= 35;//Temperature between 25 and 35(inclusive)
    }

    //if-else statement:
    if (isCatPlaying(true, 10)) {
        sout("True ...");
    } else {
        sout("False ...");
    }

    // Use ternary operator to decide output
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10) ? "True, since temperature is in  the range 25-35" : "False, since temperature is not in the range 25-35");
        System.out.println(isCatPlaying(false, 36) ? "True, since temperature is in the range 25-35" : "False, since temperature is not in the range 25-35(summer parameter is false)");
        System.out.println(isCatPlaying(false, 35) ? "True, since temperature is in the range 25-35" : "False, since temperature is not in the range 25-35");
    }*/

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }

        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true, 30));

    }
}


