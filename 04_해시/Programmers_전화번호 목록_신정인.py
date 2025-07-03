def solution(phone_book):
    data={}
    for phone in phone_book:
        data[phone]=1
    for phone in phone_book:
        check=""
        for p in phone:
            check+=p
            if check in data and check!=phone:
                return False
    return True
