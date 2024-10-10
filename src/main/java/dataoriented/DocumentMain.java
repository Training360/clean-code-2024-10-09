package dataoriented;

import java.util.List;

public class DocumentMain {

    List<Part> parts;

    public DocumentMain(List<Part> parts) {
        this.parts = parts;
    }

    public String getTitle() {
        return "Title";
    }

    public void print() {
        var s = getTitle();
        System.out.println(s);
        for (Part part : parts) {
            switch (part) {
                case Header(var title) -> System.out.println(title.toUpperCase());
                case Paragraph(var text) -> System.out.println(text);
                case Image(var _, var alt) -> System.out.println(alt);
            }
        }
    }

    public static void main(String[] args) {
        var document = new DocumentMain(List.of(
                new Header("Hello Clean Code"),
                new Paragraph("lorem ipsum"),
                new Paragraph("java data oriented"),
                new Image("dop.png", "DOP image")
        ));
        document.print();
    }
}
