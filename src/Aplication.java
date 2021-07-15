import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        while (true){
            menu();
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1: {
                        ZooClub.getZooClub().addZooClubMember();
                    break;
                }
                case 2: {
                        ZooClub.getZooClub().addAnimalClubMember();
                    break;
                }
                case 3: {
                        ZooClub.getZooClub().removeAnimalClubMember();
                    break;
                }
                case 4: {
                        ZooClub.getZooClub().removeClubMember();
                    break;
                }
                case 5: {
                        ZooClub.getZooClub().removeAnimalFromAllClubMembers();
                    break;
                }
                case 6: {
                        ZooClub.getZooClub().showZooClub();
                    break;
                }
                case 7:{
                        ZooClub.getZooClub().exit();
                    break;
                }
            }

        }

    }
    public static void menu(){
        System.out.println(" 1) Додати учасника клубу");
        System.out.println(" 2) Додати тваринку до учасника клубу");
        System.out.println(" 3) Видалити тваринку з учасника клубу");
        System.out.println(" 4) Видалити учасника з клубу");
        System.out.println(" 5) Видалити конкретну тваринку зі всіх власників");
        System.out.println(" 6) Вивести на екран зооклуб");
        System.out.println(" 7) Вийти з програми");


    }

}
