package MainTask.task3;

public class TextFormater {
    private static int stringCount(String str) {
        String[] word=str.split("\\s+");
        return word.length;
    }
    public static boolean hasPalindromeWord(String s){
        int count = 0;
        String[] word = s.split("\\s+");
        for (int i =0; i<word.length;i++) {
            if (isPalindrome(word[i])){
                count++;
                if (count>0){
                    return true;
                }
            }
        }
         return false;
    }
    private static boolean isPalindrome(String str) {
        String reverse = "";
        if (str.length() > 2) {
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }
            if (reverse.equals(str)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
