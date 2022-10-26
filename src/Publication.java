import java.util.ArrayList;
import java.util.Arrays;

/*
* File: Publication.java
* Author: Gubis Zsombor Dániel
* Copyright: 2022, Gubis Zsombor Dániel
* Group: Szoft_II_N
* Date: 2022-10-26
* Github: https://github.com/Zsomi4/
* Licenc: GNU GPL
*/

public class Publication implements Names {

    @Override
    public ArrayList<String> getNames() {
        String[] names = {"Béla", "Géza"};
        ArrayList<String> nameList =
        new ArrayList<>(Arrays.asList(names));

        return nameList;
    }
    
}
