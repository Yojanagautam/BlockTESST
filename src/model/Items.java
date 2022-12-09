package model;

public class Items {

        String item_name;
        int item_code;
        String brand;
        String size;
        int price;

        public Items(String item_name, int item_code, String brand, String size, int price) {
            this.item_name = item_name;
            this.item_code = item_code;
            this.brand = brand;
            this.size = size;
            this.price = price;
        }

        public String getItem_name() {
            return item_name;
        }

        public void setItem_name(String item_name) {
            this.item_name = item_name;
        }

        public int getItem_code() {
            return item_code;
        }

        public void setItem_code(int item_code) {
            this.item_code = item_code;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void describe() {
            System.out.println("------------------Desctiption of item--------------------- ");
            System.out.println("Item name : " +this.item_name);
            System.out.println("code : " +this.item_code);
            System.out.println("Brand : " +this.brand);
            System.out.println("Price: Rs " +this.price);
            System.out.println("--------------------------------------------------------- ");
        }

    }
