# https://www.hackerrank.com/challenges/strong-password/problem
def minimum_number(n, password):
    count = 0
    if any(i.isdigit() for i in password) is False:
        count += 1
    if any(w.islower() for w in password) is False:
        count += 1
    if any(w.isupper() for w in password) is False:
        count += 1
    if any(i in '!@#$%^&*()-+' for i in password) is False:
        count += 1
    return max(count, 6 - n)
