# https://inf-ege.sdamgia.ru/problem?id=3650

a = []
n = 30
for i in range(0, n):
    a.append(int(input()))
max = -21
for i in range(0, n):
    if a[i] < 0 and a[i] > max:
        max = a[i]
print(max)


