number = int(input("Enter a set of number or -1 to exit: "))

largest = number
smallest = number 

while True:
    number = int(input("Enter a set of number or -1 to exit: "))
    if number == -1:
        break
    if number > largest:
        largest = number
    if number < smallest:
        smallest = number
print("The largest is", largest)
print("The smallest is", smallest)
    


