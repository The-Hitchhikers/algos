# https://www.hackerrank.com/challenges/reduced-string/problem
def reduce_string(s):
    letters = []
    for i in range(len(s)):
        if not letters or s[i] != letters[-1]:
            letters += [s[i]]
        else:
            letters.pop()
    if letters:
        return ''.join(letters)
    else:
        return 'Empty String'
