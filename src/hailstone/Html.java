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
public class Html {
    

    public Html() {
        String html = "<div><h1>This is test html</h1><p>Test paragraph</p></div>";
        File f = new File("test.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(html);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Html.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
