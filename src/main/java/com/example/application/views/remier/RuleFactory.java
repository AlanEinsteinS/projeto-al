package com.example.application.views.remier;

import java.util.ArrayList;
import java.util.List;

public class RuleFactory {

    public static List<Rule> createRules() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new Rule("Testes", 
            "No Ordem Remier RPG, os testes de ação funcionam assim:<br><br>" +
            "Mestre define a perícia e a dificuldade (DT).<br>" +
            "Jogador rola dados baseados na perícia e no atributo relevante, adiciona bônus se for treinado e declara o resultado.<br>" +
            "Mestre compara o resultado com a DT: se for igual ou maior, a ação é bem-sucedida; se não, há falha.<br>" +
            "Exemplo: Cairos tenta entrar na prefeitura sem ser visto. O mestre define a dificuldade como 20. Cairos rola os dados, obtém 16, e com bônus de Treinamento totaliza 21, passando no teste e entrando na prefeitura."
        ));


rules.add(new Rule("DTs", "DTs, ou Dificuldades de Teste, é o número que o teste deve atingir para a ação.<br>"
        + "ser bem-sucedida. O mestre pode anunciar a DT ou mantê-la em segredo, a sua escolha."));


rules.add(new Rule("Personagem", "um personagem fictício, interpretado por um jogador. Os personagens são<br>"
        + "os protagonistas da história. Normalmente, são membros da Ordo Remier; por isso, também são chamados de agentes"));

rules.add(new Rule("NPCs", "Personagem interpretado pelo mestre, incluindo coadjuvantes e antagonistas."));

rules.add(new Rule("Pessoa", "Ser humano, seja um personagem ou NPC."));

rules.add(new Rule("Animal", "Ser vivo não humano, como cães e cavalos."));

rules.add(new Rule("Criatura", "Ser criado por entidades do Outro Lado, geralmente monstros, como zumbis e criaturas sobrenaturais."));

rules.add(new Rule("Ser", "Pessoa, animal ou criatura."));

rules.add(new Rule("ATRIBUTOS", "Competências básicas de um personagem, incluindo Agilidade, Força, Intelecto, Presença e Vigor."));

rules.add(new Rule("Pontos de Vida (PV)", "Representam a saúde do personagem. Se PV chega a 0, o personagem começa a morrer."));

rules.add(new Rule("Pontos de Esforço (PE)", "Representam a energia/stamina do personagem para usar habilidades."));

rules.add(new Rule("Sanidade (SAN)", "Representa a resiliência mental. Se SAN chega a 0, o personagem começa a enlouquecer."));

rules.add(new Rule("PERICIAS(explicação)", "Conhecimento e competência em tarefas específicas, medidas em quatro graus: Leigo (+0)<br> Treinado (+5)<br> Veterano (+10)<br> Expert (+15)<br> Master (+20)<br>"));

rules.add(new Rule("Modificador", "Afeta características ou testes, podendo ser um número que se soma ou subtrai, ou quantidade de dados rolados. Modificadores positivos são bônus e negativos são penalidades."));

rules.add(new Rule("Turnos e Rodadas", "Medidas de tempo em cenas de ação, onde cada personagem age em seu turno e, após todos agirem, uma nova rodada começa."));

rules.add(new Rule("Cena", "Parte distinta da história que começa e termina conforme o andamento da trama, não o tempo."));

rules.add(new Rule("Missão", "História completa com início, meio e fim, composta por várias cenas."));

rules.add(new Rule("Série", "Sequência de missões com uma trama maior, como um grande mistério ou objetivo."));

rules.add(new Rule("Sessão de Jogo", "cada sessão de jogo, ou só sessão”, para simplificar, é uma partida de RPG"));

rules.add(new Rule("Atributos - Agilidade", "Coordenação motora, velocidade de reação e destreza manual. Afeta perícias como Acrobacia, Furtividade e Pontaria."));

