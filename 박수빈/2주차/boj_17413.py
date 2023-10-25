import sys

s = list(map(str, sys.stdin.readline().strip()))

result = "" #결과 문자열 초기화
word = "" # 현재 단어 저장
reverse = True 

for c in s: # 이력 문자열을 문자 단위로

    if c == '<':
        reverse = False # 문자열 뒤집기 해제
        result += word 
        word = c
        #현재 단어 추가하소 word 변수 <로 초기화

    elif c == '>':
        reverse = True
        result += (word + '>')
        word = ""
         # 현재 단어,>추가 word 변수 초기화

    elif c == ' ':
        result += word + c
        word = ""

    elif reverse:
        word = c + word
        #현재 문자열 뒤집기

    else:
        word += c
        # 일반 문자인때 현재 문자 word

result += word
print(result)