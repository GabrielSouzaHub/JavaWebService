from suds.client import Client
url = "http://localhost:10000/conversor?wsdl"
client = Client(url)
escolT = int(input("Bem-vindo ao Conversor de Temperaturas, digite: \n1 para digitar em Celsius: \n2 para digitar em Fahrenheit:\n "))
temp = int(input("Digite o valor da temperatura: "))
response = client.service.conversor(escolT,temp)
print(response)
