def CARACTER(s):
  return print("A Senha tem",len(s),"caracter(s)!")

def LETRAS(s):
  if(s.isalpha() == True):
    return print("A senha é constituida apenas por letras")
  else:
    return print("Apenas letras!")

def MAIUSCULA(s):
  return s.title()   

string = input("Digite uma senha tipo string: ")
CARACTER(string)
LETRAS(string)
MAIUSCULA(string)
