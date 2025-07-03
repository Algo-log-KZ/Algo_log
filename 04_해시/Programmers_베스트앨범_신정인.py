def solution(genres, plays):
    answer = []
    dict1={} #장르:(고유번호, 재생수)
    dict2={} #장르:누적 재생수
    
    for i in range(len(genres)):
        dict2[genres[i]]=dict2.get(genres[i],0)+plays[i]
        
    for i in range(len(genres)):
        if genres[i] in dict1:
            dict1[genres[i]].append((i,plays[i]))
        else:
            dict1[genres[i]]=[(i,plays[i])]
    
    for (genre, value) in sorted(dict2.items(), key=lambda x:x[1], reverse=True):
        for (i,play) in sorted(dict1[genre], key=lambda x:x[1], reverse=True)[:2]:
            answer.append(i)
    return answer
