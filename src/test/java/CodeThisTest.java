import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeThisTest {

    @Test
    public void isASeatBooked() {
     CinemaBooking cinemaBooking = new CinemaBooking();
     cinemaBooking.cinemaSeats();

     assertEquals(true, cinemaBooking.isSeatBooked(4,5));
    }

    @Test
    public void bookSeats(){
        CinemaBooking cinemaBooking = new CinemaBooking();
        cinemaBooking.cinemaSeats();
        cinemaBooking.bookSeat(1,1);
        assertEquals(false, cinemaBooking.isSeatBooked(1,1));
    }

    @Test
    public void showCinema(){
        CinemaBooking cinemaBooking = new CinemaBooking();
        cinemaBooking.cinemaSeats();
        cinemaBooking.bookSeat(1,1);
        cinemaBooking.bookSeat(1,2);
        cinemaBooking.show();
    }
}
