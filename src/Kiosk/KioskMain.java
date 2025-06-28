package Kiosk;
import java.util.Scanner;

public class KioskMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coin = 10;

        Subject[] subjects = new Subject[] {
                new Subject("천문학", new Knowledge[] {
                        new AstronomyKnowledge("별의 탄생", 2),
                        new AstronomyKnowledge("Ⅰa형 초신성 폭발", 4)
                }),
                new Subject("철학", new Knowledge[] {
                        new PhilosophyKnowledge("존재론", 3),
                        new PhilosophyKnowledge("니체의 허무주의", 3)
                }),
                new Subject("건축학", new Knowledge[] {
                        new ArchitectureKnowledge("가로", 3),
                        new ArchitectureKnowledge("건축적 산책", 2)
                }),
                new Subject("미래학", new Knowledge[] {
                        new FuturologyKnowledge("포스트휴먼", 4),
                        new FuturologyKnowledge("특이점", 2)
                }),
                new Subject("물리학", new Knowledge[] {
                        new PhysicsKnowledge("앤트로피", 4),
                        new PhysicsKnowledge("양자역학", 3)
                })
        };

        System.out.println("지식 키오스크에 오신 걸 환영합니다!");
        System.out.println("현재 보유 코인: " + coin + "개\n");

        while (true) {
            System.out.println(" 선택 가능한 과목 목록:");
            for (int i = 0; i < subjects.length; i++) {
                System.out.println((i + 1) + ". " + subjects[i].getName());
            }
            System.out.println("0. 종료");

            System.out.print("과목 번호 선택 > ");
            int subjectChoice = scanner.nextInt();
            if (subjectChoice == 0) break;

            if (subjectChoice < 1 || subjectChoice > subjects.length) {
                System.out.println("잘못된 선택입니다.\n");
                continue;
            }

                Subject selectedSubject = subjects[subjectChoice - 1];
                Knowledge[] knowledge = selectedSubject.getKnowledges();

            System.out.println("\n [" + selectedSubject.getName() + "]의 지식 목록:");
            for (int i = 0; i < knowledge.length; i++) {
                System.out.println((i + 1) + ". " + knowledge[i].getTitle() + " (" + knowledge[i].getPrice() + "코인)");
            }
            System.out.println("0. 뒤로가기");

            System.out.print("구매할 지식 번호 > ");
            int knowledgeChoice = scanner.nextInt();
            if (knowledgeChoice == 0) continue;

            if (knowledgeChoice < 1 || knowledgeChoice > knowledge.length) {
                System.out.println("잘못된 선택입니다.\n");
                continue;
            }

            Knowledge selectedKnowledge = knowledge[knowledgeChoice - 1];
            if (selectedKnowledge.getPrice() > coin) {
                System.out.println("코인이 부족합니다.\n");
            } else {
                coin -= selectedKnowledge.getPrice();
                System.out.println("[" + selectedKnowledge.getTitle() + "] 지식을 구매했습니다!");
                System.out.println("설명: " + selectedKnowledge.getDescription());
                System.out.println("남은 코인: " + coin + "개\n");
            }
        }

        System.out.println("\n이용해주셔서 감사합니다!");
    }
}