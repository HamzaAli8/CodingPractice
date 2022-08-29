package Patterns;



public class CyclicSort {

    public void cyclicSort1(int [] nums){

        int i = 0;

        while(i < nums.length){

            int j = nums[i] - 1;
            if(nums[i] != nums[j]){
                swap(nums,i, j);
            }
            else
                i++;
        }
    }

    public void swap (int[] arr,int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
