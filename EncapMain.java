public class EncapMain {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("initial page count "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.println("current job pages "+pagesPrinted+" printer total"+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(10);
        System.out.println("current job pages "+pagesPrinted+" printer total"+printer.getPagesPrinted());
    }
}