rules.add(new Rule("Atributos - Força", "Potência muscular e habilidade atlética. Influencia Atletismo, Luta e rolagens de dano corpo a corpo."));

rules.add(new Rule("Atributos - Intelecto", "Raciocínio, memória e conhecimento geral. Base para perícias como Ciências, Medicina e Tecnologia. Afeta a compreensão do Outro Lado e o número de rituais aprendidos."));

rules.add(new Rule("Atributos - Presença", "Sentidos, força de vontade e habilidades sociais. Base para Diplomacia, Intimidação e Percepção. Concede pontos de esforço adicionais por nível de exposição."));

rules.add(new Rule("Atributos - Vigor", "Saúde e resistência física. Base para Fortitude e concede pontos de vida adicionais. Aumentos no Vigor retroativamente aumentam os PV."));

rules.add(new Rule("Geração de Atributos", "Quando você cria um personagem, todos os seus atributos começam em 1 e você recebe 4 pontos para distribuir entre eles como quiser. Você também pode reduzir um atributo para 0 para receber 1 ponto adicional. O valor máximo inicial que você pode ter em cada atributo é 3"));

rules.add(new Rule("ORIGENS", "A origem de um personagem descreve sua vida antes de ingressar na Ordem Principal e como isso influencia sua carreira de investigador. Você pode escolher uma origem que combine com o conceito do personagem ou rolar 2d20 e consultar a <b>TABELA 1.1 (página 27 do PDF)</b> para determinar aleatoriamente."));

rules.add(new Rule("CLASSES", "Sua classe indica o treinamento que você recebeu na Ordem para enfrentar os perigos do Outro Lado. Em termos de jogo, é a sua característica mais importante, pois define o que você faz e qual é o seu papel no grupo de investigadores. Ordem Remier RPG contém três classes, que representam os principais arquétipos de heróis em histórias de terror e suspense."));

rules.add(new Rule("Classes - Combatente", "Perito em armas brancas e de fogo, atuando na linha de frente contra o paranormal. Ideal para quem deseja ser perigoso e durão."));

rules.add(new Rule("Classes - Especialista", "Habilidoso e versátil, com conhecimento e esperteza para resolver problemas diversos. Perfeito para quem busca uma abordagem prática e adaptável."));

rules.add(new Rule("Classes - Ocultista", "Estudioso do paranormal, focado em rituais e poderes do Outro Lado. Ideal para quem quer dominar o oculto, ciente de que há custos associados. (odeio!)"));

rules.add(new Rule("CARACTERÍSTICAS DAS CLASSES", "-- Pontos de Vida, de Esforço e Sanidade -- Sua classe define com quantos PV, PE e SAN você começa.<br>"
                +
                "-- Perícias -- Sua classe fornece perícias treinadas adicionais, além daquelas recebidas pela origem. Se receber uma perícia que já havia recebido pela origem, escolha outra. Veja mais no Capítulo 2.<br>"
                +
                "-- Proficiências -- Os tipos de equipamento que você sabe usar. Veja mais no Capítulo 3."));

rules.add(new Rule("Classes - Poderes", "Cada classe tem uma habilidade “Poder” que permite escolher um poder de uma lista específica, com alguns exigindo pré-requisitos. Você só pode escolher um poder uma vez por NEX, a menos que indicado o contrário. Poderes contam como habilidades."));

rules.add(new Rule("Classes - Trilhas", "Representam conjuntos de habilidades especializadas dentro da classe. Você escolhe uma trilha ao atingir NEX 15% e ganha novas habilidades conforme aumenta seu NEX. Cada classe possui diversas trilhas para personalizar seu estilo de jogo."));

rules.add(new Rule("Exposição Paranormal (NEX)", "Mede o grau de exposição de um personagem ao Outro Lado. Começa em 5% para iniciantes e aumenta em 5% a cada missão bem-sucedida. Um NEX mais alto indica maior experiência e poder."));

