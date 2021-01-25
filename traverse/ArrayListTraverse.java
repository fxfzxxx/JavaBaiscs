package traverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraverse {
    public static void main(String[] args) {
        List<String> list = new  ArrayList<String>();
        list.add("hello");
        list.add("World");
        list.add("lol");

        //for-each
        for(String str : list) {
            System.out.println(str);
        }
        //ArrayList to array
        String[] str = new String[list.size()];
        list.toArray(str);
        for (String string : str) {
            System.out.println(string);            
        }
        //Iterator
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
            
        }
    }
}