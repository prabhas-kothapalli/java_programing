import java.awt.*;
import java.applet.*;

/*
<applet code="AnimationEx.class" width="600" height="800">
</applet>
*/

public class AnimationEx extends Applet {
    Image pic;
    int i = 0;

    public void init() {
        pic = getImage(getDocumentBase(),"images.jpg");
    }
 
    public void paint(Graphics grp) {
        grp.drawImage(pic, i, 30, this);
        i++;
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        repaint();
    }
}
