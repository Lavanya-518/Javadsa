

abstract class Movie {
    String movieId;
    String title;
    double ticketPrice;
    int numberOfTickets;
    abstract double calculatePrice();
    void displayDetails() {
        System.out.println("Movie Record");
        System.out.println("ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);

        if (numberOfTickets > 6) {
            System.out.println("Booking Failed: Cannot book more than 6 tickets\n");
        } else {
            double total = calculatePrice();
            System.out.println("Total Price: " + total + "\n");
        }
    }
}


class TeluguMovie extends Movie {
     TeluguMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
       this.movieId=movieId;
       this.title=title;
       this.ticketPrice=ticketPrice;
       this.numberOfTickets=numberOfTickets;
    }

     double calculatePrice() {
        double baseCost = ticketPrice * numberOfTickets;
        double gst = baseCost * 0.05; 
        return baseCost + gst;
    }
}


class HindiMovie extends Movie {
   HindiMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        this.movieId=movieId;
        this.title=title;
        this.ticketPrice=ticketPrice;
        this.numberOfTickets=numberOfTickets;
        
    }

     double calculatePrice() {
        double baseCost = ticketPrice * numberOfTickets;
        double discount = baseCost * 0.10; 
        double discountedCost = baseCost - discount;
        double gst = discountedCost * 0.05; 
        return discountedCost + gst;
    }
}


class EnglishMovie extends Movie {
     EnglishMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
         
       this.movieId=movieId;
       this.title=title;
       this.ticketPrice=ticketPrice;
       this.numberOfTickets=numberOfTickets;
    }
 double calculatePrice() {
        double baseCost = (ticketPrice + 50) * numberOfTickets; 
        double gst = baseCost * 0.05; 
        return baseCost + gst;
    }
}


public class MovieBookingSystem {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new TeluguMovie("M101", "RRR", 150.0, 3);
        movies[1]= new HindiMovie("M102", "Pathaan", 200.0, 2);
        movies[2] = new EnglishMovie("M103", "Avatar", 250.0, 7);         
        

        
        for (Movie movie : movies) {
            movie.displayDetails();
        }
    }
}