rules.add(new Rule("Combate - Ataques", "Anote as estatísticas das armas na ficha. O teste de ataque é feito com o bônus de Luta (corpo a corpo) ou Pontaria (distância), mais quaisquer outros bônus. O dano, crítico e alcance são definidos pela arma."));

rules.add(new Rule("Combate - Defesa", "Representa a dificuldade de acertar você em combate. É calculada como 10 + Agilidade + bônus de habilidades, equipamentos e condições. A DT do ataque é igual à Defesa do inimigo."));

rules.add(new Rule("Combate - Deslocamento", "A velocidade com que você se move, geralmente 9 metros (6 quadrados), podendo ser alterada por habilidades."));

rules.add(new Rule("Atributo-Base", "É o atributo principal associado a uma perícia. No teste, você rola uma quantidade de d20 igual ao valor do atributo-base e escolhe o melhor resultado. Por exemplo, para Ciências com Intelecto 4, rola 4d20 e escolhe o melhor. O mestre pode, a seu critério, usar outros atributos para alguns testes de perícias.\n"));

rules.add(new Rule("Testes e Treinamento", "Algumas perícias só podem ser usadas se você for treinado nelas. Treinamento específico pode ser necessário para certos usos da perícia."));

rules.add(new Rule("Bônus de Perícia", "Mede sua competência em uma perícia. É adicionado ao maior resultado dos dados rolados no teste. O bônus depende do grau de treinamento:<br>" +
                "<b>|| Destreinado: +0<br>" +
                "<b>|| Treinado: +5<br>" +
                "<b>|| Veterano: +10<br>" + 
                "<b>|| Expert: +15<br>" +
                "<b>|| Master: +20<br>"));

rules.add(new Rule("Penalidade de Carga", "Perícias que exigem liberdade de movimento aplicam a penalidade de carga total ao teste. Consulte o Capítulo 3 para detalhes."));

rules.add(new Rule("Kit de Perícia - Item", "Algumas perícias requerem ferramentas específicas. Se não tiver o kit apropriado, sofre uma penalidade de -5 no teste."));

rules.add(new Rule("PERICIAS", "<b>Da Pagina 49 ate 57 no livro.<b>"));

rules.add(new Rule("EQUIPAMENTOS", "Armas, dispositivos tecnológicos e itens amaldiçoados são essenciais para enfrentar o paranormal. O uso de equipamentos é limitado por: PATENTE || CAPACIDADE DE CARGA"));

rules.add(new Rule("PATENTE", "Representa sua posição hierárquica na Ordem, determinando o acesso a itens e o limite de crédito para compras. Diferente do NEX, que mede seu poder individual, a patente define os recursos disponíveis para você em cada missão. Você começa como recruta e é promovido acumulando pontos de prestígio (PP). A Tabela 3.1(PAG. 60) mostra os PP necessários para cada patente e os recursos associados."));

rules.add(new Rule("PONTOS DE PRESTÍGIO", "Após cada missão, o grupo é avaliado e ganha ou perde pontos de prestígio com base na eficiência."));

rules.add(new Rule("Promoção - PATENTE", "Acumulando PP suficiente, você é promovido, e os benefícios da nova patente são aplicados na próxima missão. Por exemplo, ao alcançar 58 PP, você sobe para agente especial e ganha acesso a itens de categorias superiores."));

rules.add(new Rule("Rebaixamento - PATENTE", "Se você perder PP e ficar abaixo do mínimo para sua patente, será rebaixado, perdendo acesso a itens e precisando devolvê-los. Pode recuperar esses itens se for promovido novamente."));

rules.add(new Rule("ARMAS", "Armas são classificadas de acordo com a proficiência necessária para usá-la (simples, táticas, pesadas), propósito (ataque corpo a corpo ou à distância) e empunhadura (leve, uma mão ou duas mãos)."));

