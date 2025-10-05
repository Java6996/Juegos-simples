package PaseIngles;

import javax.swing.ImageIcon;
import javax.swing.*;

class Vasos {

	public static void main(String[] args) {
			double a, d=0;
			int n, cant=0, s, o=0;
			String v, respuesta;
			do {
			JOptionPane.showMessageDialog(null, "Encontrar la pelotita debajo de los vasos, son tres vasos con apuesta, \nse tienen 3 tiradas, en cada tirada gana 1 punto, si no 0, \nsi tiene 2 puntos o mas gana el doble de la apuesta, sino pierde.", 
					"Juego de vasos", JOptionPane.DEFAULT_OPTION, new ImageIcon(Vasos.class.getResource("/img/tresvasos.jpg")));
			a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la apuesta del 1 a 100"));
			if (a>=1 && a<=100) {
				for (int i = 1; i <=3+o; i++) {
				v=(String)(JOptionPane.showInputDialog(null, "Elegí un vaso, ponga solo el numero del vaso: \n vaso 1 \n vaso 2 \n vaso 3", "Juego de vasos", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Vasos.class.getResource("/img/tresvasos.jpg")),null, null));
				s=Integer.parseInt(v);
				if (s>=1 && s<=3) {
					n=(int)(Math.random()*3+1);
					System.out.println("vaso: " + n);
					if (n==s) {
						JOptionPane.showMessageDialog(null, "Ganaste 1 punto.", "Juego de vasos", JOptionPane.DEFAULT_OPTION,
								new ImageIcon (Vasos.class.getResource("/img/vaso" + n + ".jpg")));
						cant++;
						} else {
							JOptionPane.showMessageDialog(null, "Fallaste.", "Juego de vasos", JOptionPane.DEFAULT_OPTION,
									new ImageIcon (Vasos.class.getResource("/img/vaso" + n + ".jpg")));
							}
				} else {
					JOptionPane.showMessageDialog(null, "Error, vaso no encontrado.");
					o=o+1;
					}}
				if (cant>=2) {
					d=a*2;
					JOptionPane.showMessageDialog(null, "Felicidades, gano: " + d);
				} else {
					JOptionPane.showMessageDialog(null, "No gano nada.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Error: se debe ingresar una apuesta del 1 a 100");
			}
			
		respuesta=JOptionPane.showInputDialog("¿Desea volver a jugar? Si o no.");
		} while (respuesta.equalsIgnoreCase("si"));
				
			}
		}