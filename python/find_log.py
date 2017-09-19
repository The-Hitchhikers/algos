# find log
def find_log(number, steps=0):
    if number == 1:
        return steps
    return find_log(number // 2, steps + 1)

print(find_log(128))