rules.add(new Rule("ARMAS - Alcance", "Armas com alcance podem ser usadas para ataques à distância. As categorias de alcance são curto (9m, ou 6 quadrados em um mapa), médio (18m ou 12 quadrados), longo (36m ou 24 quadrados) e extremo (90m ou 60 quadrados). Você pode atacar dentro do alcance sem sofrer penalidades. Você pode atacar até o dobro do alcance, mas sofre –5 no teste de ataque. Armas sem valor de alcance podem ser arremessadas em alcance curto com –5 no teste de ataque."));

rules.add(new Rule("ARMAS - Tipo", "Indica o tipo de dano causado pela arma. Armas tipicamente causam dano por corte (C), impacto (I), perfuração (P) ou balístico (B). Muitas criaturas são resistentes ou imunes a certos tipos de dano, então possuir armas diferentes é uma boa estratégia."));

rules.add(new Rule("ARMAS - Espaço", " A quantidade de espaços que a arma ocupa em seu inventário. Inclui acessórios básicos da arma, como coldres para pistolas e bainhas para espadas, mas não munição."));

rules.add(new Rule("MUNIÇÕES", "A munição é representada por “pacotes”, como uma caixa de balas ou aljava de flechas. Cada pacote é suficiente para uma ou mais cenas de combate, independentemente de quantos disparos (ataques) você fizer em cada uma. Quando você usar a munição pelo número de cenas especificado, gasta o pacote.Esse sistema abstrato representa o fato de que no caos de um combate vários disparos são dados, além de que parte da munição pode apresentar problemas ou se perder. Ele existe para manter o foco na ação e eliminar a necessidade de controlar o consumo de munição a cada disparo."));

rules.add(new Rule("MODIFICAÇÕES PARA ARMAS", "Ao escolher seu equipamento no início de uma missão, você pode requisitar armas modificadas, com uma ou mais melhorias. Cada modificação aumenta a categoria do item em I e fornece certos benefícios. Assim, uma katana (categoria I) com as modificações certeira e perigosa é uma arma de categoria III. Modificações iguais não se acumulam — uma arma não pode ser certeira duas vezes, por exemplo"));

rules.add(new Rule("PROTEÇÕES", "A maioria dos civis e personagens sem treinamento em combate vestem roupas comuns. Pessoas esperando encrenca, por outro lado, podem usar proteções — trajes reforçados ou blindados."));

rules.add(new Rule("MODIFICAÇÕES PARA PROTEÇÕES", "Assim como armas, proteções podem ser modificadas. Cada modificação aumenta a categoria do item em I e fornece certos benefícios. Modificações iguais não se acumulam."));

rules.add(new Rule("Equipamento Geral", "Além de armas e proteções, a Ordem dispõe de um arsenal de itens utilitários, que podem ser a diferença entre o sucesso e o fracasso de qualquer agente. Equipamentos gerais são divididos em acessórios, explosivos, itens operacionais e itens paranormais. Vários itens gerais fornecem bônus em perícias. Bônus fornecidos por itens não são cumulativos — por exemplo, um personagem com um utensílio e uma vestimenta que forneçam bônus em Diplomacia recebe o benefício de apenas um dos itens."));

rules.add(new Rule("Modificações para Acessórios", "Assim como armas, itens da categoria acessórios podem ser modificados. Cada modificação aumenta a categoria do item em I e fornece certos benefícios. Usando modificações, é possível criar itens variados. Por exemplo, para criar um “smartphone hacker”, podemos começar com um utensílio que concede +2 em Atualidades, com aplicativos personalizados para hackear outros aparelhos (modificação função adicional, fornecendo +2 em Tecnologia) e que funciona como um kit de tecnologia (modificação instrumental). Este será um item de categoria III. Cada modificação só pode ser aplicada ao mesmo acessório uma vez."));

