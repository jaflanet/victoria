//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new LibraryClass();

        Book book1 = new Book("jungle book", "B1", "Mowgli", 12);
        Book book2 = new Book("doraemon", "B2", "Nobita", 24);
        DVD dvd1 = new DVD("Rush Hour", "D1", "Jackie Chan", 148);
        DVD dvd2 = new DVD("Rush Hour 2", "D2", "Kevin hart", 136);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(dvd2);

//        System.out.println("\nAll items:");
//        library.listAllItems();


        library.checkOutItem("B1");
        library.checkOutItem("D1");
        System.out.println("\nafter checkout:");
        library.listAllItems();
//
//
//        library.returnItem("B1");
//        library.returnItem("D1");
//        System.out.println("\nafter return:");
//        library.listAllItems();
//
//        System.out.println("\nSearch by title:");
//        LibraryItem searchedItem = library.searchByTitle("doraemon");
//        if (searchedItem != null) {
//            searchedItem.printDetails();
//        }
//
//        library.removeItem("B1");
//        System.out.println("\nAll items in the library after remove:");
//        library.listAllItems();
    }
}
