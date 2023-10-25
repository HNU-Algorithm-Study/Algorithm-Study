import sys
n = int(sys.stdin.readline())
com=[list(sys.stdin.readline().split()) for _ in range(n)]

queue=[]

for i in com:
    lenQ = len(queue)
    if i[0] == 'push':
        queue.append(i[1])
    elif i[0] == 'pop':
        if lenQ == 0:
            print(-1)
        else:
            print(queue[0])    
            queue.pop(0)
    elif i[0] == 'size':
        print(lenQ)
    elif i[0] == 'empty':
        if lenQ == 0:
            print(1)
        else:
            print(0)
    elif i[0] == 'front':
        if lenQ == 0:
            print(-1)
        else:
            print(queue[0])
    elif i[0] == 'back':
        if lenQ == 0:
            print(-1)
        else:
            print(queue[-1])