rules.add(new Rule("INVESTIGAÇÃO", "Os agentes da Ordem são treinados para neutralizar ameaças paranormais, sejam elas zumbis de Sangue ou espectros de Energia, mas geralmente existe um longo processo que antecede o confronto com essas forças. Agentes precisam ser capazes de investigar locais, interrogar testemunhas e interpretar pistas para desvendar os casos que chegam até a Ordem."));

rules.add(new Rule("CENAS DE INVESTIGAÇÃO", "São um tipo especial de cena onde os personagens buscam pistas interagindo com o ambiente e NPCs. A cena começa quando o mestre a inicia, descrevendo os objetos e pessoas presentes. Jogadores podem perguntar sobre interações possíveis e devem usar habilidades, equipamentos e criatividade para desvendar o caso. O mestre deve incentivar a criatividade e boas ideias dos jogadores."));

rules.add(new Rule("COMBATE", "Embora seja possível superar obstáculos e vencer inimigos de muitas formas, às vezes os agentes ficam sem escolha além de sacar suas armas e partir para o confronto direto."));

rules.add(new Rule("Teste de Ataque", "Este é um tipo específico de teste de perícia, para acertar um alvo com um ataque. Normalmente é um teste de Luta, para um ataque corpo a corpo, ou de Pontaria, para um ataque à distância. A DT é a Defesa do alvo. Se o resultado é igual ou maior que a Defesa do alvo, você acerta e causa dano (veja Dano, a seguir).Um teste de ataque pode sofrer modificadores por habilidades, arma e condições."));

rules.add(new Rule("Dano", "Ao acertar um ataque, role dados para determinar o dano causado, conforme a arma utilizada. Por exemplo, uma faca causa 1d4 de dano e uma pistola causa 1d12. Para ataques corpo a corpo ou com armas de arremesso, adicione seu valor de Força à rolagem de dano. Por exemplo, uma espada causa 1d8 de dano e, com Força 2, o total seria 1d8+2."));

rules.add(new Rule("Acertos Críticos", "Ocorre quando um ataque é excepcionalmente preciso. Cada arma tem uma margem de ameaça (18, 19 ou 20) e um multiplicador (x2, x3 ou x4)."));

rules.add(new Rule("Margem de Ameaça", "O ataque é crítico se o valor rolado for igual ou maior que a margem de ameaça da arma."));

rules.add(new Rule("Multiplicador", "O dano é multiplicado pelo multiplicador da arma (x2, x3, x4), mas bônus numéricos e dados extras não são multiplicados."));

rules.add(new Rule("Imunidade", "Alguns seres são imunes a acertos críticos, sofrendo apenas o dano normal do ataque."));

rules.add(new Rule("RITUAIS - CUSTO", "1° Circulo = 2PE<br>" +
"2° Circulo = 3PE<br>" +
"3° Circulo = 6PE<br>" +
"4° Circulo = 10PE<br>" +
"5° Circulo = ???"));

rules.add(new Rule("INICIATIVA", "Teste de Iniciativa: Cada jogador faz um teste no início do combate. O mestre faz um teste para todos os inimigos, usando o menor bônus de Iniciativa se houver variação. Quem obtém os resultados mais altos age primeiro. Em caso de empate, rola-se novamente entre os empatados para desempatar."));

