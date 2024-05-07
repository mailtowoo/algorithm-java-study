public class Banner {
    private final String _content;

    public Banner(String content) {
        _content = content;
    }

    public void printBanner(int times) {

        printBorder();
        printContent(times);
        printBorder();
    }

    private void printContent(int times) {
        for(int i = 0; i< times; i++) {
            System.out.println("|" + _content + "|");
        }
    }

    private void printBorder() {
        // 테두리 출력
        System.out.print("+");
        for(int i=0; i<_content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


    public static void main(String[] args) {
        Banner hello = new Banner("Hello, World!");
        hello.printBanner(3);
    }
}