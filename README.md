# LeetCode_1
力扣第一题- 两数之和

********以下为题目内容************
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

实例1:
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

1.所用方法:暴力枚举法
本代码用双重循环两个两个进行判断
时间复杂度O(n2)，空间复杂度O(1)
方法较为简易,但时间,空间消耗比较大


