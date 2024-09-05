abstract class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isCheckedOut;

    public LibraryItem(String title,String itemId){
        this.title=title;
        this.itemId=itemId;
        this.isCheckedOut=false;
    }

    public void checkOut(){}
    public void returnItem(){}
    public void printDetails(){}
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }
}
