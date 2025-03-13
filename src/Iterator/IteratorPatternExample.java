package Iterator;

public class IteratorPatternExample {
  public static void main(String[] args) {
      BookShelf bookShelf = new BookShelf();
      bookShelf.addBook(new Book("디자인 패턴"));
      bookShelf.addBook(new Book("클린 코드"));
      bookShelf.addBook(new Book("자바의 정석"));

      Iterator<Book> iterator = bookShelf.createIterator();

      while (iterator.hasNext()) {
          System.out.println("책 제목: " + iterator.next().getTitle());
      }
  }
}