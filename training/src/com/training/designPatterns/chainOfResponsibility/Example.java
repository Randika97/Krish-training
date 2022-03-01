package com.training.designPatterns.chainOfResponsibility;

public class Example {
    public static void main(String[] args) {
        VAT vat = new VAT();
        NBT nbt = new NBT();
        TAX tax = new TAX();
        tax.setSuccessor(nbt);
        vat.setSuccessor(nbt);

//        Invoice invoice = new Invoice(1,50);
//        System.out.println(tax.applyTax(invoice));
        Invoice invoice1 = new Invoice(2,150);
        System.out.println(tax.applyTax(invoice1)) ;

    }
}
