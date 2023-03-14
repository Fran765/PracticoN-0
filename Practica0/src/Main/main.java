package Main;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Tiempos.TiempoAnemico;
import Tiempos.TiempoNoAnemico;
import Tiempos.TiempoRecord;


public class main {

	public static void main(String[] args) {

		// De manera anemica, seteando una fecha y pidiendo que me la devuelva y la
		// trabajo yo
		System.out.println("****Anemica****");
		TiempoAnemico miTiempoAnemico = new TiempoAnemico(LocalDate.now());

		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(miTiempoAnemico.getMyDate()));

		System.out.println(
				DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(miTiempoAnemico.getMyDate()) + "\n");

		// De manera no anemica, pidiendo directamente el formato que quiero ya que lo
		// tiene como un comportamiento //
		System.out.println("\n****No Anemica****");

		TiempoNoAnemico miTiempoNoAnemico = new TiempoNoAnemico();

		miTiempoNoAnemico.verFechaCorta();
		miTiempoNoAnemico.verFechaCompleta();

		// Utilizando records nuevo metodo para encapsular y proteger los datos de
		// objetos
		System.out.println("\n****Records java_16****");

		TiempoRecord miTiempoRecord = new TiempoRecord(LocalDate.now());

		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(miTiempoRecord.fecha()));

		System.out.println(
				DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(miTiempoRecord.fecha()));

	}

}
