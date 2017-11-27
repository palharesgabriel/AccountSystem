package com.accountsystem

data class Credor(
		var codCredor: Int,
		var nomeCredor: String)

data class Compra(
		var codCompra: Int,
		var dataCompra: String,
		var valorCompra: Int,
		var tipo: Int,
		var credor: Credor)

data class Parcela(
		var compra: Compra,
		var sequencia: Int,
		var valorParcela: Int,
		var dataVenc: String,
		var dataPaga: String,
		var multa: Int,
		var juros: Int)
