package Java_Module_1_2;
import java.util.ArrayList;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(6);
        a1.add(4);
        a1.add(6);
        a1.add(8);
        a1.add(1);
        a1.add(100);
        a1.add(-100);

        for (Integer a : a1) {
            System.out.print(a + " ");
        }
        System.out.println();

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(8);
        a2.add(6);
        a2.add(1);
        a2.add(5);
        a2.add(100);
        a2.add(9);
        a2.add(-107);

        for (Integer al : a2) {
            System.out.print(al + " ");
        }
        System.out.println();

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : a1) {
            for (int i = 0; i < a2.size(); i++) {
                for (Integer value : result) {
                    if (value.equals(a2.get(i))) {
                        a2.remove(i);
                        i--;
                    }
                }
                if (integer.equals(a2.get(i))) {
                    result.add(integer);
                    a2.remove(i);
                    if (i != 0) i--;
                }
            }
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
