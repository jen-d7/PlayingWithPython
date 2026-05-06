#If you run these in an IDE it does basic math processes

#Addition

def sum(a, b):
    return (a + b)

a = int(input('Enter 1st number: '))
b = int(input('Enter 2nd number: '))

print(f'Sum of {a} and {b} is {sum(a, b)}')

#Subtraction
def subt(a, b):
    return (a - b)

a = int(input('Enter 1st number: '))
b = int(input('Enter 2nd number: '))

print(f'Subtraction of {a} and {b} is {subt(a, b)}')

#Multiplication

def multi(a, b):
    return (a * b)

a = int(input('Enter 1st number: '))
b = int(input('Enter 2nd number: '))

print(f'Product of {a} and {b} is {multi(a, b)}')

#Division
def div(a, b):
    return (a / b)

a = int(input('Enter 1st number: '))
b = int(input('Enter 2nd number: '))

print(f'The division of {a} and {b} is {div(a, b)}')

