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
        this.isCheckedOut=true;

    }
    public void returnItem(){
        this.isCheckedOut=false;
    }
    public void printDetails(){
        System.out.println(this.title);
        System.out.println(this.itemId);
        System.out.println(this.isCheckedOut);
    }
}
