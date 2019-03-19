class Obra(var descricao: String){
    private val insumos = arrayListOf<InsumoUtilizacao>()
    private val maodeobra = arrayListOf<MaoDeObraUtilizacao>()
    private val equipamentos = arrayListOf<EquipamentoUtilizacao>()

    fun usaInsumo(insumoConsumido: InsumoUtilizacao){
        this.insumos.add(insumoConsumido)
    }

    fun usaMaoDeObra(maodeobra: MaoDeObraUtilizacao){
        this.maodeobra.add(maodeobra)
    }

    fun usaEquipamento(equipamento: EquipamentoUtilizacao){
        this.equipamentos.add(equipamento)
    }

    fun gastosInsumos(): Double{
        var total: Double = 0.00
        for (i in insumos){
            total += i.insumo.preco * i.quantidade
        }
        return total
    }

    fun gastosMaoDeObra(): Double{
        var total: Double = 0.00
        for (i in maodeobra){
            total += i.horas * (i.maodeobra.preco * i.qtd)
        }
        return total
    }

    fun gastosEquipamento(): Double{
        var total: Double = 0.00
        for (i in equipamentos){
            total += i.horas * (i.equipamento.preco * i.qtd)
        }
        return total
    }

    fun gastosObra(): Double{
        return gastosInsumos() + gastosMaoDeObra() + gastosEquipamento()
    }
}