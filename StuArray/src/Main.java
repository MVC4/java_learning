import java.util.*;

public class Main {

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        HashMap<Integer,Integer> val= new HashMap<Integer,Integer>(1000);
        randomSet(2,1000000,1000,val);
       Object[] values=val.keySet().toArray();
        Arrays.sort(values);

        for (int i=0;i<values.length;i++){
            System.out.print(values[i]+"\t");
            if ((i+1)%10==0){
                System.out.println("\n");
            }
        }




        long end=System.currentTimeMillis();
        System.out.println("\n耗时："+(end-start)+"毫秒");
    }
    public static void randomSet(int min, int max, int n, HashMap<Integer,Integer> set) {
        if (n > (max - min + 1) || max < min) {
            return;
        }
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * (max - min)) + min;
            set.put(num,i);
        }
        int setSize = set.size();

        if (setSize < n) {
            randomSet(min, max, n - setSize, set);
        }
    }

}
