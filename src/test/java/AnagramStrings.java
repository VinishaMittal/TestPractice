import java.util.Arrays;

public class AnagramStrings {

    public static void main(String[] args){
        String str1= "Mother In Law";
        String str2 = "Hitler Women";
        String str3= str1.replaceAll("\\s", "");
        String str4 = str2.replaceAll("\\s", "");
        System.out.println(str3);
        if(str3.length()!=str4.length()) {
            System.out.println("Strings are not anagram");
        }else{
            char[] str5 = str3.toLowerCase().toCharArray();
            char[] str6 = str4.toLowerCase().toCharArray();
            Arrays.sort(str5);
            Arrays.sort(str6);
            if(Arrays.equals(str5,str6)){
                System.out.println("String are anagram");
            }else
            {
                System.out.println("Strings are not anagram");
            }
        }
    }

}
