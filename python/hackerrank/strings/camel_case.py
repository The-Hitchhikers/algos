# https://www.hackerrank.com/challenges/camelcase/problem
import re


def camel_case(s):
    return len(re.findall(r'[A-Z]', s)) + 1
