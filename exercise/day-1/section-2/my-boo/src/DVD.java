public class DVD extends LibraryItem{
    private String director;
    private int duration;


    public DVD(String title, String itemId, String author, int pages) {
        super(title, itemId);
        this.director = author;
        this.duration = pages;
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
        System.out.println("DVD Title : " + title);
        System.out.println("Director : " + director);
        System.out.println("Duration : " + duration);
        System.out.println("Check Out :" + isCheckedOut);
    }

}


