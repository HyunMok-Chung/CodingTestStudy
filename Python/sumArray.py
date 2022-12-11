numbers = [1,4,5,2,6];

def solution(numbers):
    answer = []
    for i in numbers[:-1]: # OutofIndex 에러 피하기 위해 <-1까지만 for문 돌림
        for j in numbers[numbers.index(i)+1:]: #i의 인덱스 다음 부터 더함
            answer.append(i+j);
    answer = list(set(answer)); # set = 중복 없애기, list = 배열 만들어 주기
    answer.sort(); # 오름차순 정렬
    return answer

print(solution(numbers))

# 정수 배열 numbers가 주어집니다.
# numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
# 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.