
import java.util.ArrayList;
import java.util.List;

public class LibraryClass implements Library{
    private List<LibraryItem> items = new ArrayList<>();


    public LibraryClass(){
        items = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println(item.getTitle() + "added to libray");

    }

    @Override
    public void removeItem(String itemId) {
        for (int i = 0; i < items.size(); i++) {
            LibraryItem item = items.get(i);

            if(item.getItemId().equals(itemId)){
                items.remove(i);
                System.out.println(itemId + " has been removed.");
                break;
            }
        }
    }

    @Override
    public void listAllItems() {
        for (int i = 0; i < items.size(); i++) {
            LibraryItem item = items.get(i);
            item.printDetails();
        }
    }

    // Method to check out an item
    @Override
    public void checkOutItem(String itemId) {
        for (int i = 0; i < items.size(); i++) {
            LibraryItem item = items.get(i);
            if (item.getItemId().equals(itemId)) {
                item.checkOut();
                return;
            }
        }
        System.out.println(" not found.");
    }

    @Override
    public void returnItem(String itemId) {
        for (int i = 0; i < items.size(); i++) {
            LibraryItem item = items.get(i);
            if (item.getItemId().equals(itemId)) {
                item.returnItem();
                return;
            }
        }
    }

    @Override
    public LibraryItem searchByTitle(String title) {
        for (int i = 0; i < items.size(); i++) {
            LibraryItem item = items.get(i);
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        System.out.println(" not found.");
        return null;
    }
}
