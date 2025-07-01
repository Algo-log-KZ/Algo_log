def solution(nums):
    dic = {}
    answer = len(nums)//2
    
    # 1. 폰켓몬을 해시 테이블에 추가
    for n in nums:
        if n in dic:
            dic[n] += 1
        else:
            dic[n] = 1
            
    # 2. 종류 수(해시 테이블의 key 개수)
    kind_count = len(dic)
    # kind_count = len(set(nums))
    
    # 3. 선택 가능한 최대 폰켓몬 종류 수
    return min(kind_count, answer)
