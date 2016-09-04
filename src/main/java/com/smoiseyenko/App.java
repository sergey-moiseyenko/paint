package com.smoiseyenko;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.context.PaintContext;

public class App {

    public static void main( String[] args ) {

        new PaintFrame(PaintContext.getPaintContext());
    }
}
