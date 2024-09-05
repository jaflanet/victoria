abstract class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isCheckedOut;

    public void LibraryItem(String title,String itemId, boolean isCheckedOut){
        this.title=title;
        this.itemId=itemId;
        this.isCheckedOut=isCheckedOut;
    }

    public void checkOut(){


    }
    public void returnItem(){

    }
    public void printDetails(){
    }
}
