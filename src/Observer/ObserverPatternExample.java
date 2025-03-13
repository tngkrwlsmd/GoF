package Observer;

public class ObserverPatternExample {
  public static void main(String[] args) {
      NewsAgency agency = new NewsAgency();  // 뉴스 발행자 생성

      Observer reader1 = new NewsReader("Alice");
      Observer reader2 = new NewsReader("Bob");

      agency.subscribe(reader1);  // Alice 구독
      agency.subscribe(reader2);  // Bob 구독

      agency.notifyObservers("🚀 새로운 과학 기술 뉴스가 도착했습니다!");  

      agency.unsubscribe(reader1);  // Alice 구독 취소

      agency.notifyObservers("🌎 오늘의 경제 뉴스 업데이트!");  
  }
}