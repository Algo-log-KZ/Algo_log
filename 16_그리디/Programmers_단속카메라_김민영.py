def solution(routes):
    routes.sort(key=lambda x: x[1])
    cameras = 1
    last_camera = routes[0][1]
    
    for start, end in routes[1:]:
        if not (start <= last_camera <= end):
            cameras += 1
            last_camera = end
            
    return cameras
