public class Printer {
    private int tonelevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonelevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonelevel = (tonelevel>=0 && tonelevel <=100)? tonelevel :-1;
        this.duplex = duplex;
    }
    public int addToner(int toneamount){
        int tempamouhnt = toneamount + tonelevel;
         if(tempamouhnt>100||tempamouhnt<0){
             return -1;
         }
        tonelevel =+ toneamount;
        return tonelevel;
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? (pages/2) + (pages%2) : pages ;
        pagesPrinted += jobPages;
        return jobPages;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
