package szlab4_whitespaces;

import java.awt.*;
import java.util.*;

public class ElementView extends Canvas {

    public HashMap<Coordinate, AElement> elements;
    private HashMap<String, Image> elementImages;
    public ArrayList<Coordinate> cords;
    private Iterator it;
    private Collection c;

    public ElementView() {
        elements = new HashMap<Coordinate, AElement>();
        elementImages = new HashMap<String, Image>();
//        this.setSize(1000, 1000);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        MediaTracker mediaTracker = new MediaTracker(this);
        int id = 0;

        Image and = toolkit.getImage(getClass().getResource("Images/and.png"));
        mediaTracker.addImage(and, id);
        id++;
        elementImages.put("And", and);

        Image or = toolkit.getImage(getClass().getResource("Images/or.png"));
        mediaTracker.addImage(or, id);
        id++;
        elementImages.put("Or", or);

        Image inv = toolkit.getImage(getClass().getResource("Images/inv.png"));
        mediaTracker.addImage(inv, id);
        id++;
        elementImages.put("Inverter", inv);

        Image sw0 = toolkit.getImage(getClass().getResource("Images/sw0.png"));
        mediaTracker.addImage(sw0, id);
        id++;
        elementImages.put("Switch0", sw0);

        Image sw1 = toolkit.getImage(getClass().getResource("Images/sw1.png"));
        mediaTracker.addImage(sw0, id);
        id++;
        elementImages.put("Switch1", sw1);

        Image fix0 = toolkit.getImage(getClass().getResource("Images/fix0.png"));
        mediaTracker.addImage(fix0, id);
        id++;
        elementImages.put("Fix0", fix0);

        Image fix1 = toolkit.getImage(getClass().getResource("Images/fix1.png"));
        mediaTracker.addImage(fix1, id);
        id++;
        elementImages.put("Fix1", fix1);

        Image led0 = toolkit.getImage(getClass().getResource("Images/led0.png"));
        mediaTracker.addImage(led0, id);
        id++;
        elementImages.put("Led0", led0);

        Image led1 = toolkit.getImage(getClass().getResource("Images/led1.png"));
        mediaTracker.addImage(led1, id);
        id++;
        elementImages.put("Led1", led1);

        Image osci = toolkit.getImage(getClass().getResource("Images/osci.png"));
        mediaTracker.addImage(osci, id);
        id++;
        elementImages.put("Oscilloscope", osci);

        Image comp = toolkit.getImage(getClass().getResource("Images/comp.png"));
        mediaTracker.addImage(comp, id);
        id++;
        elementImages.put("Composite", comp);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(elementImages.get("And"), 100, 100, null);
        g.drawImage(elementImages.get("Or"), 100, 100, null);
        g.drawImage(elementImages.get("Inverter"), 100, 100, null);
        g.drawImage(elementImages.get("Switch0"), 100, 100, null);
        g.drawImage(elementImages.get("Switch1"), 100, 100, null);
        g.drawImage(elementImages.get("Fix0"), 100, 100, null);
        g.drawImage(elementImages.get("Fix1"), 100, 100, null);
        g.drawImage(elementImages.get("Led0"), 100, 100, null);
        g.drawImage(elementImages.get("Led1"), 100, 100, null);
        g.drawImage(elementImages.get("Oscilloscope"), 100, 100, null);
        g.drawImage(elementImages.get("Composite"), 100, 100, null);

        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 620);
        g.setColor(new Color(0, 0, 0));
        g.drawRect(5, 5, 980, 530);
        c = elements.keySet();
        it = c.iterator();
        if (elements.isEmpty()) {
            g.setColor(Color.white);
            g.fillRect(6, 6, 778, 528);
        }
        while (it.hasNext()) {
            Coordinate cord = (Coordinate) it.next();
            AElement elem = elements.get(cord);
            String key = new String(elem.toString());
            g.drawImage(elementImages.get(key), cord.getX(), cord.getY(), null);
        }

    }

    public void paintelement(Graphics g, Coordinate c) {
        AElement elem = elements.get(c);
        String key = new String(elem.toString());
        g.drawImage(elementImages.get(key), c.getX(), c.getY(), null);
    }

    public void update() {
        repaint();
    }
}
