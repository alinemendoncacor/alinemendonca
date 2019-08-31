#!/usr/bin/python3
qtd = int(input('Quantidade de notas: '))
soma = 0
for x in range(qtd):
    nota = float(input('nota{}: '.format(x+1)))
    if nota<=10 and nota>=0:
        soma+=nota
    else:
        print('nota invalida')
        qtd-=1
media = soma / qtd
print("Media {}".format(media))
