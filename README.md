# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

기능 요구사항
- [ ] 사다리 게임에 참여하는 사람에 이름을 최대 5글자 까지 부여할 수 있다.
- [ ] 사다리를 출력할 때 사람 이름도 같이 출력한다.
- [ ] 사람 이름은 쉼표(,)를 기준으로 구분한다.
- [ ] 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다. 
- [ ] 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    - [ ] `|-----|-----|` 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

#### 사다리(Ladder)
사다리는 입력받은 사용자의 수 만큼의 1개 이상의 사다리 라인으로 이루어져 있다.

- [ ] 입력받은 사용자의 수만큼의 사다리 라인으로 구성된다.

#### 사다리 라인(LadderLine)
사다리 라인은 사다리의 세로 줄을 말한다.  
사다리 라인은 사다리의 높이와 각 높이의 세로줄에서  
인접한 다음 세로줄과의 연결여부를 결정하는 가로줄 값(boolean)을 갖는다.  

- [ ] 사다리 라인은 입력받은 높이만큼의 높이를 가진다. (세로)
- [ ] 사다리 라인은 각 세로 줄 마다 가로줄(Line)이 존재하는지의 여부를 갖는다.
    - [ ] 우측 라인 한정
    - [ ] 그래서 마지막 사다리 줄은 가로줄이 존재하지 않는다

#### 높이(height)
사다리 라인의 높이를 결정한다.  

- [ ] 사용자 입력값으로 설정한다.
  
#### 가로줄(Line)
사다리 라인 사이의 연결되어 있는 가로 줄
해당 위치(높이 값)과 연결여부를 알고있다.  

- [ ] 사다리 라인의 인접한 두 세로줄의 연결 여부를 true, false 로 정의한다.
- [ ] 같은 높이의 3개의 세로줄이 연속적으로 연결될 수 없다.
    (즉, 같은 높이에서 연속적인 2개 이상의 가로줄이 존재 할 수 없다.)
           
- [ ] 가로줄은 특별한 생성 규칙을 갖는다.
    - [ ] 같은 위치(높이)에서 이 전 두 사다리 라인의 세로줄이 가로줄로 연결되어 있다면
    다음 세로줄은 이전 세로줄과 가로줄로 연결 할 수 없다.
    (즉, 1번 높이에서 1번 세로줄과 2번 세로줄이 true로 가로줄이 연결되어 있다면
    2번 세로줄과 3번 세로줄은 true로 연결될 수 없다)
    
#### 사다리 게임
사다리 게임은 게임정보와 사다리를 갖고있다.
입력받은 사다리를 활용해 게임정보의 결과를 만들 수 있다.

#### 게임 정보
사다리의 너비에 맞게 위에는 참여자 이름, 아래 영역에는 해당 인덱스의 게임결과를 갖고 있다.
- [ ] 게임정보는 참여자들을 알고 있다.
- [ ] 게임정보는 상품들을 알고 있다.  

#### 참여자
- [ ] 참여자는 이름을 갖고 있다.
- [ ] 참여자의 이름은 5자를 넘어갈 수 없다.
- [ ] 참여자의 수는 상품의 수와 일치해야 한다.

#### 상품
- [ ] 상품은 이름을 갖고 있다.
- [ ] 상품의 수는 참여자의 수와 일치해야 한다.
