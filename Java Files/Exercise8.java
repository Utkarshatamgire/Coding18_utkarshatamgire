
public class Exercise8 {
    public static void main(String args[]) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(sentence.toLowerCase());
        if (isPangram) {
            System.out.println(" '" + sentence + "' is a pangram");
        } else {
            System.out.println(" '" + sentence + "' is not a pangram");
        }
    }

    public static boolean checkPangram(String str) {
        boolean[] alphabetCheck = new boolean[26];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                if (!alphabetCheck[index]) {
                    alphabetCheck[index] = true;
                    count++;
                }
            }
        }
        return count == 26;
    }
}
