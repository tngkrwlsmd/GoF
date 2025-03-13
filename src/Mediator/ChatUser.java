package Mediator;

class ChatUser extends User {
  public ChatUser(ChatMediator mediator, String name) {
      super(mediator, name);
  }

  @Override
  public void send(String message) {
      System.out.println(name + "님이 보낸 메시지: " + message);
      mediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
      System.out.println(name + "님이 받은 메시지: " + message);
  }
}