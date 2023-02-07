import java.io.*;

import java.util.*;

class UserMainCode{ public int findStringCode(String input1){

String str=input1.toUpperCase();

String word[]=str.split(" "); String value2="";

for(int i=0;i<word.length;i++) { int sum=0;

for(int j=0;j<word[i].length()/2;j++) { int first=word[i].charAt(j);

int last=word[i].charAt(word[i].length()-1-j);

sum+=Math.abs(first-last);

}

if(word[i].length()%2!=0)

sum+=

(word[i].charAt(word[i].length()/2)-64);

String value=Integer.toString(sum); value2+=value;

}

return Integer.parseInt(value2);

}}