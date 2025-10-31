class Parameter {
    String name;
    int age;
    String branch;
    int pin;
    Parameter(String n,int a){

        name=n;
        age=a;
        System.out.println("name= "+name+" age= "+age);
    }
    Parameter(int b,int p){
        this(23,"cse");
        age=b;
        pin=p;
        System.out.println("age= "+age+" pin= "+pin);

    }
    Parameter(int x,String m){
        this("srinu",21);
        age=x;
        branch=m;
        System.out.println("age= "+age+" branch= "+branch);
    }

    public static void main(String[] args) {
        Parameter obj1=new Parameter(26,514);
    }
}