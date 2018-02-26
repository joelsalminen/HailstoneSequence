package hailstone;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joel Salminen
 */

/* Creates an html webpage */
public class Html {
    

    
    public void CreateHtmlFile(int input, int steps, int secondLargest){
        String html = "<!DOCTYPE html><html><head><title>Hailstone Sequence</title>" + 
                "<link href=\"https://fonts.googleapis.com/css?family=Oswald\" " + 
                "rel=\"stylesheet\"><link rel=\"stylesheet\" type=\"text/css\" "+
                "href=\"src/hailstone/webpage/webpage_style.css\"></head><body>" +
                "<h1>Hailstone Sequence</h1><div><p>Original input: " + input +
                "</p> <p>Number of steps required: " + steps + "</p> <p>Second largest number in the sequence: " +secondLargest + 
                "</p></div></body></html>";
        
        File f = new File("hailstone.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(html);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Html.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
