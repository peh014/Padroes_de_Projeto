public class HomeTheaterTestDrive {
    public static void main(String[] args){  
        
        HomeTheaterFacade homeTheater;
        homeTheater = new HomeTheatherFacade(amp, tuner,dvd,
                cd,projector, screen,lights,popper);        
        homeTheater.watchMovie("raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
