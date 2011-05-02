package szlab4_whitespaces;

import java.awt.*;
import java.util.*;

public class ElementView extends Canvas {

    public HashMap<Coordinate, AElement> elements;
    private HashMap<String, Image> elementImages;
    public ArrayList<WireCoordinate> wires;
    public ArrayList<Coordinate> c;
    public Iterator it;


    public ElementView() {

        c = new ArrayList<Coordinate>();
        wires = new ArrayList<WireCoordinate>();
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


        Image gen1 = toolkit.getImage(getClass().getResource("Images/gen1.png"));
        mediaTracker.addImage(gen1, id);
        id++;
        elementImages.put("Generator1", gen1);

        Image gen2 = toolkit.getImage(getClass().getResource("Images/gen2.png"));
        mediaTracker.addImage(gen2, id);
        id++;
        elementImages.put("Generator2", gen2);

        Image gen3 = toolkit.getImage(getClass().getResource("Images/gen3.png"));
        mediaTracker.addImage(gen3, id);
        id++;
        elementImages.put("Generator3", gen3);

        Image gen4 = toolkit.getImage(getClass().getResource("Images/gen4.png"));
        mediaTracker.addImage(gen4, id);
        id++;
        elementImages.put("Generator4", gen4);

       
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(elementImages.get("And"), 5000, 5000, null);
        g.drawImage(elementImages.get("Or"), 5000, 5000, null);
        g.drawImage(elementImages.get("Inverter"), 5000, 5000, null);
        g.drawImage(elementImages.get("Switch0"), 5000, 5000, null);
        g.drawImage(elementImages.get("Switch1"), 5000, 5000, null);
        g.drawImage(elementImages.get("Fix0"), 5000, 5000, null);
        g.drawImage(elementImages.get("Fix1"), 5000, 5000, null);
        g.drawImage(elementImages.get("Led0"), 5000, 5000, null);
        g.drawImage(elementImages.get("Led1"), 5000, 5000, null);
        g.drawImage(elementImages.get("Oscilloscope"), 5000, 5000, null);
        g.drawImage(elementImages.get("Composite"), 5000, 5000, null);
        for (int i = 1; i<5; i++){
            g.drawImage(elementImages.get("Generator"+i), 5000, 5000, null);
        }

        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 620);
        g.setColor(Color.black);
        g.drawRect(5, 5, 980, 530);
        g.setColor(Color.white);

        it = c.iterator();
        if (elements.isEmpty()) {
            g.setColor(Color.WHITE);
            g.fillRect(6, 6, 978, 528);
        }
        while (it.hasNext()) {
            Coordinate cord = (Coordinate) it.next();
            AElement elem = elements.get(cord);
            String key = elem.toString();
            g.drawImage(elementImages.get(key), cord.getX(), cord.getY(), null);
            g.setColor(Color.BLACK);
            g.drawString("ID: "+elem.GetID(), cord.getX()+13, cord.getY()-3);
            if (key.substring(0, 2).equals("Ge")){
                Generator gen = (Generator) elem;
                g.setFont(new Font("Arial", 0, 12));
                g.drawString(gen.rate2(), cord.getX()+24, cord.getY()+60);

            }
        }
        for(int i = 0; i< wires.size();i++){
            g.setColor(Color.BLACK);
            g.drawLine(wires.get(i).getX(), wires.get(i).getY(), wires.get(i).getX2(), wires.get(i).getY2());
//            System.out.println(wires.get(i).getX()+" "+ wires.get(i).getY()+" "+wires.get(i).getX2()+" "+wires.get(i).getY2());
        }

    }
}
