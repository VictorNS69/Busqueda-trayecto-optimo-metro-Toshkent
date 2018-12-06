package Grafica;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JScrollPane;


public class ChoiceSal extends Applet implements ItemListener {
	private static final long serialVersionUID = 1L;
	/* Declaration */
	private LayoutManager Layout;
	String [] Estaciones = new String [56];
	List Selector = new List(30,false);
	private Font Times;
	Ventana salida;

	@SuppressWarnings("deprecation")
	public ChoiceSal (Ventana salida, JScrollPane panel, Container contentpane) {
		/* Declaration */
		this.salida = salida;
		int i;

		/* Instantiation */
		Times = new Font("Arial", 15, 25);
		Layout = new FlowLayout ();
		Selector.setFont (Times);
		Selector.setBounds(40, 200, 335, 90);


		/* Decoration */
		Estaciones [0] = "Estacion de Origen ...";
		Estaciones [1]= "Abdulla Kordiriy";
		Estaciones [2]= "Amir Temur Hiyoboni - Yunus Rajabiy";
		Estaciones [3]= "Beruni";
		Estaciones [4]= "Bodomzor";
		Estaciones [5]= "Bunyodkor";
		Estaciones [6]= "Buyuk Ipak Yuli";
		Estaciones [7]= "Chilonzor";
		Estaciones [8]= "Chorsu";
		Estaciones [9]= "Dostlik";
		Estaciones [10]= "Gafur Gulom";
		Estaciones [11]= "Khamid Alimjan";
		Estaciones [12]= "Kosmonavtlar";
		Estaciones [13]= "Mashinasozlar";
		Estaciones [14]= "Milliy Bog";
		Estaciones [15]= "Ming Urik - Oybek";
		Estaciones [16]= "Minor";
		Estaciones [17]= "Mirzo Ulugbek";
		Estaciones [18]= "Mustakillik Maydoni";
		Estaciones [19]= "Novza";
		Estaciones [20]= "Olmazor";
		Estaciones [21]= "Pakhtakor - Alisher Navoi";
		Estaciones [22]= "Pushkin";
		Estaciones [23]= "Shakhriston";
		Estaciones [24]= "Tinchlik";
		Estaciones [25]= "Toshkent";
		Estaciones [26]= "Uzbekistan";
		for (i = 0; i < Estaciones.length; ++i) {
			Selector.addItem(Estaciones[i],i);
		}

		setLayout (Layout);
		Selector.setBounds(40, 200, 335, 400);
		panel.add(Selector);
		contentpane.add(Selector);
		Selector.addItemListener (this);
		Selector.select (0);
	}
	
	public void itemStateChanged(ItemEvent e) {
		int Selection;
		Selection = Selector.getSelectedIndex();
		salida.setsalida(Estaciones[Selection]);
	} 

}

