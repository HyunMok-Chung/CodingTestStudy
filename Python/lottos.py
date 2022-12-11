lottos = [0, 0, 0, 0, 0, 0];
win_nums = [38, 19, 20, 40, 15, 25];


def solution(lottos, win_nums):
    max_count = 0;
    min_count = 0;
    rank = [6, 6, 5, 4, 3, 2, 1]

    for i in lottos:
        if(i == 0):
            max_count += 1;
        for j in win_nums:
            if i == j:
                max_count += 1;
                min_count += 1;
    answer = [rank[max_count], rank[min_count]];
    return answer

print(solution(lottos, win_nums));

# result = [3, 5]가 나와야함