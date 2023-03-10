# Witing
Final Project by Team1 FJ
> [Witing 시연 영상](https://www.youtube.com/watch?v=NSLSuna8mqU)
<p align="center"><img src="Witing/witing/src/main/resources/static/images/readme/logo_readme.png" width="300" height="300"/></p>


## 1. 프로젝트 주제
- 네이버 AI 플랫폼과 숙박, API(지도,결제,숙박 데이터, 본인인증, SNS 로그인), 웹소켓 활용하여 여행 관련 숙박, 동행 서비스를 제공하는 웹사이트 ‘ Witing : With + -ing ’

![main_page](Witing/witing/src/main/resources/static/images/readme/main_page.png)


## 2. 프로젝트 목적
> 기능 및 협업 <br>
- 트렌드에 맞는 여행지와 숙박시설로 이루어진 숙박상품을 제공하여 취향에 맞는 숙박예약과 동행 서비스를 이용할 수 있는 웹사이트를 개발하는 것 
- 협업을 통해 반응형 웹사이트를 구현
- 숙박 예약 기능과 동행 서비스 기능에 맞는 화면 디자인 및 데이터베이스 설계
- 팀원 모두 프론트와 백엔드 프로세스를 이해하여 프로젝트 완성
- Thymeleaf, MyBatis 를 이용해 동적인 화면 구현
- MySQL을 이용하여 데이터 베이스를 구축하고 Spring Container와 연결
- 자바 개발도구와 통합개발환경(IDE : Intergarated Development Environment) 사용
- ERD Cloud와 Notion, Github을 사용한 협업 경험
> 차별점 <br>
- 동행 게시물을 작성시 다른 사이트와 차별점을 두기 위하여 동행 일정을 동적으로 작성 가능하며, 작성한 일정이 지도에 표시될 수 있도록 구현
- 동행시 성향이 맞는 분과 매칭될 수 있도록 '동행 MBTI' 라는 아이디어를 추가하여 구현



## 3. 시스템 구성도 / 개발 사용 도구
![system_structure](Witing/witing/src/main/resources/static/images/readme/system_structure.png)

|                            언어                            |                 개발도구                  |    Database    |                           협업도구                           |          Framework          |         Server          |
|:--------------------------------------------------------:|:-------------------------------------:|:--------------:|:--------------------------------------------------------:|:---------------------------:|:-----------------------:|
| Java<br/>HTML5<br/>CSS3<br/>JavaScript<br/>XML<br/>AJAX  | Eclipse 2020-12<br/>SpringBoot 2.7.4  |  MySQL 8.0.17  | Github<br/>Zoom<br/>Google Docs<br/>Notion<br/>ERD Cloud | Thymeleaf<br/>Mybatis 3.2.2 | NCP(Naver Cloud Platform)<br/>Apache Tomcat |

<br>

![tool](Witing/witing/src/main/resources/static/images/readme/tool.jpg)


## 4. 데이터베이스 설계
> 15개의 테이블 사용  <br>

![erd](Witing/witing/src/main/resources/static/images/readme/erd.jpg)



## 5. 프로젝트 기능 구현
> USER PAGE <br>

![plan](Witing/witing/src/main/resources/static/images/readme/user_page.jpg)

> ADMIN PAGE <br>

![plan](Witing/witing/src/main/resources/static/images/readme/admin_page.png)

## 6. 프로젝트 구성원 및 역할
| 이름 |                                      <center>USER PAGE                                      |<center>ADMIN PAGE|
| :---: |:-------------------------------------------------------------------------------------------:|:---:|
|공통|                       <center>ERD 설계 및 각 테이블 DTO,CRUD 구현, API 데이터 확인                        |
|김희연| <center>메인, 회원가입, 로그인, 쿠폰, 예약/결제 페이지<br>웹소켓을 통한 실시간 예약반영 기능<br>NCP chatbot 기능을 이용한 챗봇 문의 기능 |회원가입, 로그인, 나라별 수요 통계차트 페이지|
|배단비|          <center>상품 목록, 상품 상세, 좋아요, 동행글 목록, 동행글 작성, 댓글 기능, About 페이지<br>동행 MBTI 기능          |회원 목록/수정 페이지|
|전경민|                      <center>마이페이지, Q&A 목록/작성, 리뷰 목록/작성 페이지<br>본인인증 기능                      |Q&A 답변, 매출 통계 차트 페이지|



## 7. 프로젝트 수행 기간
> 2022.10.24 ~ 2022.12.16(8주)

![plan](Witing/witing/src/main/resources/static/images/readme/plan.png)


## 8. 웹 구성화면

- 모바일 메인페이지

<img src="Witing/witing/src/main/resources/static/images/readme/IMG_3593.GIF" width="350"/>
	- 지역별로 호텔 정보를 볼 수 있도록 구분되어 있습니다.<br>
	- 지역, 날짜, 카테고리를 선택하여 호텔을 검색할 수 있고, 날짜를 선택하여 동행을 검색할 수 있습니다.<br>
<br><br>

- 모바일 챗봇 페이지

<img src="Witing/witing/src/main/resources/static/images/readme/chatbot.gif" width="350"/>
	- NCP Chatbot 서비스를 이용한 실시간 챗봇 문의 기능입니다.<br>
	- 질문을 NCP 서버에 추가하여 AI를 통해 질문에 대한 답변을 받을 수 있습니다.<br>
<br><br>

- 모바일 호텔페이지

<img src="Witing/witing/src/main/resources/static/images/readme/IMG_3598.GIF" width="350"/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Witing/witing/src/main/resources/static/images/readme/likenhotel.gif" width="350"/>
	- 호텔 리스트를 볼 수 있습니다.<br>
	- 하트 아이콘을 클릭하여 좋아요에 추가 가능하며 하트 아이콘을 다시 누르면 삭제가능합니다.<br>
	- 호텔을 선택하여 들어갈 경우 호텔 상세페이지가 나와 객실을 확인할 수 있습니다.<br>
<br><br>

- 모바일 웹소켓 예약화면

<img src="Witing/witing/src/main/resources/static/images/readme/reserv.GIF" width="350"/>
	- WebSocket을 사용하여 실시간 예약이 반영되도록 하였습니다.<br>
	- 예약하려는 호텔을 서로 다른 사용자가 보고 있을때 한명의 사용자가 예약을 완료할 경우 캘린더에 표시됩니다.<br>
	- 예약된 날짜는 선택되지 않습니다.<br>
	- 날짜와 인원수를 선택하면 가격이 자동으로 반영됩니다.<br>
<br><br>



- 모바일 동행글 작성 페이지

<img src="Witing/witing/src/main/resources/static/images/readme/wrtieaplus.gif" width="350"/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Witing/witing/src/main/resources/static/images/readme/accomgif.gif" width="350"/>
	- 원하는 동행글을 클릭하면 게시글을 쓴 작성자의 본인이증 여부와 여행 MBTI를 확인할 수 있습니다.<br>
	- 동행 일정과 카카오맵에 동행하려는 위치가 피봇으로 표시되어 있습니다.<br>
	- 동행 게시글 작성시 + 아이콘을 눌러 동적으로 일정을 추가할 수 있습니다.<br>
	- 동적으로 입력하기 위해 javascript의 'document.getElementById('addplan').appendChild(div);'를 사용하였습니다.<br>
<br><br>


- MBTI 검사 & 결과페이지

<img src="Witing/witing/src/main/resources/static/images/readme/mbti.gif" width="350"/>
	- 동행을 할때에 서로의 여행 스타일을 파악하기 위해 추가한 여행 MBTI 기능입니다.<br>
	- 12개의 질문을 통해 여행 MBTI를 분석합니다.<br>
	- MBTI는 여러번 다시 진행할 수 있으며 동행 게시글에 작성자의 MBTI가 표시됩니다.<br>
<br>



## 9. 트러블 슈팅
| 이름 | <center>Trouble                                                                                                                                                                                                                                                                                                                             | <center>Solution                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| :---: |---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|김희연| 프로젝트를 생성하여 테스트를 진행하려고 할 때에 테스트가 진행되지 않음, 원인은 프로젝트 생성시 패키지 명에 예약어인 'final'을 사용함<hr>유저 페이지에서 회원가입을 할 때의 생일을 날짜 형식인 DATE 로 받아오는것에 오류 발생, 원인은 데이터 형식이 맞지 않는다는 오류<hr><br/>naver 로그인 연동시 개인 정보<br/><hr><br/>카카오 로그인이 안 된 이유<br/><br/>                                                                                                             | <br/>패키지 명을 'multi'로 수정하여 재생성 후 테스트 진행되는 것을 확인하여 깃 리포지토리와 연결<br/><br/><hr><br/>@DateTimeFormat(pattern = "yyyy-MM-dd")를 사용하여 데이터 형식을 맞추어서 회원가입 가능하도록 수정<br/><br/><hr><br/> naver 로그인 연동할 때사용자의 birthyear, mobile정보를 알기 위해서는 jdk1 버전이 아닌 jdk2 버전을 사용해야 함<br/><br/><hr><br/>name을 안 담고 사용하고자 하여 nullexception이 나왔고 birthday 형식이 "mm-dd"가 아닌 "mmdd"을 사용                                                                                                                                                                                                                                                                                                                                                                                                                                    |
|배단비| 카카오맵을 사용하기 위해 JS 파일을 추가하였지만 연동되지 않음<br/><br/><hr><br/>댓글 수정, 삭제 버튼 클릭시 하나만 클릭되는 문제<br/><br/><hr>페이징 처리 구현시, 글 5개가 한페이지 기준일 때, 게시글이 11~14개인 경우 3페이지가 나타나지 않고 2페이지까지만 나옴.<br/><hr>mbti 검사 했을 때는 클릭시 결과화면을, 검사 안했을 때는 검사화면을 띄우려고 했으나 로그아웃 하려고 하면 type을 찾지 못하는 에러가 발생함(session.logincust.type 사용)<hr><br/>호텔 검색 시, 카테고리와 지역에 해당하는 호텔이 제외되어서 검색됨 | "\<div id="map" style="width:100%;height:350px;"\>\</div\>"와 javascript 순서 때문에 안 나타나는 것으로 파악하여 JS 전체를 아래로 내림<hr>onclick()을 사용하고 id마다 타임리프를 이용해서 고유한 번호를 부여함, 수정 클릭시 onclick으로 받아온 replyid를 스크립트로 받아와서 부여받은 고유번호를 이용해 출력함<br>Ex) th:id=”│comment_reply${reply.replyid}│”, th:id="│modal_update${reply.replyid}│”<hr>PageDTO에 전체 마지막 페이지 번호 코드의 괄호를 씌워서 해결 <br><br/>int realEnd = (int)(Math.ceil(total * 1.0) / cri.getAmount());<br/>↓<br/>int realEnd = (int)(Math.ceil((total * 1.0) / cri.getAmount()));<hr><br/>session.logincust.type을 사용하지 않고 ajax를 이용해서 컨트롤러에 gettype을 생성해서 해결<br/><br/><hr>xml에서 INNER JOIN된 orderlist를 삭제하고 NOT IN으로 예약 날짜된 날짜의 orderlist를 roomid로 가져와서 해결<br/>→ AND ro.roomid NOT IN (SELECT roomid FROM orderlist WHERE sdate BETWEEN #{sdate} AND #{edate}) |
|전경민| 이메일 본인인증 기능 구현 시 메일 발송 오류<br/><br/><hr>버튼을 클릭 시 페이지 이동을 구현 할 때 `<a>`태그를 사용하면 템플릿의 css적용이 해제됨<hr><br/>ajax를 이용해 controller로 파라미터 두개를 못 넘겨주는 문제<br/><br/><hr>리뷰작성 하기 전에 예약내역 인증 과정에서 OCR기능 구현 시 로컬에서는 되는데 서버에 올릴 시 파일 저장만 되고 OCR기능이 안됨                                                                                                                            | 구글 계정으로 이메일을 발송하려면 구글 계정 설정에서 보안 수준이 낮은 앱의 엑세스 허용을 해줘야 하는데, 이 설정을 사용하지 못하도록 2022.06월 경부터 정책이 바뀐것으로 확인하여 계정설정에서 2단계 인증 사용 및 앱 비밀번호를 생성해주어 해결<hr><br/>`<a>`태그 대신 onclick을 사용<br/><br/><hr>하나만 넘겨주는 경우 - 'action':'[[@{/mypage(custid=${cust.custid})}]]'<br/>두개 넘겨주는 경우 - 'action':'[[@{/mypage?custid=}]]'+'[[@{${cust.custid}}]]'+'&'+'[[@{certification=1}]]'<br/>->팀원간의 도움으로 문법을 이해해서 해결<hr>OCR 기능 시 저장된 파일명을 불러와야하는데 파일이 저장된 로컬경로와 서버경로가 달라서 경로를 수정해서 해결<br/>static String imgpath = "/root/tomcat/webapps/ROOT/WEB-INF/classes/static/images";<br/><br/>                                                                                                                                                                                                                                      |
