package t;

import data.DataModel;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class T {
    ReadDataFromJson readDataFromJson;
    DataModel dataModel;
    @Test
    public void t1() throws FileNotFoundException {
        readDataFromJson=new ReadDataFromJson();
        System.out.println(readDataFromJson.readJsonFile().URL);

    }
    @Test
    public void t2() throws FileNotFoundException {
        readDataFromJson=new ReadDataFromJson();
        System.out.println(readDataFromJson.readJsonFile().Login.ValidLoginCredentials.Username);
        System.out.println(readDataFromJson.readJsonFile().Login.ValidLoginCredentials.Password);
    }
    @Test
    public void t3() throws FileNotFoundException {
        readDataFromJson=new ReadDataFromJson();
        System.out.println(readDataFromJson.readJsonFile().Login.InValidLoginCredentials.InvalidUsername.Username);
        System.out.println(readDataFromJson.readJsonFile().Login.InValidLoginCredentials.InvalidUsername.Password);
    }
    @Test
    public void t4() throws FileNotFoundException {
        readDataFromJson=new ReadDataFromJson();
        System.out.println(readDataFromJson.readJsonFile().Login.InValidLoginCredentials.InvalidPassword.Username);
        System.out.println(readDataFromJson.readJsonFile().Login.InValidLoginCredentials.InvalidPassword.Password);
    }
}
