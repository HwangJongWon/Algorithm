import sys
#sys.stdin=open("input.txt","rt")
testcase=int(input())
for i in range(testcase):
    n, s ,e ,k=map(int, input().split())
    a=list(map(int, input().split()))
    a = a[s-1:e]
    a.sort()
    print("#%d %d" %(i+1, a[k-1]))