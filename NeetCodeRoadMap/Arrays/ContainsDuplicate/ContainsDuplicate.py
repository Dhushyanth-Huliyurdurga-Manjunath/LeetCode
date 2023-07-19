from typing import List

class Solution101:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # nums.sort()
        # for i in range(1, len(nums)):
        #     if nums[i-1] == nums[i]:
        #         return True
        # return False

        # numberSet = set(nums)
        return len(nums) != len(set(nums))

def main():
    sol = Solution101
    numberList = [1, 2, 3, 1]
    result = sol.containsDuplicate(sol, numberList)
    print(result)


if __name__ == "__main__":
    main()
