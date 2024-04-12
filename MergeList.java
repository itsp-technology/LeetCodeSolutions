import java.util.*;

public class MergeList {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(4);
        List<Integer> l2 = new ArrayList<>();

        l2.add(1);
        l2.add(3);
        l2.add(4);

        List<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(l1);
        mergeList.addAll(l2);

        Collections.sort(mergeList);
        System.out.println(Arrays.stream(mergeList.stream().toArray()).toList());


    }
}
