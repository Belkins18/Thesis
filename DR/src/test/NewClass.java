
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class NewClass {
    static List<String> stringList = new ArrayList<String>();
    static {
        for (int i = 0; i < 16; i++) {
            stringList.add("test" + i);
        }
    }

    public static void main(final String[] args) {
        final JFrame frame = new JFrame();
        final Container contentPane = frame.getContentPane();
        final JList list = new JList(stringList.toArray());
        list.setLayoutOrientation(JList.VERTICAL_WRAP);
        list.setVisibleRowCount(1);
        final JScrollPane scrollPane = new JScrollPane(list);
        contentPane.add(scrollPane);
        frame.setPreferredSize(new Dimension(800, 400));
        frame.pack();
        frame.setVisible(true);
    }
}