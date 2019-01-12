public class InstanceCounter {

    private static int numInstances = 0;

    public static int getCount(){
        return numInstances;
    }

    private static void addinstance(){
        numInstances++;
    }

    public InstanceCounter() {
        InstanceCounter.addinstance();
    }

    public static void main(String[] args) {
        System.out.println("Rozpoczynanie z " + InstanceCounter.getCount() + " obiektów");
        for (int i = 0; i <500; i++){
            new InstanceCounter();
        }
        System.out.println("Utworzono " + InstanceCounter.getCount() + " obiektów");
    }
}


