public class Twitter implements SocialShare{
    String message;
    @Override
    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to twitter: "+this.message);
    }
}
