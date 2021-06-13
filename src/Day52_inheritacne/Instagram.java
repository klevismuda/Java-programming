package Day52_inheritacne;

public class Instagram extends MobileApp{
    public void postPhoto(){
        System.out.println("Posting photo in Instagram");
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        System.out.println("Using instagram app features");
        postPhoto();
    }

}
