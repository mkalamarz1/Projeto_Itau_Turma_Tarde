"use strict";

const API = (function() {
    const tabela = document.querySelector('.tabelaBodyCliente');
    const tabela2 = document.querySelector('.tabelaBodyFluxo');
    const tabela3 = document.querySelector('.tabelaBodyInnerJoin');
    
    const TabelaCliente = async() => {
        const url = "http://localhost:8080/clientes";
        const data = await fetch(url);
        const json = await data.json();

        const clientes = json.map(n =>  {
            return `
                <tr>
                  <td>${n.ag}</td>
                  <td>${n.conta}</td>
                  <td>${n.nome}</td>
                  <td>${n.email}</td>
                  <td>${n.telefone}</td>
                  <td>R$${n.saldo}</td>
                </tr>
            `
          })
        tabela.innerHTML = clientes.join('');
    }
    const TabelaFluxo = async() => {
        const url = "http://localhost:8080/fluxo";
        const data = await fetch(url);
        const json = await data.json();

        const fluxo = json.map(m =>  {
            return `
                <tr>
                  <td>${m.ag}</td>
                  <td>${m.conta}</td>
                  <td>${m.fluxo}</td>
                  <td>R$${m.entrada}</td>
                  <td>R$${m.saida}</td>
                </tr>
            `
          })
        tabela2.innerHTML = fluxo.join('');
    }

    const TabelaInnerJoin = async() => {
        const url = "http://localhost:8080/innerjoin";
        const data = await fetch(url);
        const json = await data.json();

        const innerJoin = json.map(i =>  {
            return `
                <tr>
                  <td>${i.ag}</td>
                  <td>${i.conta}</td>
                  <td>${i.nome}</td>
                  <td>R$${i.entrada}</td>
                  <td>R$${i.saida}</td>
                </tr>
            `
          })
        tabela3.innerHTML = innerJoin.join('');
    }

    TabelaCliente();
    TabelaFluxo();
    TabelaInnerJoin();
})();