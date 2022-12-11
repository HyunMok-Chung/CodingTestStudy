numbers = [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2];

def solution(numbers, hand):
    answer = '';
    left = '*';
    right = '#';
    keypad = {1:(3,0), 2:(3,1), 3:(3,2), 4:(2,0), 5:(2,1), 6:(2,2), 7:(1,0), 8:(1,1), 9:(1,2), '*':(0,0),
            0:(0,1), '#':(0,2)};
    for i in numbers:
        if i in [1,4,7]:
            answer += 'L';
            left = i;
        elif i in [3,6,9]:
            answer += 'R';
            right = i;
        else:
            leftD = abs(keypad[left][0]-keypad[i][0]) + abs(keypad[left][1]-keypad[i][1]);
            rightD = abs(keypad[right][0]-keypad[i][0]) + abs(keypad[right][1]-keypad[i][1]);
            if leftD>rightD:
                answer += 'R';
                right = i;
            elif rightD>leftD:
                answer += 'L';
                left = i;
            else:
                if hand=='right':
                    answer += 'R';
                    right = i;
                else:
                    answer += 'L';
                    left = i;
    return answer

print(solution(numbers, 'left'))

# 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
# 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
# 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
# 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
# 4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.

# keypad= [[1,2,3],
#         [4,5,6],
#         [7,8,9],
#         ['*',0,'#']]