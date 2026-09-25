import java.util.ArrayList;
// import java.util.Iterator;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<String> L1 = new ArrayList<>();
        L1.add("kirubha");
        L1.add("karan");
        L1.add("makesh");
        // System.out.println(L1);
        ArrayList<String> L2 = new ArrayList<>();
        L2.add("hari");
        L2.add("haran");
        L2.add("suresh");
        L2.add("kirubha");
        L1.addAll(L2);
        // System.err.println(L1);
        System.out.println(L1.get(1));
        L1.add(1, "kiran");
        System.err.println(L1);

        // L1.forEach(name->System.out.println(name));

        // Iterator<String> itr = L1.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }
        // System.out.println(L1.indexOf("kirubha"));
        // System.out.println(L1.lastIndexOf("kirubha"));
        L1.set(1, "karan");
        L1.add(1, "kamalesh");
        System.out.println(L1.contains("kirubha"));

        L1.replaceAll(name -> name.toUpperCase());
        System.out.println(L1.contains("kirubha"));
        System.out.println(L1);

        L1.remove(1);
        L1.removeIf(name -> name.startsWith("K"));
        System.out.println(L1);
        L1.removeIf(name->name.contains("K"));
        System.out.println(L1);
        L1.removeIf(name -> name.endsWith("H"));
        System.out.println(L1);
        System.out.println(L1.size());

        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }
        for(String k:L1){
            System.out.println(k);
        }
        

        // System.out.println(L2.contains("hari"));
        // System.out.println(L1.contains("haris"));
        // L1.clear();
        // System.out.println(L1);

        // System.out.println(L1.isEmpty());

    }
}