🚀 Bootcamp Manager - Sistema Educacional em Java
https://img.shields.io/badge/Java-17%252B-blue
https://img.shields.io/badge/Paradigma-Orientado%2520a%2520Objetos-green


Um sistema completo para gerenciamento de bootcamps de programação, desenvolvido em Java seguindo os princípios de Orientação a Objetos.

📋 Índice
Visão Geral

Funcionalidades

Tecnologias

Como Executar

Estrutura do Projeto

Exemplos de Uso

Regras de XP

Licença

🌐 Visão Geral
O Bootcamp Manager é um sistema que simula um ambiente educacional para desenvolvedores, permitindo:

Criação de bootcamps com diversos conteúdos

Inscrição de desenvolvedores

Acompanhamento de progresso

Cálculo automático de experiência (XP)

🎯 Funcionalidades
Principais Componentes
Componente	Descrição
Bootcamp	Contêiner para cursos e mentorias com datas específicas
Curso	Conteúdo educacional com carga horária definida
Mentoria	Evento pontual com data específica
Dev	Participante do bootcamp com progresso rastreado
Fluxos Implementados
Inscrição em Bootcamp

Desenvolvedores se inscrevem em todos os conteúdos do bootcamp

Bootcamp registra os desenvolvedores inscritos

Progressão

Conteúdos são movidos de "inscritos" para "concluídos"

XP é calculado automaticamente

Relatórios

Listagem de conteúdos por status

Cálculo de XP total adquirido

⚙️ Tecnologias
Linguagem: Java 17+

Paradigma: Orientação a Objetos

Estruturas de Dados:

Set (HashSet, LinkedHashSet)

Optional

Temporal: LocalDate

Princípios SOLID aplicados

🚀 Como Executar
Pré-requisitos
JDK 17+ instalado

Git (opcional)

Passo a Passo
Clone o repositório:

bash
git clone https://github.com/Meletinho/desafio-poo-java.git
Navegue até o diretório:

bash
cd desafio-poo-java
Compile o projeto:

bash
javac -d bin src/br/com/dio/desafio/*.java src/Main.java
Execute:

bash
java -cp bin Main


💻 Exemplos de Uso
Criando um Bootcamp
java
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Java Developer");
bootcamp.setDescricao("Bootcamp completo de Java");

Curso curso1 = new Curso();
curso1.setTitulo("Java Básico");
curso1.setCargaHoraria(8);

bootcamp.getConteudos().add(curso1);
Inscrição e Progressão
java
Dev dev = new Dev();
dev.setNome("Maria");
dev.inscreverBootcamp(bootcamp);

// Progride nos conteúdos
dev.progredir();
dev.progredir();

System.out.println("XP total: " + dev.calcularTotalXp());
📊 Regras de XP
Tipo de Conteúdo	Fórmula de XP	Exemplo
Curso	10 * cargaHoraria	8h → 80 XP
Mentoria	30 XP (fixo)	1 mentoria → 30 XP
