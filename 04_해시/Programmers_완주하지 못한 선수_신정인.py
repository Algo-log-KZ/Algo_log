def solution(participant, completion):
    dict1={}
    answer=0
    for p in participant:
        dict1[hash(p)]=p
        answer+=hash(p)
    for c in completion:
        answer-=hash(c)
    return dict1[answer]
