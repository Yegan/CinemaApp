public class CinemaBooking {

    String[][] bookings = new String[9][8];

    public void cinemaSeats(){
        for (int i=0; i<bookings.length;i++){
            for (int j=0;j<bookings[i].length;j++){
                bookings[i][j] = "#";
            }
        }
    }

    public boolean isSeatBooked(int row, int seat){
        if(bookings[row][seat] == "#"){
            System.out.println("Seat has not been booked");
            return true;
        }else{
            return false;
        }
    }
    public boolean bookSeat(int row, int seat){
        if(bookings[row][seat] == "#"){
            bookings[row][seat] = "X";
            System.out.println("Seat has been booked at: " + "row: "+row + " seat number :"+ seat);
            return true;
        }else{
            return false;
        }
    }
    public void show(){
        System.out.println("-Screen-");
        for(int i = 0; i< bookings.length; i++){
            for (int j=0; j<bookings[i].length; j++){
                System.out.print(bookings[i][j]);
            }
            System.out.println();
        }
    }

    public int totalBookings(){
       int totalSeatsBooked =0;
        for(int i =0;i<bookings.length;i++){
            for (int j =0;j<bookings[i].length;j++){
                if(bookings[i][j] == "X"){
                    totalSeatsBooked++;
                }
            }
        }
        System.out.println("There have been: "+ totalSeatsBooked + " seats booked");
        return totalSeatsBooked;
    }

    public int totalIncome(){
        int frontRow = 0;

        for(int i=0;i<bookings.length;i++){
            for(int j=0;j<bookings[i].length;j++){
                if(bookings[i][j]=="X"){
                    frontRow = frontRow +25;
                }
            }
        }
        System.out.println("Total income from seats booked : R"+ frontRow +".00" );
        return frontRow;
    }

    public boolean book(int ticket, String location){
        return false;
    }


}
