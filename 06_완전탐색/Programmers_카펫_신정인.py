def solution(brown, yellow):
    answer = []
    data=brown+yellow
    for i in range(1,data+1):
        if data%i==0:
            d=[]
            d.append(i)
            d.append(data//i)
            d.sort(reverse=True) #가로, 세로
            print(d)
            if 2*(d[0]+d[1])-4==brown and (d[0]-2)*(d[1]-2)==yellow:
                answer.append(d[0])
                answer.append(d[1])
                break
    return answer
            

# brown=2*(가로+세로)-4
# yellow=(가로-2)*(세로-2)
# = 가로*세로-2*(가로+세로)+4
# = 가로*세로-brown
# yellow+brown=가로*세로
# 가로>=세로
