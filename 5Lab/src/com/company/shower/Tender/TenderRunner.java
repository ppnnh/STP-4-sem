package com.company.shower.Tender;

import java.util.Random;

public class TenderRunner {
    public static void main(String[] args) {

        Tender tender = new Tender();

        for(int i=1;i<10;++i)
        {
            Bid bid = new Bid(i,new Random().nextInt(200),tender.getBarrier());
            tender.add(bid);
            bid.start();
        }

    }
}
