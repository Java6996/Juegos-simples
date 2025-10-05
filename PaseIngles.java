package PaseIngles;
import javax.swing.*;

class PaseIngles {

	public static void main(String[] args) {
		double a=0, t, f, d;
		int d1, d2, d3;
		String respuesta;
		t=a*3;
		do {
		JOptionPane.showMessageDialog(null, "Craps, o pase ingles, se juega con 3 dados.\nEn la primera tirada, usted puede ganar, perder o continuar,\ngana el triple de su apuesta si la suma de los tres dados es 3 u 18. \nPierde todo su dinero si la suma es 6, 9 o 12. \nCaso contrario, usted tiene derecho a una segunda tirada. \nLa segunda tirada, se generan los valores de los dados,\n si los tres dados son iguales cobra el doble de la apuesta. \n Si alguno de los dados es 1 cobra la apuesta + $10, \n si hay 2 dados iguales no gana ni pierde, \n se le devuelve la apuesta, de lo contrario pierde. \n Usted puede ganar en la primera o en la segunda tirada.", 
			"Craps", JOptionPane.DEFAULT_OPTION, new ImageIcon(PaseIngles.class.getResource("/img/craps.jpg")));
		a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la apuesta de 1 a 100"));
		if (a>=1 && a<=100) {
		d1=(int)(Math.random()*6+1);
		d2=(int)(Math.random()*6+1);
		d3=(int)(Math.random()*6+1);
		JOptionPane.showMessageDialog(null, "PRIMER DADO: " + d1, "Tirada de dados", JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(PaseIngles.class.getResource("/img/dado" + d1 + ".png")));
		JOptionPane.showMessageDialog(null, "SEGUNDO DADO: " + d2, "Tirada de dados", JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(PaseIngles.class.getResource("/img/dado" + d2 + ".png")));
		JOptionPane.showMessageDialog(null, "TERCER DADO: " + d3, "Tirada de dados", JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(PaseIngles.class.getResource("/img/dado" + d3 + ".png")));
		if (((d1+ d2 + d3)==3) || ((d1+ d2 + d3)==18)) {
			JOptionPane.showMessageDialog(null, "Cobra: " + t, "Finalizando el juego", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(PaseIngles.class.getResource("/image/dadosani.gif")));
		}else if (((d1+ d2 + d3)==6) || ((d1+ d2 + d3)==9) || ((d1+ d2 + d3)==12)) {
			JOptionPane.showMessageDialog(null, "Perdio la apuesta");
		}else {
			JOptionPane.showMessageDialog(null, "Tiene derecho a una segunda tirada.");
			d1=(int)(Math.random()*6+1);
			d2=(int)(Math.random()*6+1);
			d3=(int)(Math.random()*6+1);
			d=a*2;
			f=a+10;
			JOptionPane.showMessageDialog(null, "PRIMER DADO: " + d1, "Tirada de dados", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(PaseIngles.class.getResource("/img/dado" + d1 + ".png")));
			JOptionPane.showMessageDialog(null, "SEGUNDO DADO: " + d2, "Tirada de dados", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(PaseIngles.class.getResource("/img/dado" + d2 + ".png")));
			JOptionPane.showMessageDialog(null, "TERCER DADO: " + d3, "Tirada de dados", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(PaseIngles.class.getResource("/img/dado" + d3 + ".png")));
			if (d1==d2 && d2==d3) {
				JOptionPane.showMessageDialog(null, "Cobra: " + d, "Finalizando el juego", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(PaseIngles.class.getResource("/img/dadosani.gif")));
			}else if (d1==1 || (d2==1) || (d3==1)) {
				JOptionPane.showMessageDialog(null, "Cobra: " + f, "Finalizando el juego", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(PaseIngles.class.getResource("/img/dadosani.gif")));
			}else if ((d1==d2) || (d1==d3) || (d2==d3)) {
				JOptionPane.showMessageDialog(null, "Se le devuelve la apuesta");
			} else {
				JOptionPane.showMessageDialog(null, "Perdio la apuesta");
			}}
	} else {
		JOptionPane.showMessageDialog(null, "Error: se debe ingresar una apuesta del 1 a 100");
	}
		respuesta=JOptionPane.showInputDialog("¿Desea volver a jugar? Si o no.");
		} while (respuesta.equalsIgnoreCase("si"));
	}
}