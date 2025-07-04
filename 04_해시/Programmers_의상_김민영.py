def solution(clothes):
    dic = {}

    for name, kind in clothes:
        if kind not in dic:
            dic[kind] = 1
        else:
            dic[kind] += 1

    answer = 1
    for count in dic.values():
        answer *= (count + 1) # 안 입는 경우를 포함한 경우의 수

    return answer - 1 # 아무것도 안 입은 경우 제외
