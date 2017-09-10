# https://www.hackerrank.com/challenges/birthday-cake-candles/problem
def birthday_cake_candles(n, ar):
    m = max(ar)
    total = 0
    for x in range(n):
        if ar[x] == m:
            total += 1
    return total

print(birthday_cake_candles(10, [18, 90, 90, 13, 90, 75, 90, 8, 90, 43]))
