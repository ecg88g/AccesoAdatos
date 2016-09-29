/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparser;

import com.iesvirgendelcarmen.acceso.tema01.DomUtil;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author matinal
 */
public class XmlParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length==1){
        
        try {
            // TODO code a
            Document doc = DomUtil.parse(args[0], true);
        } catch (ParserConfigurationException | IOException | SAXException ex) {
            System.out.println("## ERROR: "+ex.getLocalizedMessage());
        }
        
    } else {
        System.out.println("error de argumentos");
        }
    

    }
    
}
