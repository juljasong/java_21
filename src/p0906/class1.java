package p0906;

public class class1 {

  public static void main(String[] args) {
    
    Book b_voyage = new Book();
    b_voyage.setTitle("여행자");
    b_voyage.setPage(415);
    b_voyage.setPublisher("민음사");
    b_voyage.setPrice(11500);
    
    System.out.println(b_voyage.getTitle());
    
  }
}

class Book {
  String title;
  int page;
  String publisher;
  int price;
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getPage() {
    return page;
  }
  public void setPage(int page) {
    this.page = page;
  }
  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  
}