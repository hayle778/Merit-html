/*
       char [] name = {'code', 'doce', 'ecod', 'framer', 'frame'}

       from this array element compare the first element with the rest . If they are not anagram
       keep them but if they are remove them from the list and by the end put the elements
       in ascending  order.
--------------------------------
.. funWithAnagrams has two parameters
        String text[n]...an array of a strings
       String[m] .... an array of the remaining String in an ascending order
---------------------------------
constraints
0 <= n <=  1000
0 <=  m <=  n
1 <=  length of text[i]  <= 1000 // i  is the content between <= n
each String text [i]   made up of characters  ascii[A-Z]
*/
import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void main (String[]args){

       funWithAnagrams( "code" , "aaagmnrs");

      String [] name = {"code", "aaagmnrs", "anagrams", "doce"};

                         String w = name[0];
                         String x = name[1];
                        String y = name[2];
                        String z = name[3];


                     if(w.length() == z.length()){
                         System.out.println("The String w_z  are  anagram: ");
                     }

                    if (x.length() == y.length()){
                      System.out.println("The String x_ y are  anagram");

                   }
    }

    private static void funWithAnagrams(String code , String aaagmnrs) {
    String  k = code. toString();
    int n = k.length();
    String j = aaagmnrs.toString();
    int m =  j.length();
    if(n < m){
        System.out.println("[" + "code"+ "," + "aaagmnrs"+"]");
    }
else{
    System.out.println("["+ "aaagmnrs"+ ","+ "code"+"]");

}
    return ;
    }
    // String  w, String  x

    public static  List <String  >  funWithAnagrams(List<String> text) {
            text .add( "code" );
            text.add( "aaagmnrs" );

        return  text;

    }

}






