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
        cinemaBooking.bookSeat(0,1);
        cinemaBooking.show();

        assertEquals(false, cinemaBooking.isSeatBooked(1,1));
    }


    @Test
    public void totalSeatsBooked(){
       CinemaBooking cinemaBooking = new CinemaBooking();
       cinemaBooking.cinemaSeats();
       cinemaBooking.bookSeat(1,1);
       cinemaBooking.bookSeat(1,2);
       cinemaBooking.bookSeat(0,1);
        cinemaBooking.show();
       assertEquals(3, cinemaBooking.totalBookings() );

    }

    @Test
    public void totalIncomeTest(){
        CinemaBooking cinemaBooking = new CinemaBooking();
        cinemaBooking.cinemaSeats();
        cinemaBooking.bookSeat(4,1);
        cinemaBooking.bookSeat(5,2);
        cinemaBooking.bookSeat(6,3);

        assertEquals(105, cinemaBooking.totalIncome());
    }
    @Test
    public void totalIncomeTest2(){
        CinemaBooking cinemaBooking = new CinemaBooking();
        cinemaBooking.cinemaSeats();
        cinemaBooking.bookSeat(1,1);
        cinemaBooking.bookSeat(8,2);
        cinemaBooking.bookSeat(4,3);

        assertEquals(91, cinemaBooking.totalIncome());
    }

}
