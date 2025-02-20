import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {

    public static void main(String[] args){

        String str1 = "Vinisha Mittal";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            int count =1;
            if(map.containsKey(str1.charAt(i))){
                count = map.get(str1.charAt(i));
                map.put(str1.charAt(i),count+1);

            }else{
                map.put(str1.charAt(i),1);
            }
        }


        System.out.println(map);
        int max= 0;
        char maxchar = ' ';

        for(Map.Entry<Character,Integer> me : map.entrySet()){


            if(max<me.getValue()){
                max = me.getValue();
                maxchar = me.getKey();
            }
        }
        System.out.println(max);
        System.out.println(maxchar);

    }


}
