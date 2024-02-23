public class Reverse {

    public String reverse(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
