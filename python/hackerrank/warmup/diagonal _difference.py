# https://www.hackerrank.com/challenges/diagonal-difference/problem
def diagonal_difference(n, ar):
    first_diagonal = []
    second_diagonal = []
    for x in range(n):
        first_diagonal.append(ar[x][x])
    for j in range(n):
        second_diagonal.append(ar[j][n - j - 1])

    first_result = sum(first_diagonal)
    second_result = sum(second_diagonal)
    total = (first_result - second_result)
    return abs(total)


# Second option
def diagonal_diff(n, ar):
    first_diagonal = sum([ar[x][x] for x in range(n)])
    second_diagonal = sum([ar[x][n - x - 1] for x in range(n)])
    result = abs(first_diagonal - second_diagonal)
    return result

print(diagonal_difference(3, [[11, 2, 4], [4, 5, 6], [10, 8, -12]]))
print(diagonal_diff(3, [[11, 2, 4], [4, 5, 6], [10, 8, -12]]))
