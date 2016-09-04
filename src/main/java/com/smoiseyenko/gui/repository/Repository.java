package com.smoiseyenko.gui.repository;

import com.smoiseyenko.gui.model.Shape;


/**
 * Created by Igor on 8/19/16.
 */
public interface Repository {

    Shape createShape(String shapeName);
}
