package general;

import java.util.HashSet;

/**
 * Created by Chen.Oppenhaim on 3/14/2016.
 * Interview with facebook 14/03/2016 - although provided the code it Was not good enough for facebook, aI was schedule another interview...
 * Given a hashTag and a lexicon containing valid words check if the hashTag is valid
 *
 * Example for valid hashTag:
 * hashTag = hillaryclinton2016
 * lexicon = {"hillary", "clinton", "2016"}
 */
public class FacebookInterview1 {
    public static void main(String[] argv) {
        String hashTag = "hillaryclinton2016";
        HashSet<String> lexicon = new HashSet<>();
        lexicon.add("hillary");
        lexicon.add("clinton");
        lexicon.add("2016");
        System.out.println(hashTag + ", valid = " + isValid(hashTag, lexicon));
    }

    public static boolean isValid(String hashTag, HashSet<String> lexicon) {
        if (hashTag.length() == 0)
            return true;

        for (int i = 1; i < hashTag.length() + 1; i++) {
            String firstPart = hashTag.substring(0, i);
            String secondPart = hashTag.substring(i , hashTag.length());

            if (lexicon.contains(firstPart)) {
                Boolean result = isValid(secondPart, lexicon);
                if (result)
                    return true;
            }
        }
        return false;
    }

//    @Test
//    public void test1() {
//        new HashTag
//        Assert.assertTrue('aaxe', )
//    }

}
