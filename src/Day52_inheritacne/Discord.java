package Day52_inheritacne;

public class Discord extends MobileApp{
    public void chat(String someone){
        System.out.println("Chatting with " +someone + " on Discord");
    }

    /**
     * override download method
     */

    @Override
    public boolean download(){
        System.out.println("Downloaded Discord 0.0.23 from App store");
        return true;
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Vladislav");
    }

    public void printInfo(){
        System.out.println("App name = " + getName());
        System.out.println("App version = " + getVersion());
    }
}
