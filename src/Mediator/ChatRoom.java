package Mediator;

import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {
  private List<User> users = new ArrayList<>();

  @Override
  public void addUser(User user) {
      users.add(user);
  }

  @Override
  public void sendMessage(String message, User sender) {
      for (User user : users) {
          if (user != sender) {  // 자기 자신에게는 메시지를 보내지 않음
              user.receive(message);
          }
      }
  }
}