/* 2. Take an array of 10 elements. Split it into the middle and
store the elements in two different arrays. E.g.-
*/
package labAssignment;

public class Array3 {

	public static void main(String[] args) {
      int [] arr= {1,2,3,4,5,6,7,8,9,10};
      int arr1[]=new int[arr.length/2];
      int arr2[]=new int[arr.length/2]; 
      int x=0;
      int y=0;
      for(int i=0;i<arr.length;i++) {
    	  if (i<=(arr.length/2)-1)
    	  {
    		 arr1[x]=arr[i];
    		 x++;
    	  }
    	  else 
    	  {
    		  arr2[y]=arr[i];
    		  y++;
    	  }
    	  }
      for(int a:arr1) {
		  System.out.print(a+" ");
      }
      System.out.println();
	 for(int a:arr2)
	 {
		 System.out.print(a+" ");
	 }
      
	}

}
