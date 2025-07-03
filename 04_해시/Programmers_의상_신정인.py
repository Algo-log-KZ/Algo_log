def solution(clothes):
    answer = 1
    data={}
    for cloth in clothes:
        data[cloth[1]]=data.get(cloth[1],0)+1
    for value in data.values():
        answer*=(value+1)
    return answer-1
