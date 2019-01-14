import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio2{
    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<Integer>();
      
        for (int i=0;i<10;i++)
        {
            
            vector.add(ThreadLocalRandom.current().nextInt(0, 100));
        }

        for(int i=1;i<vector.size();i++){
            for(int k=i;k<vector.size();k++){
                if(vector.get(i)>vector.get(k)){
                    Integer auxiliar = vector.get(k);
                    vector.set(k, vector.get(i));
                    vector.set(i, auxiliar);
                }
            }
        }
         
        System.out.println(vector);
        
    }
}
    
