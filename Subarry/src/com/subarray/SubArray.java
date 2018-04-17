package com.subarray;

import java.util.Arrays;
import java.util.Scanner;
 
class SubArray
{
	static int arr2[];
   static int arr[];
  static long N;
    
   // Prints all subarrays in arr[0..n-1]  
   static void subArray()
   {
	   int k;
	  int e =0;
       // Pick starting point
       for (int i=0; i <arr.length; i++)
       {
           // Pick ending point
           for (int j=i; j<arr.length; j++)
           {
               // Print subarray between current starting
               // and ending points
        	   int c = 0,d=0;
               for (k=i; k<=j; k++)
               {
            	   
            	   if(arr[k]%2==0)
            		   c=c+1;
            	   else
            		   d=d+1;
            	     
                  
               }   
               if(c == d)
               {
            	   
            	   e=e+1;
               }
           
              
           }
       }
       System.out.print(e);
   }
    
   // Driver method to test the above function
   public static void main(String[] args) 
   {
   Scanner s = new Scanner(System.in);
	  
	   int i;
	   int N = s.nextInt();
	   arr = new int[N];
	   for(i = 0 ; i < N;i++)
	   {
		   arr[i] = s.nextInt();
	   }
	   
       
       subArray();
   
   
   }
}