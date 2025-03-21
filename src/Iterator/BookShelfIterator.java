package Iterator;

class BookShelfIterator implements Iterator<Book> {
  private BookShelf bookShelf;
  private int index = 0;

  public BookShelfIterator(BookShelf bookShelf) {
      this.bookShelf = bookShelf;
  }

  @Override
  public boolean hasNext() {
      return index < bookShelf.getSize();
  }

  @Override
  public Book next() {
      return bookShelf.getBookAt(index++);
  }
}