package be.intecbrussel.entities;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table (name = "productLines")
public class ProductLine {

    @Id
    private String productLine;
    private String textDescription;

    @Column(columnDefinition = "mediumtext")
    private String htmlDescription;
    @Lob
    @Column(columnDefinition = "Blob")
    private Byte [] image;

    public ProductLine() {
    }

    public ProductLine(String productLine, String textDescription, String htmlDescription, Byte[] image) {
        this.productLine = productLine;
        this.textDescription = textDescription;
        this.htmlDescription = htmlDescription;
        this.image = image;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ProductLine{" +
                "productLine='" + productLine + '\'' +
                ", textDescription='" + textDescription + '\'' +
                ", htmlDescription='" + htmlDescription + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