rules.add(new Rule("Tipos de Ações", "Ação Padrão: Realiza uma tarefa principal, como atacar ou conjurar um ritual.<br>" +
                "|| Ação de Movimento: Permite movimentar-se uma distância igual ao seu deslocamento, levantar-se, sacar uma arma, entre outros.<br>" + 
                "|| Ação Completa: Troca sua ação padrão e de movimento para realizar uma ação que exige todo o esforço da rodada. Permite ações extras, livres e reações.<br>" + 
                "|| Ação Livre: Requer pouco tempo e esforço, como dar uma ordem curta ou fazer uma breve ação. Pode ser feita em seu turno e não deve ser confusa ou complexa.<br>" +
                "|| Reação: Uma reação acontece em resposta a outra coisa. Como ações livres, reações tomam tão pouco tempo que você pode realizar qualquer quantidade delas. A diferença é que uma ação livre é uma escolha consciente, executada no turno do personagem. Já uma reação é um reflexo ou uma resposta automáTica, que pode ocorrer mesmo fora do seu turno. Você pode reagir mesmo se não puder realizar ações normais, como quando estiver atordoado. Um teste de Percepção para perceber um assassino escondido no estacionamento, ou um teste de Reflexos para escapar de uma explosão, são exemplos de reações. No entanto, algumas reações especiais, como bloqueios e esquivas, são uma exceção à regra. "));

rules.add(new Rule("FERIMENTOS & MORTE", "Quando você sofre dano — sendo esfaqueado por um cultista, caindo de um carro em movimento etc. —, perde pontos de vida. Você anota seus PV na ficha de personagem ou em qualquer papel de rascunho. O dano pode deixar cicatrizes e sujar sua roupa de sangue, mas não o impede de agir. Isso só muda quando seus PV chegam a 0 (não existem PV negativos)."));

rules.add(new Rule("INSANIDADE & LOUCURA", "Quando você sofre dano mental, perde pontos de Sanidade. Isso representa ter seu psicológico abalado, em vez de sua saúde física. Assim como dano normal, o dano mental não o impede de agir — a menos que sua Sanidade chegue a 0 (não existe Sanidade negativa)."));

rules.add(new Rule("MOVIMENTAÇÃO", "Deslocamento. Esta é a medida de quantos metros você pode percorrer com uma ação de movimento. O deslocamento padrão é 9m, mas algumas habilidades podem mudá-lo"));

rules.add(new Rule("INTERLÚDIO", "São momentos de pausa em que os personagens não estão envolvidos em ação ou investigação. Elas permitem que os jogadores e personagens descansem, reflitam sobre as pistas descobertas e planejem os próximos passos. Essas cenas ocorrem em locais seguros, como esconderijos ou hotéis, e não têm uma duração específica. O mestre decide quando uma cena de interlúdio começa e termina, e também pode decidir se os jogadores podem forçar um interlúdio e sob quais condições. Forçar muitos interlúdios pode aumentar a urgência das próximas cenas de investigação."));

rules.add(new Rule("O ESTADO DA MEMBRANA", "Intacta: Estado original e perfeito da Membrana. Nenhuma manifestação paranormal pode ocorrer. Se uma manifestação paranormal invade, o ambiente se torna estável. É extremamente raro e não se sabe como um local se torna intacto." + 
                "<br>" + 
                "|| Estável: Estado seguro. Nenhuma criatura pode se manifestar e apenas rituais de 1º círculo podem ser conjurados. Criaturas podem invadir se originadas de outro local. A recuperação de danificada para estável leva muitos anos sem fontes de Medo." + 
                "<br>" + 
                "|| Danificada: Estado comum onde todos os rituais e poderes paranormais são possíveis. Criaturas de até 300 VD podem se manifestar, e as de mais de 300 VD podem entrar se tiverem vindo de um local arruinado ou rompido.\n" + //
                "<br>" + 
                "|| Arruinada: Estado catastrófico e ilógico. Rituais são conjurados em sua versão Verdadeira, e qualquer criatura pode se manifestar e é mais poderosa. Personagens sofrem dano mental de 1d6 no início de cada cena. A realidade se distorce e o ambiente é enlouquecedor." + 
                "<br>" + 
                "|| Rompida: Estado hipotético, nunca registrado. Seria um lugar sem regras, totalmente dominado pelo Outro Lado. A existência de um local rompido é temida, mas sua natureza é desconhecida."));

