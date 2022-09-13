public class Main1 {
    public static void main(String[] args) {

// ЗАДАЧА ПРО ПОПОЛНЕНИЕ КОШЕЛЬКА

        int initialAccount = 13450;
        int add = 900;


        //       условный оператор:

        int bonus;
       bonus = add > 1000 ? add / 100 : 0;

//        if (add > 1000) {
//            bonus = add / 100;
//        } else {
//            bonus = 0;
//        }


            int finalAccount = initialAccount + add + bonus;

            System.out.println("Итог:" + finalAccount);
            System.out.println("Бонус: " + bonus);
        }
    }







