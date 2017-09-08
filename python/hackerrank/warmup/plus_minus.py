def show_result(positive, negative, zeros):
    ar = [positive, negative, zeros]
    for x in range(len(ar)):
        print("{:.6f}".format(ar[x]))


# Plus minus
def plus_minus(n, ar):
    positive = len([ar[x] for x in range(n) if ar[x] > 0])
    negative = len([ar[x] for x in range(n) if ar[x] < 0])
    zeros = len([ar[x] for x in range(n) if ar[x] == 0])

    positive_result = float(positive) / n
    negative_result = float(negative) / n
    zeros_result = float(zeros) / n

    return show_result(positive_result, negative_result, zeros_result)

print(plus_minus(6, [-4, 3, -9, 0, 4, 1]))
