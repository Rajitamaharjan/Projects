def read_laptops():
    filename="data.txt"
    laptops = []
    with open(filename, 'r') as f:
        for line in f:
            laptop_data = line.strip().split(', ')
            laptop = {
                'name': laptop_data[0],
                'brand': laptop_data[1],
                'price': float(laptop_data[2].strip('$')),
                'quantity': int(laptop_data[3]),
                'processor': laptop_data[4],
                'graphics_card': laptop_data[5]
            }
            laptops.append(laptop)
    return laptops



