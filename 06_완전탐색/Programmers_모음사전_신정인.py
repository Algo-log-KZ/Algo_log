from itertools import product

def solution(word):
    answer = 0
    data=[]
    alpha=['A', 'E', 'I', 'O', 'U']
    for i in range(1,6):
        counts=list(product((alpha), repeat=i))
        for count in counts:
            data.append("".join(list(count)))
    data.sort()
    return data.index(word)+1
