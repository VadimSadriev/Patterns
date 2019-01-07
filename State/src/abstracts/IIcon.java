package abstracts;

import java.awt.*;

public interface IIcon {
   public int getIconWidth();
   public int getIconHeight();
   public void paintIcon(final Component c, Graphics g, int x, int y);
}
