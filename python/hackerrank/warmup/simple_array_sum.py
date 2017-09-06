# Simple Array Sum
def simple_array_sum(ar):
    arr = [int(value) for value in ar.split(' ')]
    result = sum(arr)
    return result

print(simple_array_sum('1 2 3 4 10 11'))
