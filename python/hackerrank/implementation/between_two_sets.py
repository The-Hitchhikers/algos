# https://www.hackerrank.com/challenges/between-two-sets/problem
def get_total_x(a, b):
    total = 0
    for x in range(max(a), min(b) + 1):
        if all(x % j == 0 for j in a) and all(j % x == 0 for j in b):
            total += 1
    return total

print(get_total_x([2, 4], [16, 32, 96]))
