import math


def main():
    print(fib(1000))


def fib(n):
    p = (1 + math.sqrt(5)) / 2
    r = math.ceil(math.pow(p, n)) / math.sqrt(5)
    return int(r)


def fibI(n):
    a = 0
    b = 1
    aux = -1

    for i in range(n):
        aux = a + b
        a = b
        b = aux

    return a


def fibR(n):
    if n < 2:
        return n

    return fibR(n-1) + fibR(n-2)


if __name__ == '__main__':
    main()
