# https://www.hackerrank.com/challenges/the-birthday-bar/problem
def solve(d, m, sq):
    count = 0
    for x in range(0, len(sq) + 1 - m):
        if sum(sq[i: i + m]) == d:
            count += 1
    return count
