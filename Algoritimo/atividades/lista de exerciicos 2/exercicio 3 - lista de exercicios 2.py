cont = 0
soma = 0
print("Digite um valor")
x = int(input())
while x != 0:
    soma = soma + x
    cont = cont + 1
    print("Digite outro valor")
    x = int(input())
soma = float(soma) / cont
print("A média é: " + str(soma))
