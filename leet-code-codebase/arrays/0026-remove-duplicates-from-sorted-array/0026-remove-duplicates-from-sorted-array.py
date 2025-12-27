class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        
        # Pointer for the position of the last unique element
        prvs = 0  

        for i in range(1, len(nums)):
            if nums[prvs] != nums[i]:  # If the current number is different from the last unique number
                prvs += 1              # Move the unique pointer
                nums[prvs] = nums[i]   # Update the position with the new unique number

        # Return the count of unique elements, which is prvs + 1
        return prvs + 1


        