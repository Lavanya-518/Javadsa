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
    }
     class DineIn extends FoodItem{
        private double servicecharge;
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


    }
}