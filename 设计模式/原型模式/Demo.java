public class Demo {
    public static void main(String[]args) throws CloneNotSupportedException{
        BookShop bs = new BookShop();
        bs.setShopName("garden");
        bs.loadData();

        System.out.println(bs);
        bs.getBooks().remove(2);



        BookShop bs1 = (BookShop) bs.clone();
        bs1.setShopName("ai");

        System.out.println(bs1);
    }
}
