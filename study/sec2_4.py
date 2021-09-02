import sys
#sys.stdin=open("input.txt","rt")

n=int(input())
a=list(map(int, input().split()))
ave=round(sum(a)/n)
min=214700000
for idx, x in enumerate(a):
    tmp=abs(x-ave)
    if tmp<min:
        min=tmp
        score=x
        res=idx+1
    elif tmp==min:
        if x>score:
            min=tmp
            score=x
            res=idx+1
        elif x==score:
            if idx<res:
                min=tmp
                
                res=idx+1

print("%d %d" %(ave, res))
    
