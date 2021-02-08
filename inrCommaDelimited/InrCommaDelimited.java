package inrCommaDelimited;

import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class InrCommaDelimited{
    public static void main(String args[]){
    
    }
    
    public String getInrCommaDelimited(Long num){

        String sum = "";
        long n = num;
        int count = 0;
        long dig=0;
        while(num>0){
            count++;
            dig = num % 10;
            sum = sum + Long.toString(dig);
            num = num / 10;
            if(count == 3){
                sum = sum + ",";
            }

            if( (count>3) && ((count%2) != 0)){
                sum = sum + ",";
            }

        }

        sum = sum + ".sR";

        StringBuffer str = new StringBuffer(sum);
        
        StringBuffer sb = str.reverse();

        String ans = sb.toString()+ ".00";
    
        if(ans.charAt(3) == ','){
            return ans.substring(0,3) + ans.substring(4);
        }
        else{
            return ans;
        }
        
    }
}
