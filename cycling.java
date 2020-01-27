package personal.anna;

public class cycling {
    public static void main(String[] args) {
        //планируемый пробег
        int goalkm = 10_000;
        int cycledkm = 0; //реальный пробег с начала сезона
        int kmPerMonth = 1000; // планируемый пробег в месяц
        int months = 0;

        do {
            cycledkm += kmPerMonth;
            months++;
            System.out.println(" в конце month" + months + " проехали " + cycledkm);
        } while (cycledkm < goalkm);




    }
}
