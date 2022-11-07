from gettext import find
import random
import collections
#import numpy

SIZE = 1000
ARR = []


def main():
    #arr = numpy.random.randint(1,100, SIZE)
    createArr()
    bubbleSort()
    #reverse()
    exist(49)

    #print(ARR)

    # rep = createDict()

    # for i in range(len(rep)):
    #     print(str(i+1) + "-" + str(rep[i+1]))


def createArr():
    for _ in range(SIZE):
        ARR.append(random.randint(1, 2000))


def bubbleSort():
    flag = True
    v = 0

    while flag:
        flag = False
        for i in range(SIZE - 1 - v):
            if ARR[i] > ARR[i+1]:
                (ARR[i], ARR[i+1]) = (ARR[i+1], ARR[i])
                flag = True
        v += 1


def reverse():
    for i in range(int(SIZE / 2)):
        (ARR[i], ARR[SIZE - 1 - i]) = (ARR[SIZE - 1 - i], ARR[i])


def createDict():
    return collections.Counter(ARR)


def exist(target):
    top = SIZE - 1
    base = 0
    half = -1
    comparations = 0

    while base <= top:
        comparations += 1
        half = int((base + top) / 2)
        if target == ARR[half]:
            print("found in "+ str(comparations))
            break
        elif target > ARR[half]:
            base = half + 1
        else:
            top = half - 1       

    if base > top:
        print("not found in " + str(comparations))        


if __name__ == '__main__':
    main()
