package praktika12;
import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
    JPanel[] pnl = new JPanel[12];

    public Border() {
        setLayout(new GridLayout(3, 4)); //грид созддает таблицу

        for(int i = 0;i<pnl.length;i++) {
            pnl[i] = new JPanel();
            int r, g, b;
            r = (int) (Math.random() * 255);
            b = (int) (Math.random() * 255);
            g = (int) (Math.random() * 255);
            pnl[i].setBackground(new Color(r, g, b));
            add(pnl[i]);
        }
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("two"),BorderLayout.EAST);
        pnl[4].add(new JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new JButton("five"),BorderLayout.CENTER);
        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));
        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton("five"));
        setSize(1000, 250);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

