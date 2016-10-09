package com.smoiseyenko.model.shape.factory;

import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.utill.Collection;
import com.smoiseyenko.model.shape.ShapeTemplate;

import java.util.List;

/**
 * Created by Igor on 9/4/16.
 */
public class TemplateFactory implements ShapeFactory {

    private List<Shape> shapes;

    public TemplateFactory(List<Shape> shapes) { this.shapes = shapes; }

    public Shape createShape() {

        try {

            List<Shape> shapes = Collection.copy(this.shapes);
            return new ShapeTemplate(shapes);
        } catch (CloneNotSupportedException ex) {
            throw new IllegalArgumentException();
        }
    }

    public static Builder builder () {
        return new Builder();
    }

    public static class Builder {

        private List<Shape> shapes;

        private Builder () {}

        public Builder shapes (List<Shape> shapes) {
            this.shapes = shapes;
            return this;
        }

        public TemplateFactory build () {
            return new TemplateFactory(this.shapes);
        }
    }
}
