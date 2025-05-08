class person {
    String name;
    int age;

    void getperson(String n1, int n2) {
        name = n1;
        age = n2;
    }

    void show() {
        System.out.println("name= /n" + name + "age=" + age);

    }
}

class example1 {
    public static void main(String[] args) {
        person obj = new person();
        obj.getperson("sathish", 23);
        obj.show();
    }
}