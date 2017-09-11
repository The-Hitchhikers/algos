# https://www.hackerrank.com/challenges/apple-and-orange/problem
s, t = input().strip().split(' ')
s, t = [int(s), int(t)]
a, b = input().strip().split(' ')
a, b = [int(a), int(b)]
m, n = input().strip().split(' ')
m, n = [int(m), int(n)]
apple = [int(apple_temp) for apple_temp in input().strip().split(' ')]
orange = [int(orange_temp) for orange_temp in input().strip().split(' ')]

apple_coordinates = [x + a for x in apple]
orange_coordinates = [x + b for x in orange]

apple_result = [x >= s and x <= t for x in apple_coordinates]
orange_result = [x >= s and x <= t for x in orange_coordinates]

print(sum(apple_result))
print(sum(orange_result))
