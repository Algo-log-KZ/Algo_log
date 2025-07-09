def solution(answers):
    result = []
    data1=[1, 2, 3, 4, 5]
    data2=[2, 1, 2, 3, 2, 4, 2, 5]
    data3=[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    count=[0,0,0]
    for i,answer in enumerate(answers):
        if answer==data1[i%(len(data1))]:
            count[0]+=1
        if answer==data2[i%(len(data2))]:
            count[1]+=1
        if answer==data3[i%(len(data3))]:
            count[2]+=1
    for i,c in enumerate(count):
        if c==max(count):
            result.append(i+1)
    return result
