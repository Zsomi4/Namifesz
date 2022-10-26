import java.util.ArrayList;

/*
* File: App.java
* Author: Gubis Zsombor Dániel
* Copyright: 2022, Gubis Zsombor Dániel
* Group: Szoft_II_N
* Date: 2022-10-26
* Github: https://github.com/Zsomi4/
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        Publication publ = new Publication();
        ArrayList<String> nameList = publ.getNames();
        for (String names : nameList) {
            System.out.println(names);
        }
    }
}
