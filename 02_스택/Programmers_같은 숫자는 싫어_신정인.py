def solution(arr):
    answer = []
    data=-1
    for a in arr:
        if a!=data:
            answer.append(a)
            data=a
    return answer
