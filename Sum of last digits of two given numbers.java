import java.io.*;

import java.util.*;

class UserMainCode

{

public int addLastDigits(int input1,int input2){

if(input1<0)

input1=(-1)*input1;

if(input2<0)

input2=(-1)*input2;

return (input1%10)+(input2%10);

}

}