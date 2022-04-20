public class ForEach {
    public static void main(String[] args) {
        int [] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++){
            tablica[i]=i+1;
            System.out.println(tablica[i]);
        }
        for (int zmienna :tablica){
            System.out.println(zmienna);
        }
    }
}
