from collections import deque

def bfs(start, visited, graph):
    queue=deque([start])
    count=0
    visited[start]=True
    while queue:
        x=queue.popleft()
        count+=1
        for i in graph[x]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True
    return count

def solution(n, wires):
    answer = n-2
    start=0
    for i in range(len(wires)):
        visited=[False]*(n+1)
        graph=[[] for _ in range(n+1)]
        tmp=wires.copy()
        tmp.pop(i)
        for t in tmp:
            graph[t[0]].append(t[1])
            graph[t[1]].append(t[0])
        for i,g in enumerate(graph):
            if g!=[]:
                start=i
                break
        counts=bfs(start, visited, graph)
        rest=n-counts
        if abs(counts-rest)<answer:
            answer=abs(counts-rest)
    return answer
