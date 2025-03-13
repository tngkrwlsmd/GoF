package Iterator;

import java.util.ArrayList;
import java.util.List;

interface Iterator<T> {
  boolean hasNext();  // 다음 요소가 있는지 확인
  T next();  // 다음 요소 반환
}

interface Aggregate<T> {
  Iterator<T> createIterator();  // Iterator 반환
}

class BookShelf implements Aggregate<Book> {
  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
      books.add(book);
  }

  @Override
  public Iterator<Book> createIterator() {
      return new BookShelfIterator(this);
  }

  public int getSize() {
      return books.size();
  }

  public Book getBookAt(int index) {
      return books.get(index);
  }
}