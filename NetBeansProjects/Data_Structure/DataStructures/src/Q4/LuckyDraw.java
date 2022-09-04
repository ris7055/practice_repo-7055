package Q4;

import java.util.Random;

public class LuckyDraw {

    public static void main(String[] args) {
        // Question 4(a)
        LinkedList<Staff> staffList1 = new LinkedList<>();
        staffList1.addLast(new Staff(1, "Luke Skywalker", "Manager"));
        staffList1.addLast(new Staff(2, "Han Solo", "Supervisor"));
        staffList1.addLast(new Staff(6, "Moff Tarkin", "Assistant"));
        staffList1.addLast(new Staff(8, "Obi Wan", "Assistant"));
        staffList1.addLast(new Staff(9, "Organa", "Assistant"));
        staffList1.addLast(new Staff(12, "Leia Organa", "Supervisor"));
        staffList1.addLast(new Staff(15, "Chewbacca", "Assistant"));
        staffList1.addLast(new Staff(16, "Uncle Owen", "Assistant"));
        staffList1.addLast(new Staff(17, "Aunt Beru", "Assistant"));
        staffList1.addLast(new Staff(19, "Lando Calrissian", "Assistant"));
        
        // Question 4(d)
        LinkedList<Staff> staffList2 = staffList1.clone();
        
        // Question 4(e)
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int r = rand.nextInt(staffList1.getSize());
            System.out.println(staffList1.get(r).getID() + " " + staffList1.get(r).getName() + " wins a drone!");
            staffList1.remove(r);
        }
        
        int cash = 1000;
        // Question 4(f)
        while (cash > 0) {
            int r = rand.nextInt(staffList1.getSize());
            if (staffList2.get(r).getPosition().equals("Assistant")) {
                if (cash >= 200) {
                    System.out.println("Assistant " + staffList2.get(r).getName() + " wins RM200. Cash vouchers left RM" + (cash - 200));
                    cash = cash - 200;
                }
                else {
                    System.out.println("Assistant " + staffList2.get(r).getName() + " wins RM" + cash + ". Cash vouchers left RM0");
                    cash = 0;
                }
            }
            else if (staffList2.get(r).getPosition().equals("Supervisor")) {
                if (cash >= 100) {
                    System.out.println("Supervisor " + staffList2.get(r).getName() + " wins RM100. Cash vouchers left RM" + (cash - 100));
                    cash = cash - 100;
                }
                else {
                    System.out.println("Supervisor " + staffList2.get(r).getName() + " wins RM" + cash + ". Cash vouchers left RM0");
                    cash = 0;
                }
            }
            else {
                System.out.println("Manager " + staffList2.get(r).getName() + " is the winner, but no cash voucher will be given");
            }
        }
    }
}