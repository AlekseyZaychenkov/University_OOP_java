package Task_05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Aleksey Zaychenkov on 13.12.2019.
 */
class PropertyAsMap {

    private Properties property = new Properties();

    Properties getPropertyAsMap(String path_to_file) throws IOException {
        FileInputStream fis = new FileInputStream(path_to_file);
        property.load(fis);
        return property;
    }
}