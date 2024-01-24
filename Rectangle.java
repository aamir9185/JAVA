interface Resizable{
    void resizeWidth(int width);

    void resizeHeight(int height);
}

class Rectangle implements Resizable{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width= width;
        this.height = height;

    }
    public void resizeWidth(int width){
        this.width = width;
        System.out.println("Width of rectangle is changed by " + width  + " meters");
    }

    public void resizeHeight(int height){
        this.height = height;
        System.out.println("Height of rectangle is changed by " + height + " meters");
    }

    public static void main(String args[]){
        Rectangle rectangle = new Rectangle(25,45);

        System.out.println("Changes in the dimension of rectangle is made as follows");
        System.out.println("--------------------------");
        rectangle.resizeWidth(30);
        rectangle.resizeHeight(50);
    }
}
