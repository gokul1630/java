class M{
    M get(){
        return this;
    }
}
class Covarient extends M{
    Covarient get(){
        return this;
    }
    void message(){
        System.out.println("hello");
    }
    public static void main(String argd[]){
        new Covarient().get().message();
    }
}