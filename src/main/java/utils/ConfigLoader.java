package utils;

import java.util.Properties;

public class ConfigLoader {

    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
        properties = PropertyUtils.propertyLoader(System.getProperty("user.dir")
                + "/src/main/resources/config.properties");
    }

    public static ConfigLoader getInstance(){
        if(configLoader == null)
            configLoader = new ConfigLoader();
        return configLoader;
    }

    public String getKartName() {
        String prop = properties.getProperty("bank_name");
        if(prop != null)
            return prop;
        else
            throw new RuntimeException("property bank_name is not specified in the config.properties file");
    }
}
