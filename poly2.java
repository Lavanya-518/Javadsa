 class RestaurantBillingSystem {

   
 static class FoodItem {
        String itemId;
        String itemName;
      double unitPrice;
        int quantity;

        public FoodItem(String a, String b, double c, int d) {
            this.itemId = a;
            this.itemName = b;
            this.unitPrice = c;
            this.quantity = d;
        }

        public double calculateBill() {
            return 0; 
        }public void displayDetails() {
            System.out.println("\nFood Item Record");
            System.out.println("ID: " + itemId);
            System.out.println("Name: " + itemName);
            System.out.println("Unit Price: " + unitPrice);
            System.out.println("Quantity: " + quantity);
        }
    }static class DineIn extends FoodItem {
        private double serviceCharge;

        public DineIn(String itemId, String itemName, double unitPrice, int quantity, double serviceCharge) {
            super(itemId, itemName, unitPrice, quantity);
            this.serviceCharge = serviceCharge;
        }

        @Override
        public double calculateBill() {
            double subtotal = unitPrice * quantity + serviceCharge;
            double gst = subtotal * 0.05;
            double total = subtotal + gst;
            if (total > 1000) {
                total -= total * 0.10;
            }
            return total;
        }

        @Override
        public void displayDetails() {
            double subtotal = unitPrice * quantity + serviceCharge;
            double gst = subtotal * 0.05;
            double discount = 0;
            double total = subtotal + gst;

            if (total > 1000) {
                discount = total * 0.10;
                total -= discount;
            }

            super.displayDetails();
            System.out.println("Service Charge: " + serviceCharge);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("GST: " + gst);
            System.out.println("Discount: " + discount);
            System.out.println("Total Bill: " + total);
        }
    }

   
    static class Takeaway extends FoodItem {
        private double packingCharge;

        public Takeaway(String itemId, String itemName, double unitPrice, int quantity, double packingCharge) {
            super(itemId, itemName, unitPrice, quantity);
            this.packingCharge = packingCharge;
        }

        @Override
        public double calculateBill() {
            double subtotal = unitPrice * quantity + packingCharge;
            double gst = subtotal * 0.05;
            double total = subtotal + gst;
            if (total > 1000) {
                total -= total * 0.10;
            }
            return total;
        }

        @Override
        public void displayDetails() {
            double subtotal = unitPrice * quantity + packingCharge;
            double gst = subtotal * 0.05;
            double discount = 0;
            double total = subtotal + gst;

            if (total > 1000) {
                discount = total * 0.10;
                total -= discount;
            }

            super.displayDetails();
            System.out.println("Packing Charge: " + packingCharge);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("GST: " + gst);
            System.out.println("Discount: " + discount);
            System.out.println("Total Bill: " + total);
        }
    }static class Delivery extends FoodItem {
        private double deliveryFee;

        public Delivery(String itemId, String itemName, double unitPrice, int quantity, double deliveryFee) {
            super(itemId, itemName, unitPrice, quantity);
            this.deliveryFee = deliveryFee;
        }

        @Override
        public double calculateBill() {
            double subtotal = unitPrice * quantity + deliveryFee;
            double gst = subtotal * 0.05;
            double total = subtotal + gst;
            if (total > 1000) {
                total -= total * 0.10;
            }
            return total;
        }

        @Override
        public void displayDetails() {
            double subtotal = unitPrice * quantity + deliveryFee;
            double gst = subtotal * 0.05;
            double discount = 0;
            double total = subtotal + gst;

            if (total > 1000) {
                discount = total * 0.10;
                total -= discount;
            }

            super.displayDetails();
            System.out.println("Delivery Fee: " + deliveryFee);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("GST: " + gst);
            System.out.println("Discount: " + discount);
            System.out.println("Total Bill: " + total);
        }
    }

    // Main method
    public static void main(String[] args) {
        FoodItem[] orders = new FoodItem[3];

        orders[0] = new DineIn("F101", "Paneer Butter Masala", 250.0, 4, 50.0);
        orders[1] = new Takeaway("F102", "Veg Biryani", 180.0, 2, 20.0);
        orders[2] = new Delivery("F103", "Chicken Pizza", 300.0, 4, 40.0);

        for (FoodItem item : orders) {
            item.displayDetails();
            System.out.println("----------------------------");
        }
    }
}


        

    
   
   

  
    