array = [1, 5, 2, 6, 3, 7, 4];
commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]];

def solution(array, commands):
    answer = []
    # print(len(commands[0]))
    for a in commands:
        sort = array[a[0]-1:a[1]]
        sort.sort();  # 배열 정렬
        answer.append(sort[a[2]-1])
    return answer

print(solution(array, commands));

# array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
# 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
# 2에서 나온 배열의 3번째 숫자는 5입니다.