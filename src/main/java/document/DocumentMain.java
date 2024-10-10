package document;

public class DocumentMain {

    public void printShorts() {
        String type = "";
        switch (type) {
            case "header":
                System.out.println("First word of header");
                break;
            case "paragraph":
                System.out.println("First sentence of paragraph");
            default:
//                System.out.println("Unknown type");
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public void uppercase() {
        String type = "";
        switch (type) {
            case "header":
                System.out.println("Uppercase all words");
                break;
            case "paragraph":
                System.out.println("Uppercase first letter");
            default:
//                System.out.println("Unknown type");
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
