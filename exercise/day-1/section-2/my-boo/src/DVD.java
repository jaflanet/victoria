public class DVD extends LibraryItem{
    private String director;
    private int duration;


    public DVD(String title, String itemId, String author, int duration) {
        super(title, itemId);
        this.director = author;
        this.duration = duration;
    }

    @Override
    public void checkOut(){
        if(!isCheckedOut){
            isCheckedOut=true;
            System.out.println(title+"checked out");
        }
        else{
            System.out.println(title+"already checked out");
        }
    }

    @Override
    public void returnItem(){
        if(isCheckedOut){
            isCheckedOut=false;
            System.out.println(title+"return");
        }
        else{
            System.out.println(title+"not checked out");
        }

    }

    @Override
    public void printDetails(){
        System.out.println(" ");
        System.out.print("DVD Title : " + title);
        System.out.print(" | Director : " + director);
        System.out.print(" | Duration : " + duration);
        System.out.print(" | Check Out :" + isCheckedOut);
    }

}


