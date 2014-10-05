package zx;

public class Sort_Colors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int[] a=new int[10];
	
	sortColors(a);

	}
	public static void sortColors(int[] A) {
        int temp=0;
        for(int i=A.length-1;i>0;i--){
            for(int j=0;j<i;j++)
            if(A[j]>A[j+1]){
                temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
            }
            
        }
    }

}
