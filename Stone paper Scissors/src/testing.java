import java.util.*;
class Solution {
    	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	        double k=0;
    	if(nums1.length!=0 && nums2.length!=0){
    	double a=nums1[0], b=nums2[0],c=nums1[nums1.length-1],d=nums2[nums2.length-1];
    	        double x=0,y=0;

    	        if(a<b)
    	            x=a;
    	        else
    	            x=b;
    	        if(c>d)
    	            y=c;
    	        else
    	            y=d;

    	        k=(x+y)/2;
    	}
    	else if(nums1.length>1){
    	    double a=nums1[0], c=nums1[nums1.length-1];
    	k=(a+c)/2;
    	}
    	else if(nums2.length>1){
    	    double a=nums2[0], c=nums2[nums2.length-1];
    	k=(a+c)/2;
    	}
    	else if(nums1.length==1){
    	    double a=nums1[0];
    	    k=a;
    	}
    	else if(nums2.length==1){
    	    double a=nums2[0];
    	    k=a;
    	}
    	else
    	    return -1;

    	return k;
    	        
    }   
 }

public class testing {

	public static void main(String[] args) {
		int[] a= {1,2};
		int[] b= {3,4};
		Solution s=new Solution();
		System.out.println(s.findMedianSortedArrays(a,b));
	}

}
