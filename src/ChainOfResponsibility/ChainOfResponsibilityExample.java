package ChainOfResponsibility;

public class ChainOfResponsibilityExample {
  public static void main(String[] args) {
      // 체인 구성 (팀장 → 부장 → 사장)
      Handler teamLeader = new TeamLeader();
      Handler manager = new Manager();
      Handler ceo = new CEO();

      teamLeader.setNextHandler(manager);
      manager.setNextHandler(ceo);

      // 테스트 요청 (레벨별로 처리자 결정)
      System.out.println("📌 레벨 1 요청:");
      teamLeader.handleRequest(1);  // 🧑‍💼 팀장이 처리

      System.out.println("\n📌 레벨 2 요청:");
      teamLeader.handleRequest(2);  // 👨‍💼 부장이 처리

      System.out.println("\n📌 레벨 3 요청:");
      teamLeader.handleRequest(3);  // 👑 사장이 처리
  }
}