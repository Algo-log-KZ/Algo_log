def solution(citations):
    n=len(citations)
    for h in range(n,-1,-1):
        count=sum(1 for c in citations if c>=h) # h번 이상 인용된 논문 수
        if count>=h:
            return h
