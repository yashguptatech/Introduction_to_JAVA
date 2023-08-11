car_no = input("Enter your car number: ")

# sum of even digits of car number
even_sum = 0
# sum of odd digits of car number
odd_sum = 0

# iterating over the car number
for i in range(len(car_no)):
    # if the digit is even
    if i % 2 == 0:
        # adding the digit to even_sum
        even_sum += int(car_no[i])
    else:
        # adding the digit to odd_sum
        odd_sum += int(car_no[i])

# checking if the sum of even digits is divisible by 4
if even_sum % 4 == 0:
    # checking if the sum of odd digits is divisible by 3
    if odd_sum % 3 == 0:
        # printing the car number is lucky
        print("Your car number is lucky")
    else:
        # printing the car number is not lucky
        print("Your car number is not lucky")

# checking if the sum of even digits is divisible by 3
elif even_sum % 3 == 0:
    # checking if the sum of odd digits is divisible by 4
    if odd_sum % 4 == 0:
        # printing the car number is lucky
        print("Your car number is lucky")
    else:
        # printing the car number is not lucky
        print("Your car number is not lucky")
        