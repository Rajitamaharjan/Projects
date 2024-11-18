import read
import operations
import write

def main():
    # Read the laptops from the file
    
    print("\t \t \t \t Welcome to Rajita Laptop")
    print("------------------------------------------------------------------------------")
    print("\t \t \t Address : Kamalpokhari, Kathmandu")
    print("------------------------------------------------------------------------------")

    # Ask user whether they want to order from the manufacturer or sell to a customer
    while True:
        try:
            laptops = read.read_laptops()
            print("\n\nLaptops available in the shop:")
            operations.display_laptops(laptops)
            print("\n1. Buy from the manufacturer")
            print("2. Sell to the customer")
            print("3. Exit\n")
            
            userinput = int(input("Please select any of the options: "))
            if userinput == 1:
                added_laptop_list=[]
                distributor = input("Enter the distributor's name: ")
                while True:
                    brand_name = input("Enter the brand name: ")
                    name = input("Enter the name of the laptop: ")
                    quantity = int(input("Enter the quantity of laptops: "))
                    amount_without_vat = int(input("Enter total amount without VAT: "))
                    added_laptop = {'name': name, 'brand': brand_name, 'quantity': quantity,'amount_without_vat':amount_without_vat}
                    added_laptop_list.append(added_laptop)
                    multiple_laptop = input("Do you want to add more laptops? (y/n): ")
                    if multiple_laptop == 'n':
                        break
                try:
                    operations.order_laptops(distributor, added_laptop_list)
                    print("Order placed successfully!")
                except ValueError as e:
                    print (e)
                    
            elif userinput == 2:
                added_laptop_list=[]
                while True:
                    brand_name = input("Enter the brand name of the laptop to sell: ")
                    name = input("Enter the name of the laptop to sell: ")
                    quantity = int(input("Enter the quantity of laptops to sell: "))
                    added_laptop = {'name': name, 'brand': brand_name, 'quantity': quantity}  
                    added_laptop_list.append(added_laptop)  
                    multiple_laptop = input("Do you want to add more laptops? (y/n): ")
                    if multiple_laptop == 'n':
                        break
                customer_name = input("Enter the name of the customer: ")
                shipping = input("Do you want to ship the laptop? (y/n): ")
                if shipping == 'y':
                    shipping_cost = float(input("Enter the shipping cost: "))
                else:
                    shipping_cost = 0
                try:
                    operations.sell_laptop(added_laptop_list, customer_name, shipping_cost)
                    print("Laptop(s) sold successfully!")
                except ValueError as e:
                    print (e)
            elif userinput == 3:
                break
            else:
                print("Invalid choice. Please enter '1', '2', or '3'.")
        except ValueError as e:
            print ("\n\n Please enter a valid input.")

if __name__ == '__main__':
    main()
