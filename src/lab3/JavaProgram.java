package lab3;

public class JavaProgram {
    public static void main(String[] args) {
        //1
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        //2
        Car car1 = new Car();
        Car car2 = new Car(Color.GREEN);
        car1.setColor(Color.BLUE);
        car1.setName("Mersedes");
        car1.setWeight(1500d);
        car2.setName("Audi");
        car2.setWeight(1600d);
        System.out.println(car1);
        System.out.println(car2);
        //3
        Home home1 = new Home();
        Home home2 = new Home();
        home1.setAll(10, 1950, "build1");
        home2.setAll(20, 1999, "build2");
        System.out.println(home1);
        System.out.println(home1.getNumberYears());
        System.out.println(home2);
        System.out.println(home2.getNumberYears());
        //4
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(20, "birch");
        Tree tree3 = new Tree(10, true, "pine");
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
