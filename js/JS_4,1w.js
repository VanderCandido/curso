var banco = {
    conta: "29.9519-70",
    saldo: 950.00,
    tipo: "Corrente",
    agencia: "5432-1"
}

var buscar_saldo = function(){
    console.log("Saldo: " + banco.saldo)
}

var deposito = function(valor){
    banco.saldo += valor;
}

var saque = function(valor){
    banco.saldo -= valor;
}

var consulta_conta = function(){
    console.log("Número da conta: " + banco.conta);
}

var readlineSync = require("readline-sync");

console.log("Consultando conta:");
consulta_conta();
buscar_saldo();
var valordeposito = readlineSync.question("\nQuanto deseja depositar? ");
valor = parseFloat(valordeposito);
deposito(valor);
buscar_saldo();
var valorsaque = readlineSync.question("\nQuanto deseja sacar? ");
valor = parseFloat(valorsaque);
saque(valor)
buscar_saldo();
