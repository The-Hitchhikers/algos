def stair_case(n):
    for x in range(1, n + 1):
        print(' ' * (n - x) + '#' * x)

stair_case(6)
