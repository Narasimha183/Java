public class Movie {
    private String titmle;

    public Movie(String titmle) {
        this.titmle = titmle;
    }
    public  void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        //System.out.println(this.getClass());
        System.out.println(titmle +" is a " +instanceType+" film");

    }
}

class Adventures extends Movie{
    public Adventures(String titmle) {
        super(titmle);
    }

}