def solution(n, lost, reserve):
    data = set(lost)&set(reserve)
    lost=list(set(lost)-data)
    reserve=list(set(reserve)-data)
    
    answer=n-len(lost)
    
    for r in reserve:
        if r-1 in lost:
            lost.remove(r-1)
            answer+=1
        elif r+1 in lost:
            lost.remove(r+1)
            answer+=1
    return answer
