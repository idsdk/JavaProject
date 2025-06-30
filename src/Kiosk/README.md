# 🧠 지식 키오스크 (Kiosk)

Java로 만든 콘솔 기반의 지식 구매 키오스크 프로그램입니다.  
사용자는 주어진 코인을 사용해 다양한 과목의 지식을 구매하고, 개념에 대한 설명을 확인할 수 있습니다.

---

## 📌 주요 기능

- 과목(천문학, 철학, 건축학, 미래학, 물리학) 선택
- 각 과목별 지식 목록 확인
- 지식 선택 후 코인 지불 및 설명 출력
- 코인 차감 및 반복 기능

---

## 🛠 사용 기술

- Java (콘솔 기반)
- 객체지향 설계 (추상 클래스, 상속, 오버라이딩)
- 배열 사용 (List 대신 Knowledge[] 사용)
- 클래스 분리 설계

---

## 🧱 주요 클래스 설명

| 클래스명       | 설명 |
|----------------|------|
| `Knowledge`    | 추상 클래스. 지식의 제목과 가격을 공통으로 정의 |
| `하위 클래스`  | 각 과목별 지식 클래스. 설명 제공을 위해 `getDescription()` 오버라이딩 |
| `Subject`      | 과목 이름과 지식 배열을 저장 |
| `User`         | 코인을 저장하고 지식 구매를 수행 |
| `KioskMain`    | 사용자 입력을 받아 키오스크 전체 흐름을 제어 |

---

## ▶ 실행 방법

1. Java 설치 (JDK 8 이상)
2. 터미널 또는 명령 프롬프트에서 다음 명령어 입력:

```bash
javac Kiosk/*.java
java Kiosk.KioskMain
```

---

## 📂 프로젝트 구조 예시

```
Kiosk/
├── Knowledge.java
├── AstronomyKnowledge.java
├── PhilosophyKnowledge.java
├── ArchitectureKnowledge.java
├── FuturologyKnowledge.java
├── PhysicsKnowledge.java
├── Subject.java
├── User.java
└── KioskMain.java
```

---

## 👋 만든 사람

- 신동경 (Java 콘솔 프로젝트 과제)
- 홍익대학교 편입 전공 준비용 실습

---

## 💡 참고

이 프로젝트는 학문적 흥미와 Java 객체지향 프로그래밍 학습을 겸해 만든 콘솔 기반 미니 키오스크입니다.
