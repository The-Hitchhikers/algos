# https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
def breaking_the_records(s):
    min_, max_ = s[0], s[0]
    min_score, max_score = 0, 0
    for x in s:
        if x > max_:
            max_ = x
            max_score += 1
        elif x < min_:
            min_ = x
            min_score += 1
    return max_score, min_score

print(breaking_the_records([10, 5, 20, 20, 4, 5, 2, 25, 1]))
