#--
# Quicksort
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

    j = partition(lo, hi)
    sort(lo, j-1)
    sort(j+1, hi)
    pass


def partition(lo, hi):
    i = lo + 1
    j = hi

    while True:
        while lst[i] < lst[lo]:
            i += 1
            if i >= hi:
                break

        while lst[j] > lst[lo]:
            j -= 1
            if j <= lo: # redundant
                break

        if i >= j: # j stands on hi border of less-than-pivot part
            break

        exch(i, j)
        i += 1
        j -= 1

    exch(lo, j)
    return j


def exch(p, q):
    copy = lst[p]
    lst[p] = lst[q]
    lst[q] = copy


if __name__ == '__main__':
    main()