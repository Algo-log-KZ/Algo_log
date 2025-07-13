def solution(sizes):
    max_value = []
    min_value = []
    
    for i in sizes:
        max_value.append(max(i))
        min_value.append(min(i))
        
    return max(max_value) * max(min_value)
