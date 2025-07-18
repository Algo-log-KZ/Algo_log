def solution(brown, yellow):
    for i in range(1, yellow + 1):
        if yellow % i == 0:
            yellow_x = yellow // i
            yellow_y = i
            
            if 2 * yellow_x + 2 * yellow_y + 4 == brown:
                return sorted([yellow_x + 2, yellow_y + 2], reverse=True)
