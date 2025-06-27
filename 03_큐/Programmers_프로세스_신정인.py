from collections import deque

def solution(priorities, location):
    answer = 0
    queue=deque()
    for idx,value in enumerate(priorities):
        queue.append((idx,value))
    while True:
        cur=queue.popleft()
        if any(cur[1]<q[1] for q in queue):
            queue.append(cur)
        else:
            answer+=1
            if cur[0]==location:
                return answer
    return answer
