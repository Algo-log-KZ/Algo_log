import heapq

def solution(operations):
    answer = []
    for i in operations:
        if i[0] == "I":
            heapq.heappush(answer,int(i[2:]))
        elif i == "D -1" and answer:
            heapq.heappop(answer)
        elif i == "D 1" and answer:
            max_val = max(answer)
            answer.remove(max_val)

    if answer:
        return [max(answer), min(answer)]
    else:
        return [0,0]
