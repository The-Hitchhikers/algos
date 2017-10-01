# Return index of smallest element of an array
def find_smallest(arr):
    smallest = arr[0]
    smallest_index = 0
    arr_length = len(arr)
    for x in range(1, arr_length):
        if arr[x] < smallest:
            smallest = arr[x]
            smallest_index = x
    return smallest_index

print(find_smallest([11, 23, 8, 10]))
