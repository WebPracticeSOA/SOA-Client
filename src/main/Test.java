package main;
import main.pythonServiceClient.*;

public class Test {
    public static void main(String[] args) {
        PTServiceService service = new PTServiceService();
        PTServicePort port = service.getPTServicePort();
        System.out.println(port.trans());
    }
}
