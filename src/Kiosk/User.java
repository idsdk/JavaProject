package Kiosk;

public class User {
    private int coin;

    public User(int coin) {
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    public void deductCoin(int amount) {
        coin -= amount;
    }

    public boolean purchase(Knowledge knowledge) {
        if (coin >= knowledge.getPrice()) {
            deductCoin(knowledge.getPrice());
            System.out.println("[" + knowledge.getTitle() + "] 개념을 구매했습니다!");
            System.out.println("개념 설명: " + knowledge.getDescription());
            System.out.println("현재 남은 코인: " + coin + "개\n");
            return true;
        } else {
            System.out.println("코인이 부족합니다. 현재 코인: " + coin + "개\n");
            return false;
        }
    }
}