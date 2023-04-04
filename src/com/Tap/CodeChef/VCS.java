package com.Tap.CodeChef;

import java.util.Scanner;

public class VCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int j = 0; j<t; j++){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    int k = scan.nextInt();
		    
		    int[] ign = new int[m];
		    for(int i = 0; i<ign.length; i++){
		        ign[i] = scan.nextInt();
		    }
		    
		    int[] tr = new int[k];
		    for(int i = 0; i<tr.length; i++){
		        tr[i] = scan.nextInt();
		    }
		    
		    int[] res = new int[n+1];
		    
		    for(int i = 0; i<ign.length;i++){
		        res[ign[i]]++;
		    }
		    
		    for(int i =0; i<tr.length;i++){
		        res[tr[i]]++;
		    }
		    
		    int twocount=0, zerocount=0;
		    for(int i =1; i<res.length; i++){
		        if(res[i]==2){
		            twocount++;
		        }
		        else if(res[i]==0){
		            zerocount++;
		        }
		        
		    }
		    System.out.println(twocount + " " + zerocount);
		}
	}
}
