#language:pt

Funcionalidade: Formulario de cotacao de seguro
	Criando testes que preencham o formulario e verifiquem a mensagem de sucesso

  Cenario: Visualizar aba Enter Insurant Data ao cadastrar os dados do carro
	Dado que estou na pagina "http://sampleapp.tricentis.com/101/app.php"
	Quando eu selecionar uma opcao no campo Make
	E selecionar uma opcao no campo Model
	E informar a performance "600" no campo Engine Performance
	E informar a data "12/10/2020" no campo Date of Manufacture
	E selecionar a opcao "1" no campo Number of Seats
	E selecionar a opcao "Diesel" no campo Fuel Type
	E informar o valor "20000" no campo List Price
	E informar o dado "123456" no campo License Plate Number
	E informar o valor "10000" no campo Annual Mileage
	Entao clicar no botao Next

	
	Dado eu devo visualizar a aba "Enter Insurant Data"
	E informar o nome "Chayene" no campo First Name
	E informar o sobrenome "Natany" no campo Last Name
	E informar a data "15/10/1992" no campo Date of Birth
	E selecionar a opcao female no campo Gender
	E informar o endereco "Rua Teste, 123" no campo Street Address
	E selecionar a opcao Brazil no campo Country
	E informar o cep "04949049" no campo Zip Code
	E informar a cidade "São Paulo" no campo City
	E selecionar a opcao Employee no campo Occupation
	E clicar na opcao Speeding no campo Hobbies
	Entao clicar novamente no botao Next

	Dado que eu estou na aba "Enter Product Data"
	E informar a data "01/02/2021" no campo Start Date
	E selecionar a opcao 300000000 no campo Insurance Sum
	E selecionar a opcao Bonus 1 no campo Merit Rating
	E seleciocar a opcao No Coverage no campo Damage Insurance
	E selecionar a opcao Euro Protection no campo Optional Products
	E selecionar a opcao Yes no campo Courtesy Car
	Entao clicar na parte do botao Next

	Dado que eu estou na parte "Select Price Option"
	E selecionar a opcao Ultimate no campo Select Option
	Entao novamente clicar no botao Next
	
	Dado que estou na ultima aba "Send Quota"
	E informar o email "chayene.natany@gmail.com" no campo E-mail
	E informar username "chayene" no campo Username
	E informar o password "12345678" no campo Password
	E informar o password "12345678" no campo Confirm Password
	E clicar no botao Send
	Entao devo visualizar a mensagem "Sending e-mail success!"






