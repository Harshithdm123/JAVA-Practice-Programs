package Main;
interface Bank {
    void setdata(double rate, double amount);
    String getdata();
}
class SBI implements Bank {
    private double rate;
    private double amount;
   
    public void setdata(double rate, double amount) {
        this.rate = rate;
        this.amount = amount;
    }
    public String getdata() {
        double interest = (rate / 100) * amount;
        return "SBI: The interest is " + rate + "% and Interest is " + interest;
    }
}

class ICICI implements Bank {
    private double rate;
    private double amount;
 
    public void setdata(double rate, double amount) {
        this.rate = rate;
        this.amount = amount;
    }

    public String getdata() {
        double interest = (rate / 100) * amount;
        return "ICICI: The interest is " + rate + "% and Interest is " + interest;
    }
}

// Create AXIS class
class AXIS implements Bank {
    private double rate;
    private double amount;
    public void setdata(double rate, double amount) {
        this.rate = rate;
        this.amount = amount;
    }
    public String getdata() {
        double interest = (rate / 100) * amount;
        return "AXIS: The interest is " + rate + "% and Interest is " + interest;
    }
}
public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        sbi.setdata(8.4, 10000);
        System.out.println(sbi.getdata());
        
        Bank icici = new ICICI();
        icici.setdata(7.3, 10000);
        System.out.println(icici.getdata());
        
        Bank axis = new AXIS();
        axis.setdata(9.7, 10000);
        System.out.println(axis.getdata());
    }
}