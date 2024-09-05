public class Book extends LibraryItem{
    private String author;
    private int pages;


    public Book(String title, String itemId, String author, int pages) {
    super (title,itemId);
    this.author = author;
    this.pages = pages;
    }

    @Override
    public void checkOut(){
        if(!isCheckedOut){
            isCheckedOut=true;
        }
    }

    @Override
    public void returnItem(){
        if(isCheckedOut){
            isCheckedOut=false;
        }
    }

    @Override
    public void printDetails(){
        System.out.println(" ");
        System.out.println("Book Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Pages : " + pages );
        System.out.println("Check Out :" + isCheckedOut);
    }

}

