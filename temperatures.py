def convert_temperature():
    print("Enter which conversion you want:")
    print("Select '1' Celsius to Fahrenheit")
    print("Select '2' Fahrenheit to Celsius")
    #Prompt user input for which type
    tempType = input("Enter choice '1' or '2': ")
    
    #Prompt to enter temperature value
    temp = float(input("Enter temperature value: "))
    
    if tempType == '1':
        # (C * 9/5) + 32
        result = (temp * 9/5) + 32
        print(f"{temp}°C is equal to {result:.2f}°F")
    elif tempType == '2':
        # (F - 32) * 5/9
        result = (temp - 32) * 5/9
        print(f"{temp}°F is equal to {result:.2f}°C")
    else:
        print("Invalid selection.")

convert_temperature()
