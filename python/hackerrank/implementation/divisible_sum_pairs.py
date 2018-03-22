# https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
# The solution it's not own, but looks really good.
# An own solution will be added soon as possible


def divisibleSumPairs(n, k, ar):
    nums = [0] * k
    count = 0
    for element in ar:
        mod = element % k
        count += nums[(k - mod) % k]
        nums[mod] += 1
    return count
