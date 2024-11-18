import datetime

datetime=datetime.datetime.now().strftime('%Y-%m-%d %H-%M-%S')

def write_laptops(filename, laptops):
    with open(filename, 'w') as f:
        for laptop in laptops:
            f.write(f"{laptop['name']}, {laptop['brand']}, ${laptop['price']}, {laptop['quantity']}, {laptop['processor']}, {laptop['graphics_card']}\n")

def sales_invoice(customer_name, laptop_dict, shipping_cost, grand_total):
    # create new file with file name format customer_name+purchase_date
    with open(f"SalesInvoice_{customer_name}_{datetime}.txt", "w") as f:
        f.write("Invoice\n")
        f.write(f"Customer Name: {customer_name}\n")
        f.write(f"Date of Purchase: {datetime}\n")
        f.write("Item Details\n")
        f.write("Laptop Name \t Brand Name \t Quantity \t Unit Price \t Total Amount\n")
        for laptop_info in laptop_dict:
            f.write(f"{laptop_info['name']} \t\t\t {laptop_info['brand']} \t\t\t {laptop_info['quantity']} \t\t\t {laptop_info['price']} \t\t\t\t ${laptop_info['total_amount']}\n")
        
        f.write(f"Shipping Cost: \t\t\t\t\t\t\t\t\t${shipping_cost}\n")
        f.write(f"Grand Total: \t\t\t\t\t\t\t\t\t${grand_total}\n")

def order_invoice(invoice_items, company_name, vat, grand_total_with_vat):
    # create new file with file name format OrderInvoice_company_name_date_time
    with open(f"OrderInvoice_{company_name}_{datetime}.txt", "w") as f:
        f.write("\t\tOrder Invoice\n")
        f.write(f"Company Name: {company_name}\n")
        f.write(f"Date of Order: {datetime}\n")
        f.write("Item Details\n")
        f.write("Laptop Name \t Brand Name \t Quantity \t Amount (excluding VAT)\n")
        for item in invoice_items:
            f.write(f"{item['name']} \t\t\t {item['brand']} \t\t\t {item['quantity']} \t\t\t\t ${item['amount_without_vat']}\n")
        
        f.write(f"\nTotal Amount (excluding VAT): \t\t\t\t\t\t${grand_total_with_vat - vat:.2f}\n")
        f.write(f"VAT: \t\t\t\t\t\t\t\t\t${vat:.2f}\n")
        f.write(f"Total Amount (including VAT): \t\t\t\t\t\t${grand_total_with_vat:.2f}\n")
