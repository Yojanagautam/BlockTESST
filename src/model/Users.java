package model;


import java.util.ArrayList;

    public class Users {
        String name ;
        int user_id;
        boolean is_vip;
        int age;
        ArrayList<Orders> orders ;

        public Users(String name, int user_id, boolean is_vip, int age, ArrayList<Orders> orders) {
            this.name = name;
            this.user_id = user_id;
            this.is_vip = is_vip;
            this.age = age;
            this.orders = orders;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public boolean isIs_vip() {
            return is_vip;
        }

        public void setIs_vip(boolean is_vip) {
            this.is_vip = is_vip;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public ArrayList<Orders> getOrders() {
            return orders;
        }

        public void setOrders(ArrayList<Orders> orders) {
            this.orders = orders;
        }
    }
