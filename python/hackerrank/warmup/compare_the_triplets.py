# https://www.hackerrank.com/challenges/compare-the-triplets/problem
def solve(a0, a1, a2, b0, b1, b2):
    alice = [a0, a1, a2]
    bob = [b0, b1, b2]
    alice_score = 0
    bob_score = 0
    for x in range(len(alice)):
        if alice[x] > bob[x]:
            alice_score += 1
        if bob[x] > alice[x]:
            bob_score += 1
    return "{}{}".format(alice_score, bob_score)

print(solve(5, 6, 7, 3, 6, 10))
