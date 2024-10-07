package algos.leetcode.easy;

public class DefaningIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        String[] arr = address.split("/.");
        for (String s : arr) {
            sb.append(s);
            sb.append("[.]");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        DefaningIPAddress defaningIPAddress = new DefaningIPAddress();
        defaningIPAddress.defangIPaddr("1.1.1.1");
    }
}
