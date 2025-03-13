package Observer;

interface NewsPublisher {
  void subscribe(Observer observer);  // 구독 추가
  void unsubscribe(Observer observer);  // 구독 해지
  void notifyObservers(String news);  // 모든 구독자에게 알림
}