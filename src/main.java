import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class main {



    public class Main {

        public static void main(String[] args) {
            Items i1 = new Items("hh", 4004, "Levis", "large", 4000);
            Items i2 = new Items("hhh", 4005, "aaddida", "Extra large", 3500);
            Items i3 = new Items("yee", 4006, "heee", "Extra large", 2500);
            Items i4 = new Items("kkkkk", 4007, "Babushka", "Small", 1500);
            Items i5 = new Items("yyyy", 4008, "Classics", "Medium", 7500);

            i4.describe();

            ArrayList<Items> order1 = new ArrayList<Items>();
            ArrayList<Items> order2 = new ArrayList<Items>();
            ArrayList<Items> order3 = new ArrayList<Items>();
            ArrayList<Items> order4 = new ArrayList<Items>();

            order1.add(i1);
            order1.add(i3);
            order1.add(i4);

            order2.add(i5);
            order2.add(i2);
            order2.add(i3);

            order3.add(i1);

            order4.add(i4);
            order4.add(i5);

            Orders o1 = new Orders("order1", 1, 1, "multiple", order1 );
            Orders o2 = new Orders("order1", 2, 1, "multiple", order2 );
            Orders o3 = new Orders("order3", 3, 2, "single", order3 );
            Orders o4 = new Orders("order4", 4, 2, "multiple", order4 );

            ArrayList<Orders> user1 = new ArrayList<Orders>();
            ArrayList<Orders> user2 = new ArrayList<Orders>();

            user1.add(o1);
            user1.add(o2);
            user2.add(o3);
            user2.add(o4);


            Users u1 = new Users("yojana", 1, false, 28,user1 );
            Users u2 = new Users("meemansha", 2, true, 29,user2 );


        }
    }
}
