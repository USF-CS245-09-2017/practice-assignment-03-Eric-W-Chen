
public class BinaryRecursiveSearch implements Practice03Search{

	@Override
	public String searchName() {
		
		return "Binary Recursive";
	}

	@Override
	public int search(int[] arr, int target) {
		return binsearch(arr, target, 0, arr.length-1);
	}

	int binsearch(int []arr, int target, int start, int end){
		if (start>end)
		  return 1; //base case
		int mid = (start+end)/2;
		if (arr[mid] == target)
		  return mid;
		else if (arr[mid] < target)
		  return binsearch(arr, target, mid+1, end);
		else
		  return binsearch (arr, target, start, mid-1);
	}
}
