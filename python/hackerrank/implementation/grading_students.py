# https://www.hackerrank.com/challenges/grading/problem
def grading_students(n, ar):
    result = []
    for x in range(n):
        grade = ar[x]
        if grade >= 38:
            if grade % 5 == 3:
                grade += 2
            elif grade % 5 == 4:
                grade += 1
        result.append(grade)
    return result

print(grading_students(4, [73, 67, 38, 33]))
