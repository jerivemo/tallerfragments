package itcr.compdes.ejemplo2_fragment;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase auxiliar con el contenido del listado
 * @author Google, modificado por Ramon Invarato Men�ndez
 * @see {@link www.jarroba.es}
 */
public class Lista_contenido {

	/** 
	 * Donde se guardan las entradas de la lista.
	 */
	public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();
	
	/** 
	 * Donde se asigna el identificador a cada entrada de la lista
	 */
	public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();
	
	/** 
	 * Creamos est�ticamente las entradas
	 */
	static {
		aniadirEntrada(new Lista_entrada("0", R.drawable.im_aceituno, "El aceituno de Guanacaste", "Atractivo y noble �rbol natural nativo desde Florida hasta Centroam�rica y el Caribe, presente en todas aquellas zonas desde la bajura hasta los 1200 m en donde predomina una estaci�n seca y caliente bien definida de m�s de 4 meses por a�o por lo que soporta muy bien las sequ�as y el fuerte sol aunque tolera bien la sombra, se adapta bien a suelos �cidos y malos pero le gustan los buenos y profundos."));
		aniadirEntrada(new Lista_entrada("1", R.drawable.achiote, "El achiote o achote", "Es un arbusto grande de r�pido crecimiento que a veces puede alcanzar el tama�o de un arbolito de unos 5 metros o un poco m�s, de ra�z pivotante y con un delgado tallo de corteza un poco fisurada y con lenticelas, que se bifurca desde muy abajo originando largas ramas que dan una amplia copa de forma redondeada. Las llamativas flores de unos 5 cm de di�metro se presentan en pan�culas terminales y poseen 5 delicados p�talos y m�ltiples estambres; las cuales pueden ser blancas a rosado fuerte, que combinan con los botones florales de color rojo que poco a poco se van abriendo de abajo para arriba. "));
		aniadirEntrada(new Lista_entrada("2", R.drawable.im_aguacate, "El aguacate", "Se sabe que el aguacate es un �rbol originario desde Yucat�n hasta Costa Rica, aunque no se sabe exactamente de d�nde porque no existen individuos silvestres. Aunque su reproducci�n es muy f�cil por medio de semillas, en Costa Rica actualmente se consiguen individuos injertados de m�s de 50 variedades diferentes para plantar y cultivar desde el nivel del mar hasta los 2000 metros de elevaci�n m�s o menos. Las flores femeninas maduran mucho despu�s que las masculinas lo cual explica por qu� un solo �rbol produce tan pocos frutos, motivo por el cual siempre se recomienda tener varios �rboles de aguacate plantados cerca para producir mucho frutos."));
		aniadirEntrada(new Lista_entrada("3", R.drawable.im_almendrodelapa,"Almendro amarillo","Uno de los �rboles en gran peligro extinci�n mejor conocidos en Costra Rica, gracias a un ave tropical que tambi�n se encuentra en gran peligro de extinci�n: la lapa verde (Ara ambigua ). El �rbol proporciona alimento y refugio a la lapa verde, y �sta a su vez juega un papel muy importante en la dispersi�n de los frutos y semillas del �rbol formando una relaci�n ecol�gica muy estrecha y muy delicada que la deforestaci�n se ha encargado de debilitar y quebrantar, ocasionando que las poblaciones de �rbol y ave se encuentren en niveles muy bajos. La madera de este �rbol es muy atractiva, muy dura y muy pesada, y durante muchos a�os se ha utilizado con muy buena aceptaci�n para la fabricaci�n de pisos y artesonados de casas lujosas." ) );
	
	
	}

	
	/** A�ade una entrada a la lista
	 * @param entrada Elemento que a�adimos a la lista
	 */
	private static void aniadirEntrada(Lista_entrada entrada) {
		ENTRADAS_LISTA.add(entrada);
		ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
	}

	/**
	 * Representa una entrada del contenido de la lista
	 */
	public static class Lista_entrada {
		public String id;
		public int idImagen; 
		public String textoEncima; 
		public String textoDebajo; 
		  
		public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) { 
			this.id = id;
		    this.idImagen = idImagen; 
		    this.textoEncima = textoEncima; 
		    this.textoDebajo = textoDebajo; 
		}
	}
	
}
