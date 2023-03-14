package Tiempos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {

	private LocalDate myDate;

	public TiempoNoAnemico() {
		this.myDate = LocalDate.now();
	}

	public void verFechaCorta() {
		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(myDate));
	}

	public void verFechaCompleta() {
		System.out.println(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(myDate) + "\n");
	}

}