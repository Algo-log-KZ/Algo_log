from itertools import permutations

def solution(k, dungeons):
    answer = -1
    for permutation in permutations(dungeons,len(dungeons)):
        count=0
        hp=k
        for p in permutation:
            if hp>=p[0]:
                hp-=p[1]
                count+=1
                if count>answer:
                    answer=count
    return answer
