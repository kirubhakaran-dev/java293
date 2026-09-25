import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<String> L1 = new ArrayList<>();
        L1.add("kirubha");
        L1.add("karan");
        L1.add("mahesh");
        // System.out.println(L1);
        ArrayList<String> L2 = new ArrayList<>();
        L2.add("hari");
        L2.add("harsan");
        L2.add("suresh");
        L1.addAll(L2);
        // System.err.println(L1);
        System.out.println(L1.get(1));
        L1.add(1, "kiran");
        System.err.println(L1);

        // L1.forEach(name->System.out.println(name));

        Iterator<String> itr = L1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // System.out.println(L2.contains("hari"));
        // System.out.println(L1.contains("haris"));
        // L1.clear();
        // System.out.println(L1);

        // System.out.println(L1.isEmpty());
    }
}