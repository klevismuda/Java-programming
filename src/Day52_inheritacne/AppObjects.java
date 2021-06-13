package Day52_inheritacne;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(5.3);
        instagram.useTheApp(20);
        instagram.download();

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(1.43);
        b22Discord.useTheApp(100);
        b22Discord.download();
        b22Discord.printInfo();


    }
}
