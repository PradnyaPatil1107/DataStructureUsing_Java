package allsortinone;

public class Algorithms {

	
	//bubble sort
	//1st element compare with 2nd one
	//after 1st iteration max value at end
	
	public static void Bubblesort(int []arr) {
		int passes=arr.length-1;
		int comparisons=arr.length-1;
		
		for(int i=0;i<passes;i++)//no of  passes time it iterate
			{
		int	count=0;
		for(int j=0;j<(comparisons-i);j++) //no of comparisons required
		{
			if(arr[j]>arr[j+1]) {
				count++;
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			
			
			}
		}
		if(count==0) {
			System.out.println("pasees "+(i+1));
		}
		
		}
		
	}
	
	
	//selection sort
	public static  void selectionsoprt(int arr[]) {
	for(int i=0;i<arr.length-1;i++)//no of passes
	{
		System.out.println("in selection sort");
		int min=0;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
			
			
		}
		if(i!=min) {
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
	}
}
	
	public static void insersitionsort( int arr[]) {
		for(int i=0;i<arr.length;i++)//unsorted array
		{
			System.out.println("in insertionsort");
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
	}
	
	
	//quick sort
	  public static void quickSort(int [] arr, int left, int right) {
	      System.out.println("in quick sort");
		  if(left >= right) {
	            return;
	        }

	        int pivotLocation = partition(arr, left, right);
	        quickSort(arr, left, pivotLocation-1);
	        quickSort(arr, pivotLocation+1, right);
	    }
	private static int partition(int [] arr, int left, int right) {
        int pivot = arr[left];

        while( left != right) {
            //if right element is greater than pivot shift right
            while (arr[right] > pivot && left != right) {
                right--;
            }
             /*if(left == right) {
                break;
            }*/
            //right element is less than pivot, so shift it to left
            if(left != right) {
                arr[left] = arr[right];
                left++;
            }

            while (arr[left] < pivot && left != right) {
                left++;
            }
            /*if(left == right) {
                break;
            }*/
            if(left != right) {
                arr[right] = arr[left];
                right--;
            }
        }

        arr[left] = pivot; //position the pivot element at it's exact position in sorted array
        return right; //return the pivot location
    }
	
	
	public static void mergesort(int arr[],int leftstart,int leftend,int rightstart,int rightend) {
		System.out.println("in merge sort");
		int numelemnts=leftstart-rightend+1;
		 int res[]=new int[numelemnts];
		 int resindex=-1;
		 while(leftstart<=leftend && rightstart<=rightend) {
			 if(arr[leftstart]<arr[rightstart]) {
				 res[++resindex]=arr[leftstart];
				 leftstart++;
				 
				 
				 
			 }
			 else {
				 res[++resindex]=arr[rightstart];
				 rightstart++;
				 
			 }
			 
			 
		 }
		 if(leftstart<=leftend) {
			 while(leftstart<=leftend) {
				 res[++resindex]=arr[leftstart];
				 leftstart++;
				 
			 }
			 
		 }
		 else {
			 while(rightstart<rightend) {
				 res[++resindex]=arr[rightstart];
				 rightstart++;
			 }
		 }
	        for(int i = 1; i <= numelemnts; i++) {
	            arr[rightend] = res[resindex];
	            rightend--;
	            resindex--;
	}
}}
		
		


	

