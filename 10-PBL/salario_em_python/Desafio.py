valorSalario = float(input())
valorBeneficio = float(input())

valorImposto = 0

if valorSalario>=0 and valorSalario <=1100:
    valorImposto = 0.05*valorSalario

elif valorSalario <=2500:
    valorImposto = 0.10*valorSalario

else:
    valorImposto = 0.15*valorSalario


saida = valorSalario - valorImposto + valorBeneficio

print("%.2f"%saida)