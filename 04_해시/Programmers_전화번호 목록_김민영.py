def solution(phone_book):
    dic = {}
    
    # 1. 모든 전화번호를 해시 테이블에 저장
    for p in phone_book:
        dic[p] = True
    
    # 2. 각 번호의 접두어가 다른 번호로 시작하는지 확인
    for p in phone_book:
        prefix = ""
        for i in range(1, len(p)):
            prefix = p[:i]
            if prefix in dic:
                return False
    """       
    phone_book.sort()

    for i in range(len(phone_book) - 1):
        if phone_book[i+1].startswith(phone_book[i]):
            return False
    """ 

    return True
