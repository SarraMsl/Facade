public class ShapMaker {
    private Shap square;
    private Shap rectangle;

    public ShapMaker(){
        square=new Squaer();
        rectangle=new Rectangle();


    }
       public void  drawsquare(){
        square.draw();
       }

       public void  drawrectangle(){
        rectangle.draw();
       }
}
