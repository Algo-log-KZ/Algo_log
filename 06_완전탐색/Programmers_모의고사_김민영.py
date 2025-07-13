def solution(answers):

    answer = [0,0,0]
    data1 = [1,2,3,4,5]
    data2 = [2,1,2,3,2,4,2,5]
    data3 = [3,3,1,1,2,2,4,4,5,5]
    
    for i in range(len(answers)):
        ans = answers[i]
        if(data1[i%len(data1)] == ans):
            answer[0] += 1
        if(data2[i%len(data2)] == ans):
            answer[1] += 1
        if(data3[i%len(data3)] == ans):
            answer[2] += 1     
    
    result = []
    for i in range(len(answer)):
        if(answer[i] == max(answer)):
            result.append(i+1)
    
    return sorted(result)
  
