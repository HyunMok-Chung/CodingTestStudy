new_id = '=.=';

def solution(new_id):
    new_id = new_id.lower(); # 1단계 : 대문자 -> 소문자

    new_id = list(new_id);
    for i in new_id[:] : #2단계 : 조건 만족
        if (not(i=='-' or i=='.' or i=='_' or ('0'<=i<='9') or ('a'<=i<='z'))):
            new_id.remove(i);
    
    new_id = ''.join(new_id); #3단계 : 연속 . 지우기
    while '..' in new_id:
        new_id = new_id.replace('..', '.');

    if len(new_id)>0 and new_id[0] == '.' : #4단계 : 처음 . 마지막 . 지우기
        new_id = new_id[1:];
    if len(new_id)>0 and new_id[-1] == '.' : #빈문자열은 인덱스가 존재하지 않음 -> index 오류 발생
        new_id = new_id[:-1];

    if len(new_id) == 0 : #5단계 : 빈 문자열이라면 new_id에 a삽입
        new_id = ''.join('a');
    
    if len(new_id)>=16 :
        n = len(new_id)-15;
        new_id = new_id[:-n];
    if len(new_id)>0 and new_id[-1] == '.' :
        new_id = new_id[:-1];

    while len(new_id)<3:
        new_id += new_id[-1];

    answer = new_id;
    return answer

# new_id = input("아이디를 입력하시오. : ");
print(solution(new_id));

# 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
# 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
# 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
# 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
# 5단계 빈 문자열이라면 new_id에 a삽입합니다.
# 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
#      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
# 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.