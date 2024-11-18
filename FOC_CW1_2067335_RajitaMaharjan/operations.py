import datetime
import read
import write

# Function to display all available laptops
def display_laptops(laptops):
    for i, laptop in enumerate(laptops):
        print(f"{i+1}. {laptop['name']} ({laptop['brand']}) - ${laptop['price']} - Stock: {laptop['quantity']}")

#function to sell laptop
def sell_laptop(laptops_list, customer_name, shipping_cost):

        laptops = read.read_laptops()
        invoice_items=[]
        grand_total = shipping_cost
        for laptop_info in laptops_list:
            laptop_name = laptop_info['name']
            brand_name = laptop_info['brand']
            quantity = laptop_info['quantity']
            found = False
            for laptop in laptops:
                if laptop['name'] == laptop_name and laptop['brand'] == brand_name:
                    current_stock = laptop['quantity']
                    if current_stock < quantity:
                        raise ValueError("Sorry, We do not have enough stock!")
                    else:
                        laptop_price = laptop['price']
                        total_amount = laptop_price * quantity 
                        grand_total += total_amount
                        item={'name':laptop_name,'brand':brand_name,'quantity':quantity,'price':laptop_price,'total_amount':total_amount}
                        invoice_items.append(item)
                        current_stock = current_stock - quantity
                        if current_stock == 0:
                            laptops.remove(laptop)
                        else:
                            laptop['quantity'] = current_stock
                        write.write_laptops("data.txt", laptops)
                        # call write invoice method
                        write.sales_invoice(customer_name, invoice_items, shipping_cost,grand_total)
                        found = True
                        break
            if not found:
                raise ValueError(f" \n\n ERRROR !!! Laptop '{laptop_name}' with brand '{brand_name}' not found!")
    



# Function to order laptops from the manufacturer and generate an invoice
def order_laptops(company_name, laptop_list):
    total_amount_without_vat=0
    grand_total_with_vat=0
    invoice_items=[]
    laptops = read.read_laptops()
    for laptop in laptop_list:
        laptop_name = laptop['name']
        brand = laptop['brand']
        quantity = laptop['quantity']
        amount_without_vat = laptop['amount_without_vat']
        total_amount_without_vat += amount_without_vat 
        found = False
        for laptop in laptops:
            if laptop['name'] == laptop_name and laptop['brand'] == brand:
                laptop['quantity'] = laptop['quantity'] + quantity
                found = True
                item={'name':laptop_name,'brand':brand,'quantity':quantity,'amount_without_vat':amount_without_vat}
                invoice_items.append(item)
                vat = 0.13 * total_amount_without_vat
                grand_total_with_vat = total_amount_without_vat + vat
                break
        if not found:
            raise ValueError(f" \n\n ERRROR !!! Laptop '{laptop_name}' with brand '{brand}' not found!")
    if found:
        write.write_laptops("data.txt", laptops)
        write.order_invoice(invoice_items, company_name, vat, grand_total_with_vat)


