package Task_05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Aleksey Zaychenkov on 13.12.2019.
 */
public class PropertiesOpener {
    public static Properties openProperties(String path_to_file){
        Properties propertiesMap = null;

        try {
            propertiesMap = new PropertyAsMap().getPropertyAsMap(path_to_file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(propertiesMap);
        return propertiesMap;
    }
}
