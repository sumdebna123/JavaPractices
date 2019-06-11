package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		
        int tenNums[]= {3,4,2,6,1,9};
        int[] orderedNums=new int[6];
        int greater;

        //get input
        

        //imperfect number ordering algorithm
        for(int indexL=0;indexL<tenNums.length;indexL++)
        {
            greater=0;
            for(int indexR=0;indexR<tenNums.length;indexR++)
            {
            	System.out.println("indexL :"+tenNums[indexL]);
            	System.out.println("indexR :"+tenNums[indexR]);
            	if(tenNums[indexL]>tenNums[indexR])
                {
            		
                    greater++;
                }
            }
            System.out.println("tenNums[indexL] :"+tenNums[indexL]);
            orderedNums[greater]=tenNums[indexL];
        }
        
        for (int i:orderedNums) {
        	System.out.println("the Ordered value :"+i);
        }
	}

}
