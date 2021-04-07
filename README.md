# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

---

* 구현 할 기능 목록
1. [test] 로또번호 생성 테스트 추가

2. [feat] 로또번호 생성 기능 구현

3. [test] 로또 번호 생성 exception 테스트

4. [feat] 로또 번호 exception 기능 구현

5. [test] 로또 일급 컬렉션 생성 테스트

6. [feat] 로또 일급 컬렉션 생성 기능 구현

7. [test] 일급 컬렉션 로또 번호 6개 발급 테스트

8. [feat] 일급 컬렉션 로또 번호 6개 발급 기능 구현

9. [feat] InputView, ResultView 클래스 구현

10. [test] 당첨 통계 테스트

11. [feat] 당첨 통계 구현

12. [refactor] 전반적인 리팩토링


---------------

step3

1. 2등 번호 클래스 생성 테스트 및 구현

2. 수익률 통계에 2등에 관한 값 추가 테스트 및 구현

---------------

step4(모든 원시값과 문자열은 포장, 예외처리를 통해 에러가 발생하지 않도록 한다.)

1. 수동으로 로또 생성 - 1,2,3,4,5,6 , 6개 숫자가 아니고 다른 문자, 중복숫자 예외 처리
, 구입한 금액보다 수동으로 구매 할 로또 수가 많을 시 예외 처리

2. 총 입력한 금액에 맞게 수동으로 로또 생성, 이외에 남은 금액은 자동으로 로또 생성






