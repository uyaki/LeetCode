# 二分搜索总结

## 条件

1. 前置条件
    - 被搜索数组已排序
2. 边界
    - `start > end`

## 模板

```java
class Solution {
    public int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return start;
        }
        int mid = (start + end) / 2;
        // 二分过程 ...
    }
}
```

## 例子

如 [P35_搜索插入位置](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P35_SearchInsertPosition.md)

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, 0, nums.length - 1, target);
    }

    private int searchInsert(int[] nums, int start, int end, int target) {
        if (start > end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (target > nums[mid]) {
            // 比中位数大，在右边查找
            return searchInsert(nums, mid + 1, end, target);
        } else if (target < nums[mid]) {
            // 比中位数小，在左边查找
            return searchInsert(nums, start, mid - 1, target);
        } else {
            // 等于直接返回
            return mid;
        }
    }
}
```