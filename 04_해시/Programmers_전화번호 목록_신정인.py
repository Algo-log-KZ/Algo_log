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
    
----------------------------------------------------------------------

def solution(phone_book):
    phone_book.sort()
    answer = True
    for p1, p2 in zip(phone_book, phone_book[1:]):
        if p2.startswith(p1):
            return False
    return answer
