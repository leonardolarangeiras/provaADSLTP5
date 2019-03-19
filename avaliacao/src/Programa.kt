fun main(args: Array<String>){
    var obraProva = Obra("Prova")

    //Equipamentos
    var trator = Equipamento("Trator",15.00)
    var utilizacaoTrator = EquipamentoUtilizacao(trator,5, 30)
    obraProva.usaEquipamento(utilizacaoTrator)

    var andaime = Equipamento("Andaime",2.00)
    var utilizacaoAndaime = EquipamentoUtilizacao(andaime, 5,40)
    obraProva.usaEquipamento(utilizacaoAndaime)

    var betoneira = Equipamento("Betoneira",25.00)
    var utilizacaoBetoneira = EquipamentoUtilizacao(betoneira, 5,40)
    obraProva.usaEquipamento(utilizacaoBetoneira)

    //Insumos
    var areia = Insumo("Areia",3.00)
    var utilizacaoAreia = InsumoUtilizacao(areia,50)
    obraProva.usaInsumo(utilizacaoAreia)

    var cimento = Insumo("Cimento",5.00)
    var utilizacaoCimento = InsumoUtilizacao(cimento,40)
    obraProva.usaInsumo(utilizacaoCimento)

    var cal = Insumo("Cal",20.00)
    var utilizacaoCal = InsumoUtilizacao(cal,120)
    obraProva.usaInsumo(utilizacaoCal)

    //Mao de Obra
    var arquiteto = MaoDeObra("Arquiteto",8.100)
    var utilizacaoArquiteto = MaoDeObraUtilizacao(arquiteto,1, 10)
    obraProva.usaMaoDeObra(utilizacaoArquiteto)

    var engcivil = MaoDeObra("Eng Civil",5.100)
    var utilizacaoEngCivil = MaoDeObraUtilizacao(engcivil,1, 15)
    obraProva.usaMaoDeObra(utilizacaoEngCivil)

    var pedreiro = MaoDeObra("Pedreiro",40.10)
    var utilizacaoPedreiro = MaoDeObraUtilizacao(pedreiro,5, 40)
    obraProva.usaMaoDeObra(utilizacaoPedreiro)


    println("Obra: ${obraProva.descricao}")
    println("Total Insumos R$ ${obraProva.gastosInsumos()}")
    println("Total Mão de Obra R$ ${obraProva.gastosMaoDeObra()}")
    println("Total Equipamentos R$ ${obraProva.gastosEquipamento()}")
    println("Total da Obra R$ ${obraProva.gastosObra()}")
}