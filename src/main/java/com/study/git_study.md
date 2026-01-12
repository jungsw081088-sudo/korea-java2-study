# git이란?
- 파일 버전 관리 툴(소프트웨어)

## git 명령어
1. 로컬환경 셋팅
- 내 프로젝트를 git이 추적하게 함: git init
- 현재 프로젝트 작업자의 서명 등록: 
- git config (--global(모든 프로젝트)) user.name 내 아이디
- git config user.email 내 이메일

2. 변경사항 저장
- 변경사항에 대해 임시영역에 저장(=스테이징영역에 올린다): git add
- 모든 변경사항(빨간글자 파일)을 임시영역에 저장: git add .
- 임시영역에 있는 변경사항들을 하나의 버전으로 포장: git commit -m"메세지"

3. 원격저장소 연결
- 최초 연결시에만 수행해주면 된다
- git remote add origin 원격레포지토리주소

4. 원격저장소에 업로드
- commit들을 원격저장소에 저장: git push
- 최초 push시, git push -u origin main

5. 원격저장소에 있는 프로젝트 다운로드
- git clone 원격레포지토리 주소

---
윈도우 환경, 다른사람들이 같이 사용하는 pc일경우
-> 입력한 토큰은 window가 저장하고 있음
-> 자격 증명 관리자에서 삭제할 수 있음

Ctrl + Alt + L -> 정렬
알아서 살아라 : 토큰

https://github.com/elikese / 강사님 깃허브 https://github.com/jungsw081088-sudo/korit_web1_java / 내 깃허브