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
            System.out.println("\n"+title+" checked out");
        }else{
            System.out.println("\n"+title+" already checked out");
        }

    }

    @Override
    public void returnItem(){
        if(isCheckedOut){
            isCheckedOut=false;
            System.out.println("\n"+title+" return");
        }
        else{
            System.out.println("\n"+title+" not checked out");
        }
    }

    @Override
    public void printDetails(){
        System.out.println(" ");
        System.out.print("Book Title : " + title);
        System.out.print(" | Author : " + author);
        System.out.print(" | Pages : " + pages );
        System.out.print(" | Check Out :" + isCheckedOut);
    }

}

