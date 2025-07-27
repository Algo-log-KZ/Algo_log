import heapq

def solution(jobs):
    answer, now ,i= 0, 0, 0#now: 현재 시각
    start = -1 #바로 이전에 작업을 완료한 시간
    heap = []
    
    while i<len(jobs):
        # 현재 시점에서 처리할 수 있는 작업을 heap에 저장
        for job in jobs: #(요청시점, 작업시간)
            if start < job[0] <= now:
                heapq.heappush(heap, [job[1], job[0]]) #(작업시간, 요청시점)
        
        if len(heap)>0: # 처리할 작업이 있는 경우
            cur = heapq.heappop(heap) #(작업시간, 요청시점)
            start = now
            now += cur[0] #작업시간
            answer += now - cur[1] # 현재 시각-요청시점
            i+=1
        else: # 처리할 작업이 없는 경우 다음 시간을 넘어감
            now += 1
                
    return answer // len(jobs)
