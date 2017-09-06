# Simple Array Sum
# Passed only one test case
def simple_array_sum(ar):
    arr = [int(value) for value in ar.split(' ')]
    result = sum(arr)
    return result

print(simple_array_sum('1 2 3 4 10 11'))


# Option 2
# Passed all test cases
n = input()
arr = input()
objects = [int(value) for value in arr.split(' ')]
result = sum(objects)
print(result)
