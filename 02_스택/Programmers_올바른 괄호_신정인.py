def solution(s):
    answer = []
    for data in s:
        if data=="(":
            answer.append(data)
        else:
            if len(answer)==0:
                return False
            elif answer[-1]=="(":
                answer.pop(-1)
            else:
                return False
    if answer.count("(")>0 or answer.count(")")>0:
        return False
    return True
