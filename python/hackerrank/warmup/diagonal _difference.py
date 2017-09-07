# # Diagonal Difference
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

print(diagonal_difference(3, [[11, 2, 4], [4, 5, 6], [10, 8, -12]]))
