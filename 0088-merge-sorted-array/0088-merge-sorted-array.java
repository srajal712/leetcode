class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int p1 = m-1, p2 = n-1, i = m+n-1;
          while(p2 >= 0){
              if(p1>=0 && nums1[p1]> nums2[p2]){
               nums1[i--] = nums1[p1--];
              }else{
                  nums1[i--] = nums2[p2--];
                     }
                }
        
             }
         }
// Two pointer approach :- Time complexity = O(k), k = m + n; Space = O(1);
// The main logic behind this approach is to start filling the nums1 array from the back. Let's keep a pointer p1 at m-1 in nums1 and p2 at n-1 in nums2, and I at n+m-1;(nums1)
// compare values at p1 and p2 put the larger value at i and decrement the respective indexes.