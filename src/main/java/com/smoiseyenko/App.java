package com.smoiseyenko;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.context.PaintContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {

    public static void main( String[] args ) {

        new PaintFrame(PaintContext.getPaintContext());

        /*ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(new Integer(10));
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(arrayList1);
        arrayList2.add(null);

        Collections.copy(arrayList2, arrayList1);
        arrayList2.add(0, 20);
        System.out.println(arrayList1.get(0));
        System.out.println(arrayList2.get(0));
        */
    }
}
