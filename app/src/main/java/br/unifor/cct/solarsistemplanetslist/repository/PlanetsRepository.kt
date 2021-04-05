package br.unifor.cct.solarsistemplanetslist.repository

import br.unifor.cct.solarsistemplanetslist.R
import br.unifor.cct.solarsistemplanetslist.model.Planet

object PlanetsRepository {

    fun getAllPlanets():List<Planet>{
        return listOf(
            Planet("Mercúrio","3,3011×10²³kg","Mercúrio é o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres. A sua órbita tem a maior excentricidade e o seu eixo apresenta a menor inclinação em relação ao plano da órbita dentre todos os planetas do Sistema Solar.", R.drawable.mercurio),
            Planet("Vênus","4,8685 ×10²⁴kg","Vênus é o segundo planeta do Sistema Solar em ordem de distância a partir do Sol, orbitando-o a cada 224,7 dias. Recebeu seu nome em homenagem à deusa romana do amor e da beleza Vénus, equivalente a Afrodite.", R.drawable.venus),
            Planet("Terra","5,9736×10²⁴kg","A Terra é o terceiro planeta mais próximo do Sol, o mais denso e o quinto maior dos oito planetas do Sistema Solar. É também o maior dos quatro planetas telúricos. É por vezes designada como Mundo ou Planeta Azul.", R.drawable.terra),
            Planet("Marte","6,4174×10²³kg","Marte é o quarto planeta a partir do Sol, o segundo menor do Sistema Solar. Batizado em homenagem ao deus romano da guerra, muitas vezes é descrito como o \"Planeta Vermelho\", porque o óxido de ferro predominante em sua superfície lhe dá uma aparência avermelhada.", R.drawable.marte),
            Planet("Júpiter","1,8986×10²⁷kg","Júpiter é o maior planeta do Sistema Solar, tanto em diâmetro quanto em massa, e é o quinto mais próximo do Sol. Possui menos de um milésimo da massa solar, contudo tem 2,5 vezes a massa de todos os outros planetas em conjunto. É um planeta gasoso, junto com Saturno, Urano e Netuno.", R.drawable.jupiter),
            Planet("Saturno","5,6846×10²⁶kg","Saturno é o sexto planeta a partir do Sol e o segundo maior do Sistema Solar atrás de Júpiter. Pertencente ao grupo dos gigantes gasosos, possui cerca de 95 massas terrestres e orbita a uma distância média de 9,5 unidades astronômicas.",R.drawable.saturno),
            Planet("Urano","(8,6810 ± 0,0013)×10²⁵kg","Urano é o sétimo planeta a partir do Sol, o terceiro maior e o quarto mais massivo dos oito planetas do Sistema Solar. Foi nomeado em homenagem ao deus grego do céu, Urano, o pai de Cronos (Saturno) e o avô de Zeus (Júpiter).", R.drawable.urano),
            Planet("Netuno","1,0243×10²⁶kg","Netuno é o oitavo planeta do Sistema Solar, o último a partir do Sol desde a reclassificação de Plutão para a categoria de planeta anão, em 2006. Pertencente ao grupo dos gigantes gasosos, possui um tamanho ligeiramente menor que o de Urano, mas maior massa, equivalente a 17 massas terrestres. Netuno orbita o Sol a uma distância média de 30,1 unidades astronômicas", R.drawable.netuno),
            Planet("Ceres","9,5×10²⁰kg","Ceres é um planeta anão localizado no cinturão de asteroides entre Marte e Júpiter, sendo o maior dos asteroides. Desde sua descoberta em janeiro de 1801 por Giuseppe Piazzi, Ceres recebeu diversas classificações, sendo inicialmente considerado planeta e posteriormente asteroide. Em 2006 foi enquadrado na categoria de planeta anão.", R.drawable.ceres),
            Planet("Plutão","(1,305 ± 0,007)×10²² kg","Plutão, formalmente designado 134340 Plutão, é um planeta anão do Sistema Solar e o nono maior e décimo mais massivo objeto observado diretamente orbitando o Sol. Originalmente classificado como um planeta, Plutão é atualmente o maior membro conhecido do cinturão de Kuiper, uma região de corpos além da órbita de Netuno.", R.drawable.plutao),
            Planet("Haumea","(4,2±0,1)×10²¹kg","Haumea, com a designação de planeta menor 136108 Haumea, antes conhecido astronomicamente como 2003 EL61, é um planeta anão do tipo plutoide, localizado a 43,3 UA do Sol, ou seja um pouco mais de 43 vezes a distância da Terra ao Sol, em pleno Cinturão de Kuiper. Haumea possui dois pequenos satélites naturais, Hiʻiaka e Namaka, que, acredita-se, sejam destroços que se separaram de Haumea devido a uma antiga colisão.", R.drawable.haumea),
            Planet("Makemake","≈3,1×10²¹kg","Makemake, formalmente designado como (136472) Makemake, é o terceiro maior planeta anão do Sistema Solar e o maior objeto transnetuniano conhecido na população dos cubewanos, com um diâmetro de cerca de dois terços o de Plutão. Possui um satélite conhecido, o S/2015 (136472) 1. Sua superfície é coberta por metano, etano e possivelmente nitrogênio e tem uma baixa temperatura média de cerca de 30 K (-243,2 °C).", R.drawable.makemake),
            Planet("Eris","(1,66±0,02)×10²²kg","Éris ou informalmente conhecido Décimo Planeta, é um planeta anão plutoide situado nos confins do sistema solar, em uma distância de 97 UA do Sol, em seu afélio, em uma região conhecida como disco disperso. Quando foi descoberto, ficou desde logo informalmente conhecido como o \"décimo planeta\", porque na época seu diâmetro estimado era maior do que o diâmetro do planeta-anão Plutão.", R.drawable.eris),

        )
    }

}