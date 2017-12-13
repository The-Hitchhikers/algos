# https://www.hackerrank.com/challenges/migratory-birds/problem
from collections import Counter


# Solution 1
# Passed only the 3 test cases
def migratory_birds(ar):
    total_birds = {total: ar.count(total) for total in ar}
    get_max = max(total_birds.values())
    result = None

    for key in total_birds.keys():
        if total_birds[key] == get_max:
            result = key
    return result


# Solution 2
# Passed all test cases
def migratory_birds_two(ar):
    total_birds = Counter(ar)
    print(total_birds.most_common()[0][0])
