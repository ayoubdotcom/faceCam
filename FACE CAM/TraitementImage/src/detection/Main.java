

package detection;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import org.opencv.core.Core;
/**
 * @since 17/03/2013, 11:20:51
 * @author pedro_ha@yahoo.com.br
 */
public class Main {
    
    public static void main(String[] args) throws Exception
    {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println(System.getProperty("java.library.path" ));
        
        
        IplImage foto = cvLoadImage("//group.jpg");
//        
       FaceDetection detection = new FaceDetection();
//        
        IplImage face = detection.detectFace(foto);
        
        face = detection.eyeDetection(face);
        
        CanvasFrame frame = new CanvasFrame("");
        
        frame.showImage(face);
    }

}
