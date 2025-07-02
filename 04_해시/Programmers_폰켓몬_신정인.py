def solution(nums):
    answer = 0
    data={}
    check=set()
    for n in nums:
        data[n]=data.get(n,0)+1
    for key in data.keys():
        if key not in check and len(check)<len(nums)//2:
            check.add(key)
            answer+=1
    return answer

-----------------------------------------------------------------------------------------------

def solution(nums):
    answer = 0
    n1=len(nums)//2
    data=list(set(nums))
    n2=len(data)
    return min(n1,n2)
