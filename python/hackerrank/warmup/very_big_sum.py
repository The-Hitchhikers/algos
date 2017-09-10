# https://www.hackerrank.com/challenges/a-very-big-sum/problem
def very_big_sum(n, ar):
    total = 0
    for x in range(n):
        total += ar[x]
    return total

print(very_big_sum(5, [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]))
