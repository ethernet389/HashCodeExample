import com.sun.source.tree.Tree;

import java.io.PrintStream;
import java.util.*;

public class Main {

    static PrintStream out = new PrintStream(System.out);
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        String[] s = in.nextLine().split(" ");
        for (String str : s){
            hashSet.add(str);
            treeSet.add(str);
        }
        for (
                Iterator it = hashSet.iterator();
                it.hasNext();
            ){
            out.println(it.next().hashCode());
        }
        out.println(hashSet);
        out.println(treeSet);
    }
}