rules.add(new Rule("EXPOSIÇÃO PARANORMAL", "O NEX mede o impacto psicológico e físico de uma pessoa devido ao envolvimento com o Outro Lado. É uma porcentagem que varia de 0% a 99%. Pessoas que nunca testemunharam manifestações paranormais têm 0% de NEX. À medida que uma pessoa tem mais experiências com o paranormal, seu NEX aumenta, refletindo a construção de memórias das entidades e o fortalecimento do vínculo com o Outro Lado. Esse vínculo pode se intensificar ainda mais se a pessoa participar de um ritual de Transcender."));

rules.add(new Rule("EXPOSIÇÃO PARANORMAL - TRANSCENDER", "Ao atingir um determinado nível de NEX, você pode sentir um chamado e, ao responder a esse chamado, realizar o ritual de Transcender. Este ritual é o primeiro criado e permite uma conexão completa com o Outro Lado. Para realizar o ritual, você desenha o símbolo de Transcender no chão, posiciona-se dentro dele e se concentra. Isso faz com que sua mente se desloque da Realidade e se conecte completamente com o Outro Lado, realizando um processo introspectivo oposto ao que as entidades fazem para se manifestar na Realidade."));

rules.add(new Rule("EXPOSIÇÃO PARANORMAL - AFINIDADE", "Ao atingir 50% de NEX, você se conecta automaticamente a uma das entidades do Outro Lado, escolhendo um elemento: Conhecimento, Energia, Morte ou Sangue. Esta escolha é permanente e não pode ser alterada. A conexão não tem efeitos imediatos, mas quando você recebe um poder paranormal, ela se torna uma afinidade com o elemento escolhido. A afinidade resulta em mudanças na sua personalidade e aparência, permite a conjuração de rituais desse elemento sem componentes ritualísticos e possibilita o aprendizado de certos rituais específicos para esse elemento."));

rules.add(new Rule("SANIDADE PT.2", "A mente humana, adaptada para lidar com a Realidade, tem limites frente ao Outro Lado. Sanidade mede a resiliência mental e sua perda pode ser tão grave quanto a morte física. Em Remier RPG, personagens começam com um valor fixo de Sanidade, ajustado por NEX e classe, sendo os ocultistas os mais preparados devido ao seu estudo do Outro Lado."));

rules.add(new Rule("SANIDADE - DANO MENTAL", "Sanidade funciona como resiliência e reserva de poder, similar a PV e PE. Dano mental reduz Sanidade em vez de PV e é difícil de mitigar, tornando-o altamente letal. Resistência mental é rara e pode ser aumentada por itens amaldiçoados ou outros efeitos."));

rules.add(new Rule("SANIDADE - INSANIDADE", "Quando um personagem sofre muito dano mental, ele começa a ficar insano devido ao conflito entre a Realidade e o Outro Lado. Isso se manifesta em três condições: perturbado, enlouquecido e insano." + 
                "<br>" +
                "|| Perturbado: Com menos da metade de SAN, a percepção do mundo se torna distorcida, com alucinações e confusão. Não há efeitos mecânicos diretos, mas pode ser interpretado para adicionar profundidade à narrativa.<br>" + 
                "|| Enlouquecido: Quando SAN chega a 0, o personagem deve ser estabilizado em três rodadas ou se tornará insano. Um personagem insano tem a mente completamente deteriorada e se torna injogável. Mesmo estabilizado, os efeitos de insanidade temporária persistem até o final da missão."));

rules.add(new Rule("PODERES PARANORMAIS", "Ao escolher o poder de classe Transcender, você realiza um ritual para se conectar ao Outro Lado e ganha um poder paranormal, mas não recebe o aumento de Sanidade correspondente ao aumento de NEX. É necessário cumprir todos os pré-requisitos para escolher um poder paranormal, e, a menos que indicado de outra forma, cada poder só pode ser escolhido uma vez. Alguns poderes exigem que você já possua outros poderes do mesmo tipo."));

