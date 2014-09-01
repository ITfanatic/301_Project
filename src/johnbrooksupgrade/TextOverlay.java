package johnbrooksupgrade;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class TextOverlay extends JPanel {

    private final SalesInfo save;
    private final Maininterface mainDataEntry;
    
    
    private BufferedImage image;

    public TextOverlay(SalesInfo sales, Maininterface mainDataEntryIn) {
        save = sales;
        mainDataEntry = mainDataEntryIn;
    //Referencing the other 2 classes to bring in functionality
        
        
        try {
            if (mainDataEntry.getAngleInput() <= 45) {
                image = ImageIO.read(new File("flatbed_belt.jpg"));
            } else {
                image = ImageIO.read(new File("incline-belt-conveyor.jpg"));
            }
            
        //If statement that will change the image depending on the degrees inputed and create a new file.
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setPreferredSize(new Dimension(
                image.getWidth(), image.getHeight()));
    }

    private BufferedImage process(BufferedImage old) {
        int w = old.getWidth();
        int h = old.getHeight();
        BufferedImage img = new BufferedImage(
                w, h, BufferedImage.TYPE_4BYTE_ABGR);

        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(old, 0, 0, null);
        g2d.setPaint(Color.black);
        g2d.setFont(new Font("Serif", Font.BOLD, 12));
        //formats the writing
        String s = ("Load on Belt (Kg)   : " + mainDataEntry.getKgatanygiventimeanswer10f());
        String s2 = ("Sprocket Rotation (Rpm)  : " + mainDataEntry.getRpmconveyor35());
        String s3 = ("Longitudinal Belt Pull (Kgf)  : " + mainDataEntry.getBeltloadanswer13f());
        String s4 = ("Torque (Nm)  : " + mainDataEntry.getNmanswer15f());
        String s5 = ("Speed of belt (Metres per minute)  : " + mainDataEntry.getSpeedofbeltanswer29f());
        String s6 = ("Design Power (Kw)  : " + mainDataEntry.getDesignkwanswer18f());
        //importing the answers or values out of the variables.
        FontMetrics fm = g2d.getFontMetrics();
        int x = img.getWidth() - fm.stringWidth(s) - 5;
        int y = fm.getHeight();
        
        g2d.drawString(s, 5, 10);
        g2d.drawString(s2, 5, 30);
        g2d.drawString(s3, 100, 180);
        g2d.drawString(s4, 100, 200);
        g2d.drawString(s5, 100, 220);
        g2d.drawString(s6, 100, 240);
        //position of the writing on the image
        g2d.dispose();
        return img;
    }

    private BufferedImage processincline(BufferedImage old) {
        int w = old.getWidth();
        int h = old.getHeight();
        BufferedImage img = new BufferedImage(
                w, h, BufferedImage.TYPE_4BYTE_ABGR);

        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(old, 0, 0, null);
        g2d.setPaint(Color.black);
        g2d.setFont(new Font("Serif", Font.BOLD, 12));
        //formats the writing
        String s = ("Kg at any given time: " + mainDataEntry.getKgatanygiventimeanswer10f());
        String s2 = ("Rpm: " + mainDataEntry.getRpmconveyor35());
        String s3 = ("Total design load Kgf: " + mainDataEntry.getBeltloadanswer13f());
        String s4 = ("Nm torque: " + mainDataEntry.getNmanswer15f());
        String s5 = ("Speed of belt M/pm: " + mainDataEntry.getSpeedofbeltanswer29f());
        //importing the answers or values out of the variables.
        FontMetrics fm = g2d.getFontMetrics();
        int x = img.getWidth() - fm.stringWidth(s) - 5;
        int y = fm.getHeight();
        
        g2d.drawString(s, 20, 40);
        g2d.drawString(s2, 110, 170);
        g2d.drawString(s3, 110, 190);
        g2d.drawString(s4, 110, 210);
        g2d.drawString(s5, 110, 230);
        //position of the writing on the image
        g2d.dispose();
        return img;
    }

    protected void imagesave() throws IOException {
        if (mainDataEntry.getAngleInput() <= 45) {
            image = process(image);
        } else {
            image = processincline(image);
        }
       //selects image depending on the degrees
    }

    protected BufferedImage getImage() {
        return image;
    }

}
