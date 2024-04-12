public class longestPrifix {

    public static void main(String[] args) {
        String[] arr = {"flower","flow","floight"};

        System.out.println(longestPrifix(arr));
    }

    public static String longestPrifix(String[] arr){
        StringBuilder  commonPrifix = new StringBuilder();
        int minimumLength = arr[0].length();

        for(int i = 0 ; i < arr.length; i++){
            minimumLength = Math.min(minimumLength,arr[i].length());
        }


        for(int i = 0 ; i < minimumLength ; i++){
            char current = arr[0].charAt(i);
            for (String str : arr){
                if(str.charAt(i) != current){
                    return commonPrifix.toString();
                }
            }
            commonPrifix.append(current);
        }
        return commonPrifix.toString();
    }
}
