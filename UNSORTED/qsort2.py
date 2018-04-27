#--
# Quicksort C-style: Not sure it's correct, as it may leave 1 subarray, containing elements, which are not > than pivot (and then sorts it on the next iterations)
#--

# imports

# constants

lst = [9,3,5,3,8,2,7]


def main():
    # shuffle
    sort(0, len(lst)-1)
    print(lst)


def sort(lo, hi):
    i = lo
    j = hi
    k = lo + (hi - lo) // 2

    while i <= j:
        while lst[i] < lst[k]:
            i += 1

        while lst[j] > lst[k]:
            j -= 1

        if i <= j:
            exch(i, j)
            i += 1
            j -= 1

    if j > lo:
        sort(lo, j)
    if i < hi:
        sort(i, hi)


def exch(p, q):
    copy = lst[p]
    lst[p] = lst[q]
    lst[q] = copy


if __name__ == '__main__':
    main()