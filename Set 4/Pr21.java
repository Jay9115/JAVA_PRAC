class Degree {
    void getdegree() {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree {
    void getdegree() {
        System.out.println("I am Undergraduate");
    }
}
class Postgraduate extends Degree {
    void getdegree() {
        System.out.println("I am Postgraduate");
    }
}
class Pr21 {
    public static void main(String[] args) {
        Degree obj = new Degree();
        Postgraduate obj1 = new Postgraduate();
        Undergraduate obj2 = new Undergraduate();

        obj.getdegree();
        obj1.getdegree();
        obj2.getdegree();
        System.out.println("23DCS076 Jay Pael");
    }
}
