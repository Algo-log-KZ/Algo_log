def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge=[0]*(bridge_length)
    current_weight=0
    while truck_weights:
        answer+=1
        current_weight-=bridge.pop(0)
        if current_weight+truck_weights[0]<=weight:
            truck=truck_weights.pop(0)
            current_weight+=truck
            bridge.append(truck)
        else:
            bridge.append(0)
    answer+=bridge_length
    return answer
