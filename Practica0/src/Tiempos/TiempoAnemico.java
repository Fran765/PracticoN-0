package Tiempos;
import java.time.LocalDate;

public class TiempoAnemico {
	private LocalDate myDate;

	public TiempoAnemico(LocalDate fecha) {
		this.myDate = fecha;
	}

	public LocalDate getMyDate() {
		return myDate;
	}

	public void setMyDate(LocalDate myLocalDate) {
		this.myDate = myLocalDate;
	}

}