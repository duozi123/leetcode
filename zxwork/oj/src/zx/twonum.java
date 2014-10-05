package zx;

public class twonum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={3,2,4};
System.out.println("index1="+twoSum(a,6)[0]);

System.out.println("index2="+twoSum(a,6)[1]);
	}
	public static int[] twoSum(int[] numbers, int target) {
		int[] index=new int[2];
	       for(int i=0;i<numbers.length-1;i++) {
	    	   for(int j=i+1;j<numbers.length;j++)
	    		   if(numbers[i]+numbers[j]==target){
	    			   index[0]=i;
	    			   index[1]=j;
	    			   return index;
	    		   }
	    			   
	       }
		return index;
	    }

}
