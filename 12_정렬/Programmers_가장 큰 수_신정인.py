def solution(numbers):
    answer = ''
    data=[]
    for num in numbers:
        data.append(str(num))
    data=sorted(data, key=lambda x:x*3, reverse=True)
    answer=str(int(''.join(data)))
    return answer
