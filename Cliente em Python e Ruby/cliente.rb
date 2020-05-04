require 'savon'

client  = Savon.client(wsdl: 'http://localhost:10000/conversor?wsdl')

puts "Bem-vindo ao Conversor de Temperaturas, digite: \n1 para digitar em Celsius: \n2 para digitar em Fahrenheit: "
escolT = gets

puts "Digite o valor da temperatura: "
temp = gets

response = client.call(:conversor, message: { escolhaN: escolT, temperat: temp})

puts response.body[:conversor_response][:return]