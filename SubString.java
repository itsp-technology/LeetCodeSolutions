public class SubString {
    public static void main(String[] args) {
        String hay = "hello";
        String need = "e";
        System.out.println(strStr(hay, need));
    }

    public static boolean compare(String hay, String need, int index) {
        int a = hay.length();
        int b = need.length();
        for (int i = 0; i < b; i++) {
            if (index >= hay.length())
                return false;

            if (hay.charAt(index++) != need.charAt(i))
                return false;

        }
        return true;
    }

    public static int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        for (int i = 0; i < l1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (compare(haystack, needle, i)) {
                    return i;
                }
            }
        }
        return -1;

    }
}

