package com.smoiseyenko;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.context.PaintContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {

    public static void main( String[] args ) {

        new PaintFrame(PaintContext.getPaintContext());
    }
}
