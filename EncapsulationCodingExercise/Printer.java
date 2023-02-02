package dev.cooley;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this(tonerLevel, duplex,0);
    }
    public Printer(int tonerLevel, boolean duplex, int pagesPrinted) {
        if (tonerLevel < 0){
            this.tonerLevel = -1;
        }
        else if (tonerLevel > 100){
            this.tonerLevel = -1;
        }
        else{
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        System.out.println("Adding " + tonerAmount + " to current toner level " + tonerLevel);

        if (tonerAmount < 1 || tonerAmount > 100){
            return -1;
        }


        if (tonerLevel + tonerAmount > 100){
            return -1;
        }
        else{
            tonerLevel = tonerLevel + tonerAmount;
        }

        System.out.println("Returning " + tonerLevel + " from addToner() funciton");

        return tonerLevel;
    }

    public int printPages(int pages){

        System.out.println("Printing " + pages + " new pages. Already have printed " + pagesPrinted + " pages before.");

        int pagesToPrint = pages;

        //if double-sided, only need half the pages. If original # is odd, then need integer division by 2 plus 1
        if (duplex == true){
            if (pagesToPrint%2 == 0){
                pagesToPrint = pagesToPrint/2;
            }
            else{
                pagesToPrint = pagesToPrint/2 +1;
            }
        }
        pagesPrinted = pagesPrinted + pagesToPrint;

        System.out.println("Returning " + pagesToPrint + " from printPages() funciton");

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        System.out.println("Returning " + pagesPrinted + " from getPagesPrinted() funciton");
        return pagesPrinted;
    }
}
