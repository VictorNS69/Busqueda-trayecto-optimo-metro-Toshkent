package Grafica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jdd.graph.Edge;
import Arbol.Arbol;
import Grafo.*;

public class AA {

	private Grafo grafo;
	Nodo salida;
	Nodo llegada;

	public AA(String salida, String llegada) {

		grafo = new Grafo(true); 

		// Creacion de la linea de metro

		// ESTACIONES
		// Estaciones linea Roja
		Nodo Olmazor = grafo.addNode("Olmazor", 0, 0);
		Nodo Chilonzor = grafo.addNode("Chilonzor", 1, 1);
		Nodo Mirzo = grafo.addNode("Mirzo Ulugbek", 2, 2);
		Nodo Novza = grafo.addNode("Novza", 3, 3);
		Nodo Milliy = grafo.addNode("Milliy Bog", 4, 4);
		Nodo Bunyodkor = grafo.addNode("Bunyodkor", 5, 5);
		
		Nodo Pakhtakor_Alisher_R = grafo.addNode("Pakhtakor - Alisher Navoi (linea Roja)", 6, 6);
		Nodo Pakhtakor_Alisher_Int = grafo.addNode("Pakhtakor - Alisher Navoi (R)", 6, 6);
		Nodo Pakhtakor_Alisher_Trans = grafo.addNode("Pakhtakor - Alisher Navoi (A)", 6, 6);
		
		Nodo Mustakillik = grafo.addNode("Mustakillik Maydoni", 7, 6);
		
		Nodo Amir_Yunus_R = grafo.addNode("Amir Temur Hiyoboni - Yunus Rajabiy (linea Roja)", 8, 6);
		Nodo Amir_Yunus_Int = grafo.addNode("Amir Temur Hiyoboni - Yunus Rajabiy (R)", 8, 6);
		Nodo Amir_Yunus_Trans = grafo.addNode("Amir Temur Hiyoboni - Yunus Rajabiy (V)", 8, 6);
		
		Nodo Khamid= grafo.addNode("Khamid Alimjan", 9, 6); //Esto deberia estar en 9,7
		Nodo Pushkin = grafo.addNode("Pushkin", 10, 7);
		Nodo Buyuk = grafo.addNode("Buyuk Ipak Yuli", 11, 8);
			
		// Estaciones linea Azul
		Nodo Beruni = grafo.addNode("Beruni", 3, 10); 
		Nodo Tinchlik = grafo.addNode("Tinchlik", 4, 9); 
		Nodo Chorsu = grafo.addNode("Chorsu", 5, 8); 
		Nodo Gafur = grafo.addNode("Gafur Gulom", 6, 7); 
		
		Nodo Pakhtakor_Alisher_A = grafo.addNode("Pakhtakor - Alisher Navoi (linea Azul)", 6, 6);
		
		Nodo Uzbekistan = grafo.addNode("Uzbekistan", 6, 5); 
		Nodo Kosmonavtlar = grafo.addNode("Kosmonavtlar", 7, 4);
		
		Nodo Ming_Oybek_A = grafo.addNode("Ming Urik - Oybek (Linea Azul)", 8, 4); 
		Nodo Ming_Oybek_Int = grafo.addNode("Ming Urik - Oybek (A)", 8, 4);
		Nodo Ming_Oybek_Trans = grafo.addNode("Ming Urik - Oybek (V)", 8, 4);
		
		Nodo Toshkent = grafo.addNode("Toshkent", 9, 4); 
		Nodo Mashinasozlar= grafo.addNode("Mashinasozlar", 10, 4); 
		Nodo Dostlik = grafo.addNode("Dostlik", 11, 4); 
		
		// Estaciones linea Verde
		Nodo Shakhriston = grafo.addNode("Shakhriston", 8, 10); 
		Nodo Bodomzor = grafo.addNode("Bodomzor", 8, 9); 
		Nodo Minor = grafo.addNode("Minor", 8, 8); 
		Nodo Abdulla = grafo.addNode("Abdulla Kodiriy", 8, 7); 
		
		Nodo Amir_Yunus_V = grafo.addNode("Amir Temur Hiyoboni - Yunus Rajabiy (linea Verde)", 8, 6);
		
		Nodo Ming_Oybek_V = grafo.addNode("Ming Urik - Oybek (Linea Verde)", 8, 4); 
	
		// Linea Roja
		grafo.addEdge (Olmazor, Chilonzor, 60*4, "linea Roja");
		grafo.addEdge (Chilonzor, Mirzo, 60*2, "linea Roja");
		grafo.addEdge (Mirzo, Novza, 60*2, "linea Roja");
		grafo.addEdge (Novza, Milliy, 60*2, "linea Roja");
		grafo.addEdge (Milliy, Bunyodkor, 60, "linea Roja");
		grafo.addEdge (Bunyodkor, Pakhtakor_Alisher_R, 60*2, "linea Roja");
		
		//intercambio Pakhtakor - Alisher
		grafo.addEdge (Bunyodkor, Pakhtakor_Alisher_Int, 60*2, "linea Roja");
		grafo.addEdge (Mustakillik, Pakhtakor_Alisher_Int, 60*2, "linea Roja");
		grafo.addEdge (Pakhtakor_Alisher_Int, Pakhtakor_Alisher_Trans, 60, "Trasbordo");
		grafo.addEdge (Pakhtakor_Alisher_Trans, Gafur, 60*2, "linea Azul");
		grafo.addEdge (Pakhtakor_Alisher_Trans, Uzbekistan, 60, "linea Azul");
		
		grafo.addEdge (Pakhtakor_Alisher_R, Mustakillik, 60*2, "linea Roja");
		grafo.addEdge (Mustakillik, Amir_Yunus_R, 60*2, "linea Roja");
		
		//intercambio 
		//grafo.addEdge (Mustakillik, Amir_Yunus_Int, 60*2, "linea Roja");
		//grafo.addEdge (Khamid, Amir_Yunus_Int, 60, "linea Roja");
		//grafo.addEdge (Amir_Yunus_Int, Amir_Yunus_Trans, 60, "Trasbordo");
		//grafo.addEdge (Amir_Yunus_Trans, Abdulla, 60, "linea Verde");
		//grafo.addEdge (Amir_Yunus_Trans, Ming_Oybek_A, 60*4, "linea Verde");
		
		grafo.addEdge (Amir_Yunus_R, Khamid, 60, "linea Roja");
		grafo.addEdge (Khamid, Pushkin, 60*2, "linea Roja");
		grafo.addEdge (Pushkin, Buyuk, 60*2, "linea Roja");
		
		// Linea Azul
		grafo.addEdge (Beruni, Tinchlik, 60*4, "linea Azul");
		grafo.addEdge (Tinchlik, Chorsu, 60*2, "linea Azul");
		grafo.addEdge (Chorsu, Gafur, 60, "linea Azul");
		grafo.addEdge (Gafur, Pakhtakor_Alisher_A, 60*2, "linea Azul");
		
		//grafo.addEdge (Gafur, Pakhtakor_Alisher_Int, 60*2, "linea Azul");
		//grafo.addEdge (Uzbekistan, Pakhtakor_Alisher_Int, 60, "linea Azul");
		//grafo.addEdge (Pakhtakor_Alisher_Int, Pakhtakor_Alisher_Trans, 60, "Trasbordo");
		//grafo.addEdge (Pakhtakor_Alisher_Trans, Bunyodkor, 60*2, "linea Roja");
		//grafo.addEdge (Pakhtakor_Alisher_Trans, Mustakillik, 60*2, "linea Roja");
		
		grafo.addEdge (Pakhtakor_Alisher_A, Uzbekistan, 60, "linea Azul");	
		grafo.addEdge (Uzbekistan, Kosmonavtlar, 60*2, "linea Azul");
		grafo.addEdge (Kosmonavtlar, Ming_Oybek_A, 60, "linea Azul");
		
		grafo.addEdge (Kosmonavtlar, Ming_Oybek_Int, 60, "linea Azul");
		grafo.addEdge (Toshkent, Ming_Oybek_Int, 60*2, "linea Azul");
		grafo.addEdge (Ming_Oybek_Int, Ming_Oybek_Trans, 60, "Trasbordo");
		grafo.addEdge(Ming_Oybek_Trans, Amir_Yunus_V, 60*4, "linea Verde");//grafo.addEdge (Amir_Yunus_V, Pakhtakor_Alisher_Int, 60, "linea Verde");//Puede fallar !
		//grafo.addEdge(Ming_Oybek_Trans, Amir_Yunus_R, 60, "linea Verde");
		
		grafo.addEdge (Ming_Oybek_A, Toshkent, 60*2, "linea Azul");
		grafo.addEdge (Toshkent, Mashinasozlar, 60*2, "linea Azul");
		grafo.addEdge (Mashinasozlar, Dostlik, 60*2, "linea Azul");
		
		//Linea Verde
		grafo.addEdge(Shakhriston, Bodomzor, 60*2, "linea Verde");
		grafo.addEdge(Bodomzor, Minor, 60*2, "linea Verde");
		grafo.addEdge(Minor, Abdulla, 60, "linea Verde");
		grafo.addEdge(Abdulla, Amir_Yunus_V, 60, "linea Verde");
		
		//intercambio Amir - Yunus
		grafo.addEdge (Abdulla, Amir_Yunus_Int, 60, "linea Verde");
		grafo.addEdge (Ming_Oybek_V, Amir_Yunus_Int, 60, "linea Verde");
		grafo.addEdge (Ming_Oybek_Trans, Amir_Yunus_Int, 60*4, "linea Verde");
		grafo.addEdge (Amir_Yunus_Int, Amir_Yunus_Trans, 60, "Trasbordo");
		grafo.addEdge (Amir_Yunus_Trans, Mustakillik, 60*2, "linea Roja");
		grafo.addEdge (Amir_Yunus_Trans, Khamid, 60, "linea Roja");
		
		grafo.addEdge(Amir_Yunus_V, Ming_Oybek_V, 60*4, "linea Verde");
		/*
		grafo.addEdge (Bunyodkor, Pakhtakor_Alisher_R, 60*2, "linea Roja");
		
		//intercambio Pakhtakor - Alisher
		grafo.addEdge (Bunyodkor, Pakhtakor_Alisher_Int, 60*2, "linea Roja");
		grafo.addEdge (Mustakillik, Pakhtakor_Alisher_Int, 60*2, "linea Roja");
		grafo.addEdge (Pakhtakor_Alisher_Int, Pakhtakor_Alisher_Trans, 60, "Trasbordo");
		grafo.addEdge (Pakhtakor_Alisher_Trans, Gafur, 60*2, "linea Azul");
		grafo.addEdge (Pakhtakor_Alisher_Trans, Uzbekistan, 60, "linea Azul");
		
		grafo.addEdge (Pakhtakor_Alisher_R, Mustakillik, 60*2, "linea Roja");*/
		//grafo.addEdge (Amir_Yunus_V, Ming_Oybek_Int, 60*4, "linea Verde");
		//grafo.addEdge (Ming_Oybek_Int, Ming_Oybek_Trans, 60, "Trasbordo");
		//grafo.addEdge (Ming_Oybek_Trans, Kosmonavtlar, 60, "linea Azul");
		//grafo.addEdge (Ming_Oybek_Trans, Toshkent, 60*2, "linea Azul");
		
		//fin de grafo

		Iterator<Edge> l = grafo.getMap().get(salida).iterator();
		boolean cond = true;
		Edge tramo;
		while(l.hasNext() && cond){
			tramo = l.next();
			if(((Nodo)tramo.n1).getNombre() == salida) {
				this.salida = (Nodo)tramo.n1;
				cond = false;
			}
		}
		

		Iterator<Edge> s = grafo.getMap().get(llegada).iterator();
		cond = true;
		while(s.hasNext() && cond){
			tramo = s.next();
			if(((Nodo)tramo.n1).getNombre() == llegada) {
				this.llegada = (Nodo)tramo.n1;
				cond = false;
			}
		}
	}

	
	public List<Pixel> recorridoOptimo() {
		String linea = "";
		String lineaA = "Linea0";
		Arbol arbol = new Arbol(salida, llegada, grafo);
		List<Nodo> camino = arbol.recorridoOptimo(arbol.CalcularRecorrido());
		List<Pixel> recorrido = new ArrayList<Pixel>();
		Iterator<Nodo> iterador = camino.iterator();
		Iterator<Nodo> iterador2 = camino.iterator();
		iterador2.next();
		while (iterador.hasNext()) {
			Nodo nodo = iterador.next();
			Nodo nodo2;
			if (iterador2.hasNext()) {
				nodo2 = iterador2.next();
				Iterator<Edge> l = grafo.getMap().get(nodo.getNombre())
						.iterator();
				boolean cond = true;
				Edge tramo;
				while (l.hasNext() && cond) {
					tramo = l.next();
					if (((Nodo) tramo.n2).getNombre() == nodo2.getNombre()) {
						if (cond && linea == lineaA) {
							linea = tramo.getLabel();
							cond = false;
						} else
							linea = tramo.getLabel();
					}
				}
				lineaA = linea;
			} else
				linea = "";
			Pixel pixel = new Pixel(nodo.getX(), nodo.getY(), nodo.getNombre(), linea);
			recorrido.add(pixel);
		}
		// Save travel time in last pixel
		if (recorrido.isEmpty()) {
			throw new RuntimeException("Empty recorrido list");
		}
		recorrido.get(recorrido.size()-1).setDistance(recordTravelTime(grafo, recorrido));
		return recorrido;
	}

	private int recordTravelTime(Grafo grafo, List<Pixel> recorrido) {
		int travelTime = 0;
		Pixel pixel;
		Pixel pixel2;
		String nameNode1;
		String nameNode2;
		for (int count = 0; count < recorrido.size()-1; count++) {
			pixel = recorrido.get(count);
			pixel2 = recorrido.get(count+1);
			nameNode1 = pixel.Nombre;
			nameNode2 = pixel2.Nombre;

			for (Edge edge : grafo.getGrafoEdges()) {
				if ((edge.n1.getLabel().equals(nameNode1) && edge.n2.getLabel().equals(nameNode2)) ||
						(edge.n2.getLabel().equals(nameNode1) && edge.n1.getLabel().equals(nameNode2))) {
					travelTime += edge.id;
				}
			}
		}
		return travelTime;
	}
}
