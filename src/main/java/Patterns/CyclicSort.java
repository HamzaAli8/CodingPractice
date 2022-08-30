package Patterns;


import java.util.ArrayList;
import java.util.List;

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

    public int findMissingNumber(int [] nums){

        int i = 0;
        while (i < nums.length){

            if (nums[i] < nums.length && nums[i] != nums[nums[i]])
                swap(nums, i, nums[i]);
            else
                i++;
        }

        for(i = 0; i < nums.length; i++)
            if (nums[i] != i)
                return i;

            return nums.length;
    }

    public List<Integer> findAllMissingNumbers(int [] nums){

         int i = 0;
         while (i < nums.length){

             if(nums[i] != nums[nums[i] - 1])
                 swap(nums, i, nums[i] - 1);
             else
                 i++;
         }

         List<Integer> missingNumbers = new ArrayList<>();
         for(i = 0; i < nums.length; i++)
             if (nums[i] != i + 1)
                 missingNumbers.add(i + 1);

             return missingNumbers;
    }

    public int FindDuplicate(int [] nums){
        int i = 0;
        while(i < nums.length){
            if (nums[i] != i + 1){
                if (nums[i] != nums[nums[i] -1])
                    swap(nums,i, nums[i] - 1);
                else
                    return nums[i];
            } else {
                i++;
            }
        }
        return -1;
    }

    public List<Integer> findAllDuplicates(int [] nums){

        int i = 0;
        while (i < nums.length){

            if(nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for(i = 0; i < nums.length; i++)
            if (nums[i] != i + 1)
                missingNumbers.add(nums[i]);

        return missingNumbers;
    }

    public List<Integer> findMissingAndDuplicate(int [] nums){

        int i = 0;
        while (i < nums.length){
            if(nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }

        List<Integer> missingAndDuplicateNumbers = new ArrayList<>();
        for(i = 0; i < nums.length; i++)
            if (nums[i] != i + 1){

                missingAndDuplicateNumbers.add(nums[i]);
                missingAndDuplicateNumbers.add(i + 1);
            }

        return missingAndDuplicateNumbers;
    }


    public List<Integer> findSmallestMissingPositiveNum(int [] nums){

        int i = 0;
        while (i < nums.length){
                if(nums[i] < 0){
                    continue;
                }
                else if (nums[i] != nums[nums[i]])
                    swap(nums, i, nums[i]);
                else
                    i++;
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for(i = 0; i < nums.length; i++)
            if (nums[i] != i + 1)
                missingNumbers.add(i + 1);

        return missingNumbers;
    }




}
