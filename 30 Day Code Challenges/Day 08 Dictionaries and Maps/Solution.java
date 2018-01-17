import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> collector = new HashMap<String, Integer>(n);
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            collector.put(name, new Integer(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            String returnString = (collector.containsKey(s)) ? s + "=" + collector.get(s) : "Not found";
            System.out.println(returnString);
        }
        in.close();
    }
}
