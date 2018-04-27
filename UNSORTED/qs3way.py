#--
# Quicksort 3-way partitioning
#--

# imports

# constants

lst = [1,6,7,3,5,4,4,8,0,0,3,6,4,5,9,6,2,4,9,6,0,6]


def main():
    # shuffle
    sort(0, len(lst)-1)
    print(lst)


def sort(lo, hi):
    if lo >= hi:
        return

    lt = lo
    gt = hi
    i = lo

    while i <= gt:
        if lst[i] < lst[lt]:
            exch(i, lt)
            i += 1
            lt += 1
        elif lst[i] > lst[lt]:
            exch(i, gt)
            gt -= 1
        else:
            i += 1

    sort(lo, lt - 1)
    sort(gt + 1, hi)


def exch(p, q):
    copy = lst[p]
    lst[p] = lst[q]
    lst[q] = copy


if __name__ == '__main__':
    main()