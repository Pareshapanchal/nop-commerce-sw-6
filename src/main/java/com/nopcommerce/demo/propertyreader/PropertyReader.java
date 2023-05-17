package com.nopcommerce.demo.propertyreader;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
    private static volatile  PropertyReader propInstance;
    private PropertyReader(){}
    public static synchronized PropertyReader getInstance(){
        if(propInstance == null){
            propInstance = new PropertyReader();
        }
        return propInstance;
    }
    public String getProperty(String propertyName){
        Properties prop = new Properties();
        FileInputStream inuputStream = null;
        try{
            inuputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/resources/properties/config.properties");
            prop.load(inuputStream);
            if(prop.getProperty(propertyName)!=null){
                return prop.getProperty(propertyName);
            }

        }catch (Exception e){
            System.out.println("Property not found");
        }
        return null;
    }
}
