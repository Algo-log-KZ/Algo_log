import math

def solution(progresses, speeds):
    answer = []
    data=[]
    for i in range(len(progresses)):
        progress=progresses[i]
        speed=speeds[i]
        data.append(math.ceil((100-progress)/speed))
    while data:
        count=1
        d=data.pop(0)
        while data and d>=data[0]:
            count+=1
            data.pop(0)
        answer.append(count)
    return answer
