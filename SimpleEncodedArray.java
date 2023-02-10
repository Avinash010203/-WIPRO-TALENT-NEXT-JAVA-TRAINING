import java.io.*;
import  java.util.*;
class UserMainCode
{
public int mostFrequentlyOccurringDigit(int[] input1,int input2)
{
               int[] arr=new int[10];
  for(int i=0;i<input2;i++)
  {
    while(input1[i]!=0){
    int rem=input1[i]%10;
    arr[rem]++;
    input1[i]/=10;
   }
 }
 int max=0;
 int higest_occur_number=0;
 for(int i=0;i<10;i++)
 {
  if(arr[i]>=max)
  {max=arr[i];
    higest_occur_number=i;
  }
 }
 return higest_occur_number;
}}