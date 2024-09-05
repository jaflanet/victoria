import  java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class LibraryClass implements Library{
    private List<LibraryItem> items = new ArrayList<>();
    private Iterator<LibraryItem> iterator = items.iterator();

    public LibraryClass(){
        items = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item){
        items.add(item);
    }

    @Override
    public void removeItem(String itemId) {
        while (iterator.hasNext()){
            LibraryItem item = iterator.next();

            if(item.getItemId().equals(itemId)){
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public void listAllItems() {
        for (LibraryItem item : items) {
            item.printDetails();
        }
    }

    // Method to check out an item
    @Override
    public void checkOutItem(String itemId) {
        for (LibraryItem item : items) {
            if (item.getItemId().equals(itemId)) {
                item.checkOut();
                return;
            }
        }
        System.out.println(" not found.");
    }

    @Override
    public void returnItem(String itemId) {
        for (LibraryItem item : items) {
            if (item.getItemId().equals(itemId)) {
                item.returnItem();
                return;
            }
        }
    }

    @Override
    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        System.out.println(" not found.");
        return null;
    }
}
