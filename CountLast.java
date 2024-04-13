public class CountLast {

    public static void main(String[] args) {
        String s = "Hive vivek kumar g";

        String[]  arrWord = s.trim().split(" ");

       String  last = arrWord[arrWord.length-1];
        System.out.println(last.length());
    }
    }

