package com.javaAlgorithm.algorithm.focu;

//퀵 정렬
public class Quick_Sort {
    //로무토 분할법
    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];

        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        int pivotPos = i + 1;
        nums[right] = nums[pivotPos];
        nums[pivotPos] = pivot;
        return pivotPos;
    }

    public static void quickSortRecursive(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        // partition = 각 회사의 정렬을 수행하는 함수
       int pivotPos = partition(nums, left, right);

        /*int pivotPos = partition(nums, left, right); 과정을 거치면
        return 값은 기준값의 최종 픽스 위치가 된다.
        * */

        // 기준값의 최종 위치 기준으로 왼쪽 수행 / 오른쪽 수행
        quickSortRecursive(nums,left,pivotPos -1);
        quickSortRecursive(nums,pivotPos+1,right);
    }

    public static void quickSort(int[] nums) {
        quickSortRecursive(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 3, 4};

        quickSort(nums);
        for (int k : nums) {
            System.out.print(k + " ");
        }
        System.out.println();

//        nums = new int[]{4, 3, 2, 3, 1, 1, 2, 6, 7};
//        quickSort(nums);
//        for (int k : nums) {
//            System.out.print(k + " ");
//        }
//        System.out.println();

    }
}
