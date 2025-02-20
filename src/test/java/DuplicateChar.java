public class DuplicateChar {

    public  static  void main (String[] args){

        String s1 = "Vinisha Mittal";
        char[] str2 = s1.toCharArray();

        for(int i=0;i<str2.length;i++){
            int count =1;
            for(int j=i+1;j<str2.length;j++){
                if(str2[i]==str2[j]){
                    count++;
                    str2[j]='0';
                }
            }
            if(count>1 && str2[i]!='0'){
                System.out.println(str2[i]);
            }
        }


    }

}
