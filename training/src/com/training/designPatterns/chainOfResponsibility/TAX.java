package com.training.designPatterns.chainOfResponsibility;

public class TAX extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        return successor.applyTax(invoice);
    }
}
