import html.HtmlRunner;
import python.PythonRunner;

public class Main {

    public static void main(String[] args) {

        try {
            if (args.length < 2) {
                System.out.println("Usage: <language> <file>");
                return;
            }

            String lang = args[0];
            String path = args[1];

            if (lang.equals("html")) {
                HtmlRunner.run(path);
            }
            else if (lang.equals("python")) {
                PythonRunner.run(path);
            }
            else {
                System.out.println("Unknown language");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
