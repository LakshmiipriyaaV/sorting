package sorting;

public class BubbleSort {
   static void print(int a[]) {
	   int n=a.length;
	   int i;
	   for(i=0;i<n;i++) {
		   System.out.println(a[i] +"");
	   }
   }
   static void bubbleSort(int a[]) {
	   int n= a.length;
	   int i,j,temp;
	   for(i=0;i<n;i++) {
		   for(j=i+1;j<n;j++) {
			   if(a[j]< a[i]) {
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
	   }
   }
	public static void main(String[] args) {
		int a[]= {89,5,36,1,14,7};
		BubbleSort b1= new BubbleSort();
		System.out.println("Before using bubble sort:");
		b1.print(a);
		b1.bubbleSort(a);
		System.out.println();
		System.out.println("After using bubble sort:");
		b1.print(a);

	}

}
