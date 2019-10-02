package EmployeeThing;

public class Vendor implements Ipay {
    private int quantity;
    private double pricePerItem;
    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
public Vendor(int quantity,double pricePerItem){
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
}
}
