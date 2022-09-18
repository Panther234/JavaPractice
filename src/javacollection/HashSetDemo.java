package javacollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("Prime");
        set.add("Testing");
        set.add("Java");
        set.add("selenium");
        /*for (String var : set) {
            System.out.println(var);
        }*/
        //iterate set using Iterator interface
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
