# https://inf-ege.sdamgia.ru/problem?id=6969

a = []
n = 2014
for i in range(0, n):
    a.append(int(input()))
k = 0
for i in range(0, round(n / 2)):
    if a[i] + a[n - i - 1] > 20:
        k = k + 1
print(k)

