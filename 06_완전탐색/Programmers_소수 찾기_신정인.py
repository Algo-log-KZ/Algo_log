from itertools import permutations

def solution(numbers):
    answer = 0
    nums=[n for n in numbers]
    pmts=[]
    datas=[]
    
    for i in range(1,len(numbers)+1):
        pmts.extend(list(permutations(nums, i)))
        
    for pmt in pmts:
        datas.append(int(("").join(pmt)))
    
    datas=list(set(datas))
        
    for data in datas:
        check=True
        if data>=2:
            for i in range(2,data):
                if data%i==0:
                    check=False
                    break
            if check==True:
                answer+=1
        
    return answer
