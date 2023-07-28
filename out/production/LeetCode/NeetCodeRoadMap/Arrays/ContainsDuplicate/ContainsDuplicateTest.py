import random
import unittest
from typing import List

class Solution101:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # The implementation you provided
        return len(nums) != len(set(nums))

class TestSolution101(unittest.TestCase):
    def test_contains_duplicate_positive(self):
        sol = Solution101()
        numberList = [1, 2, 3, 1]
        result = sol.containsDuplicate(numberList)
        self.assertTrue(result)

    def test_contains_duplicate_negative(self):
        sol = Solution101()
        numberList = [1, 2, 3, 4]
        result = sol.containsDuplicate(numberList)
        self.assertFalse(result)

    def test_contains_duplicate_random_input(self):
        sol = Solution101()
        numberList = random.sample(range(100), 50)
        result = sol.containsDuplicate(numberList)
        # Implement another way to check if there are duplicates to validate the result
        self.assertEqual(result, len(numberList) != len(set(numberList)))

    def test_contains_duplicate_all_identical_elements(self):
        sol = Solution101()
        numberList = [7, 7, 7, 7, 7]
        result = sol.containsDuplicate(numberList)
        self.assertTrue(result)

    def test_contains_duplicate_large_list_no_duplicates(self):
        sol = Solution101()
        numberList = list(range(10000))
        result = sol.containsDuplicate(numberList)
        self.assertFalse(result)

    # def test_contains_duplicate_large_list_with_duplicates(self):
    #     sol = Solution101()
    #     numberList = list(range(9999)) + [9999]  # Last element is a duplicate
    #     result = sol.containsDuplicate(numberList)
    #     self.assertTrue(result)

if __name__ == "__main__":
    unittest.main()
