import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {
    public static void main(String[] args) {
        Integer [] numbers={1,3,4,64,66,22,344,666,333,555,244,777,444};

        System.out.println("NIeposortowane");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Posortowane rosnoąco");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
//                if (o1>o2)
//                    return -1;
//                else if (o1<o2)
//                    return 1;
//                return 0;
            }
        });
        System.out.println("Posortowane malejąco");
        System.out.println(Arrays.toString(numbers));


    }
}