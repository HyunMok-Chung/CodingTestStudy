
s = 'two4seveneightzero'

def solution(s):
    if  bool(s.find('zero')) == True or s.find('zero')==0:
        s = s.replace('zero', '0');
    if bool(s.find('one')) == True or s.find('one')==0:
        s = s.replace('one', '1');
    if bool(s.find('two')) == True or s.find('two')==0:
        s = s.replace('two', '2');
    if bool(s.find('three')) == True or s.find('three')==0:
        s = s.replace('three', '3');
    if bool(s.find('four')) == True or s.find('four')==0:
        s = s.replace('four', '4');
    if bool(s.find('five')) == True or s.find('five')==0:
        s = s.replace('five', '5');
    if bool(s.find('six')) == True or s.find('six')==0:
        s = s.replace('six', '6');
    if bool(s.find('seven')) == True or s.find('seven')==0:
        s = s.replace('seven', '7');
    if bool(s.find('eight')) == True or s.find('eight')==0:
        s = s.replace('eight', '8');
    if bool(s.find('nine')) == True or s.find('nine')==0:
        s = s.replace('nine', '9');

    answer = int(s);
    return answer;

print(solution(s));