/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detection;

/**
 *
 * @author mahdi
 */
import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.cpp.opencv_core.*;
import detection.FaceDetection;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import org.opencv.core.Core;
/**
 * @since 17/03/2013, 11:20:51
 * @author pedro_ha@yahoo.com.br
 */
public class MainClass {
    
    public static void main(String[] args) throws Exception
    {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
      //  System.out.println(System.getProperty("java.library.path" ));
        
        
        IplImage foto = cvLoadImage("src//detection//bilel.png");
//       
      
        
        
        System.out.println("mahdi: "+foto);
       FaceDetection detection = new FaceDetection();
       
       
       
      IplImage face ;//=detection.detectFace(foto);
      
      
     face= detection.eyeDetection(foto); 
     CanvasFrame frame = new CanvasFrame("");
     face = detection.putName(foto, "bilel");
     frame.showImage(face);
     
    }

}