rules.add(new Rule("RITUAIS", "Os rituais são a forma mais eficaz de contatar o Outro Lado, permitindo criar manifestações breves de elementos na Realidade. Ao conjurar um ritual, você se comunica com uma entidade do Outro Lado através de sigilos específicos e concentrações para obter uma resposta na forma de uma manifestação paranormal."));

rules.add(new Rule("RITUAIS - Círculos", "Rituais são classificados em círculos de 1º a 4º, que indicam a complexidade e o poder do ritual. Rituais de 1º círculo têm efeitos simples, enquanto rituais de 4º círculo são extremamente poderosos e complexos."));

rules.add(new Rule("RITUAIS - Elementos", "Rituais pertencem a um dos cinco elementos do Outro Lado: Conhecimento, Energia, Morte, Sangue ou Medo. Cada elemento se manifesta de forma distinta na Realidade e os rituais de um mesmo elemento tendem a ter efeitos semelhantes."));

rules.add(new Rule("RITUAIS - APRENDENDO RITUAIS", "Qualquer personagem pode aprender rituais com o poder paranormal Aprender Ritual, limitado pelo valor do seu Intelecto."));

rules.add(new Rule("ITENS AMALDIÇOADOS", "Itens amaldiçoados são objetos com influência do Outro Lado, capazes de criar manifestações paranormais. Eles são muito raros e cobiçados. Esses itens se dividem em duas categorias:" + 
                "<br>" + 
                "|| Armas, Proteções e Acessórios: Possuem maldições que funcionam como modificações, oferecendo benefícios ao item, mas também aumentando sua categoria.\n" + //
                "<br>" + 
                "|| Itens Especiais: Têm mecânicas próprias que variam de acordo com o item."));

rules.add(new Rule("ITENS AMALDIÇOADOS - ADQUIRINDO ITENS AMALDIÇOADOS", "A Ordem possui itens amaldiçoados que são disponibilizados para agentes de alta patente. Esses itens podem ser escolhidos como armas, proteções e acessórios amaldiçoados, da mesma forma que itens modificados. Cada item pode ter várias maldições, mas: Não pode ter maldições de elementos opressores. Maldições iguais não se acumulam. A primeira maldição aumenta a categoria do item em II, e as subsequentes em I. Itens amaldiçoados podem ter modificações e maldições, e seus bônus e ajustes de categoria se acumulam. Itens amaldiçoados especiais podem ser escolhidos como equipamento mundano, respeitando o limite de categoria do equipamento. Esses itens são restritos a agentes especiais, oficiais de operações e agentes de elite, independentemente de suas categorias."));

rules.add(new Rule("ITENS AMALDIÇOADOS - USANDO ITENS AMALDIÇOADOS", "Armas e proteções funcionam automaticamente: basta empunhar ou vestir o item para que seus poderes funcionem. Itens especiais devem ser ativados, de acordo com sua descrição. Acessórios existem em ambos os tipos — alguns funcionam automaticamente quando empunhados ou vestidos, outros devem ser ativados, de acordo com sua descrição. Via de regra, itens que precisam ser ativados precisam antes ser identificados (veja a perícia Ocultismo). Para itens que exigem um teste de resistência do alvo, use o mesmo cálculo de DT de habilidades (veja a página 78), usando Presença como atributo. Conjurar rituais a partir de itens não exige gestos ou componentes ritualísticos. Você pode usar versões avançadas do ritual, mas precisa pagar o custo adicional delas (mesmo quando o ritual básico puder ser conjurado sem custo) e cumprir quaisquer pré-requisitos."));

rules.add(new Rule("ITENS AMALDIÇOADOS ESPECIAIS", "Objetos variados, cada um com suas próprias regras. Exceto quando indicado o contrário, contam como itens de categoria II e ocupam 1 espaço. Para efeitos relacionados à sua quantidade de maldições (como pontos de vida e preço da maldição), contam como possuindo uma maldição."));

                return rules;
    }}