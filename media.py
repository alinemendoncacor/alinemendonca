#!/usr/bin/python3
n=int(input('numero de alunos'))
mediag=0

for i in range(0,n,1):

    nota1=input("digite a 1a nota")
    nota1=float(nota1)
    nota2=input("digite a 2a nota")
    nota2=float(nota2)
    media=(nota1+nota2)/2
    print("{}{}".format("Sua media é ",media))
    mediag+=media
print("{}{}".format("Media geral ",media/n))

