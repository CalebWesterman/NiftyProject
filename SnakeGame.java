import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class SnakeGame {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(465, 540);
		panel.setBackground(Color.LIGHT_GRAY);
		Graphics g = panel.getGraphics();
		g.setFont(new Font("Droid Serif", Font.BOLD, 20));
		drawCalculator(g);
		while (!panel.checkMouseClicked()) {
			panel.sleep(10);
			
				
			}
		int numbers = 0;
		while (panel.isVisible()&& numbers!=1){
			
	
		if ((panel.getMouseClickX() <= 108 && panel.getMouseClickX() >= 57  )
			&& (panel.getMouseClickY() <= 245 && panel.getMouseClickY() >= 195)){
			System.out.println("1");
			numbers++;
		}

	
		
		
			
		}
		
		
		
	}
	public static void drawCalculator(Graphics g){
		g.setFont(new Font("Droid Serif", Font.BOLD, 20));
		g.drawRect(20, 20, 425, 500);
		//7-9
		g.drawString("7", 78, 377);
		g.drawOval(58, 345, 50, 50);
		g.drawString("8", 178, 377);
		g.drawOval(158, 345, 50, 50);
		g.drawString("9", 278, 377);
		g.drawOval(258, 345, 50, 50);
		//4-6
		g.drawString("4", 78, 302);
		g.drawOval(58, 270, 50, 50);
		g.drawString("5", 178, 302);
		g.drawOval(158, 270, 50, 50);
		g.drawString("6", 278, 302);
		g.drawOval(258, 270, 50, 50);
		//1-3
		g.drawString("1", 78, 227);
		g.drawOval(58, 195, 50, 50);
		g.drawString("2", 178, 227);
		g.drawOval(158, 195, 50, 50);
		g.drawString("3", 278, 227);
		g.drawOval(258, 195, 50, 50);
		//0
		g.drawString("0", 178, 452);
		g.drawOval(158, 420, 50, 50);
		//Things
		g.drawString("÷", 378, 377);
		g.drawOval(358, 345, 50, 50);
		g.drawString("x", 378, 302);
		g.drawOval(358, 270, 50, 50);
		g.drawString("-", 380, 227);
		g.drawOval(358, 195, 50, 50);
		g.drawString("+", 378, 452);
		g.drawOval(358, 420, 50, 50);
		g.drawString("=", 278, 452);
		g.drawOval(258, 420, 50, 50);
	}
}
