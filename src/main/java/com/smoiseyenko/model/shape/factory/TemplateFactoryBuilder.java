package com.smoiseyenko.model.shape.factory;

import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.utill.Collection;

import java.util.List;

/**
 * Created by Igor on 9/22/16.
 */
public class TemplateFactoryBuilder {

    private TemplateFactoryBuilder() {}

    private static TemplateFactoryBuilder TEMPLATE_FACTORY_BUILDER;

    public static TemplateFactoryBuilder builder() {

        if (TEMPLATE_FACTORY_BUILDER == null) TEMPLATE_FACTORY_BUILDER = new TemplateFactoryBuilder();
        return TEMPLATE_FACTORY_BUILDER;
    }

    public TemplateFactory build(List<Shape> shapes) throws CloneNotSupportedException {

        try {
            List<Shape> copyOfShapes = Collection.copy(shapes);
            return new TemplateFactory(copyOfShapes);
        } catch (CloneNotSupportedException ex) {
            throw new CloneNotSupportedException();
        }
    }
}
