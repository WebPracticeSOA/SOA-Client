package main;
import main.PTServiceClient.*;
import main.DataServiceClient.*;

public class Test {
    public static void main(String[] args) {
        PTServiceService service = new PTServiceService();
        PTServicePort port = service.getPTServicePort();
        System.out.println(port.trans());
        DataServiceService dataService = new DataServiceService();
        DataServicePort dataServicePort = dataService.getDataServicePort();
        System.out.println(dataServicePort.getAllData());
    }
}
