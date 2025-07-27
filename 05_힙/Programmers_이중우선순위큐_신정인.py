import heapq

def solution(operations):
    answer = []
    heapq.heapify(answer)
    for data in operations:
        d=data.split()
        if d[0]=='I':
            heapq.heappush(answer,int(d[1]))
        elif d[0]=='D' and d[1]=='-1':
            if answer:
                heapq.heappop(answer)
        elif d[0]=='D' and d[1]=='1':
            if answer:
                answer.remove(max(answer))
    if not answer:
        return [0,0]
    else:
        return [max(answer), min(answer)]
